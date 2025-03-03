package com.yiku.kdb_flat.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.gprinter.service.GpPrintService;

public class DeviceBootReceiver extends BroadcastReceiver {
		   /**开机广播**/
		 static final String BOOT_COMPLETED = "android.intent.action.BOOT_COMPLETED";
		/** {@inheritDoc} */
			@Override
			public void onReceive(Context context, Intent intent) {
		        if (intent.getAction().equals(BOOT_COMPLETED)) {
					try {
						Intent i = new Intent(context, GpPrintService.class);
						context.startService(i);
						Log.i("DeviceBootReceiver", "GpPrintService.start");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
		}
}
