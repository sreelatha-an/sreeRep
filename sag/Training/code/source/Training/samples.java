package Training;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class samples

{
	// ---( internal utility methods )---

	final static samples _instance = new samples();

	static samples _newInstance() { return new samples(); }

	static samples _cast(Object o) { return (samples)o; }

	// ---( server methods )---




	public static final void addInts (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(addInts)>> ---
		// @sigtype java 3.5
		// [i] record:0:required Input
		// [i] - field:0:required in1
		// [i] - field:0:required in2
		// [o] record:0:required OUTPut
		// [o] - field:0:required out
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		
			// Input
			IData	Input = IDataUtil.getIData( pipelineCursor, "Input" );
			int result = 0;
			if ( Input != null)
			{
				IDataCursor InputCursor = Input.getCursor();
					int	in1 = Integer.parseInt(IDataUtil.getString( InputCursor, "in1" ));
					int	in2 = Integer.parseInt(IDataUtil.getString( InputCursor, "in2" ));
					result = in1+in2;
				InputCursor.destroy();
			}
		//pipelineCursor.destroy();
		
		// pipeline
		//IDataCursor pipelineCursor_1 = pipeline.getCursor();
		
		// OUTPut
		IData	OUTPut = IDataFactory.create();
		IDataCursor OUTPutCursor = OUTPut.getCursor();
		IDataUtil.put( OUTPutCursor, "out", result+"");
		OUTPutCursor.destroy();
		IDataUtil.put( pipelineCursor, "OUTPut", OUTPut );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void concatStr (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(concatStr)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str2
		// [i] field:0:required str1
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	str2 = IDataUtil.getString( pipelineCursor, "str2" );
			String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
		//pipelineCursor.destroy();
		
		// pipeline
		//IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", str1+str2 );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}
}

