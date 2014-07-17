package com.zjlsdm.twodimensionalworld.task;

import com.zjlsdm.twodimensionalworld.util.NetTool;

import android.os.AsyncTask;
import android.util.Log;

public class GetDataTask extends AsyncTask<String, String, String>{
	private String dataUrl;
	
	public GetDataTask(String dataUrl){
		this.dataUrl = dataUrl;
	}

	@Override
	protected String doInBackground(String... params) {
		try {
			String getHtml = NetTool.sendTxt(dataUrl);
			Log.e("++++", getHtml);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	

}
