package upa.jiangnan.care.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import upa.jiangnan.care.R;
import upa.jiangnan.care.dbservice.DatabaseHelper;

public class MemoData {

	private DatabaseHelper databaseHelper;
	private SQLiteDatabase db;

	public MemoData(Context context) {
		databaseHelper = new DatabaseHelper(context);
		db = databaseHelper.getWritableDatabase();
	}

	public void insertMemoData() {
		// 第一条数据
		ContentValues values_1 = new ContentValues();
		values_1.put("memo_title", "术前准备");
		values_1.put("memo_detail", R.string.memo_data);
		values_1.put("memo_date_time", "2014-09-10 13:20");
		db.insert("memo", null, values_1);

		// 第二条数据
		ContentValues values_2 = new ContentValues();
		values_2.put("memo_title", "采集血样，血样检查");
		values_2.put("memo_detail",R.string.memo_data);
		values_2.put("memo_date_time", "2014-08-03 12:20");
		db.insert("memo", null, values_2);

		// 第三条数据
		ContentValues values_3 = new ContentValues();
		values_3.put("memo_title", "术后护理");
		values_3.put("memo_detail",R.string.memo_data);
		values_3.put("memo_date_time", "2014-09-10 10:20");
		db.insert("memo", null, values_3);

		// 第四条数据
		ContentValues values_4 = new ContentValues();
		values_4.put("memo_title", "术前注意事项提醒");
		values_4.put("memo_detail",R.string.memo_data);
		values_4.put("memo_date_time", "2014-08-03 15:30");
		db.insert("memo", null, values_4);

		// 第五条数据
		ContentValues values_5 = new ContentValues();
		values_5.put("memo_title", "术前宣教");
		values_5.put("memo_detail",R.string.memo_data);
		values_5.put("memo_date_time", "2014-09-10 13:20");
		db.insert("memo", null, values_5);

		// 第六条数据
		ContentValues values_6 = new ContentValues();
		values_6.put("memo_title", "术后宣教");
		values_6.put("memo_detail",R.string.memo_data);
		values_6.put("memo_date_time", "2014-09-10 07:20");
		db.insert("memo", null, values_6);

	}
}
