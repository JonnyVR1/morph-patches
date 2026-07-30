package com.tantanapp.beatles;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.beatles.utils.DeviceUtil;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.JSONObject;
import p153l.du2;
import p153l.m1m;
import p153l.vc60;

/* JADX INFO: loaded from: classes11.dex */
public class BeatlesProvider extends ContentProvider {
    public static final String AUTOHORITY = "com.tantanapp.beatles.beatles_provider";
    private static final int DEVICE_INFO_CODE = 2;
    private static final int NET_STATS_CODE = 3;
    private static final int PID_CODE = 1;
    private static String flavor;
    private static String pullId;
    private UriMatcher mMatcher;
    final String TAG = BeatlesProvider.class.getSimpleName();
    final String[] PID_COLUMN_NAMES = {"timestamp", "page_name"};
    final String[] INFO_COLUMN_NAMES = {"systemVersion", "versionName", "versionCode", "manufacturer", "model", "ram", "cpu", Constants.DEVICE_ID_TAG, "isLocal", "buildType", "isTanker", "pullId", "flavor"};
    final String[] NET_STATS_COLUMN_NAMES = new String[0];

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Log.e(this.TAG, "PIDProvider onCreate()");
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.mMatcher = uriMatcher;
        uriMatcher.addURI(AUTOHORITY, "pid/#", 1);
        this.mMatcher.addURI(AUTOHORITY, "device_info/#", 2);
        this.mMatcher.addURI(AUTOHORITY, "net_stats/#", 3);
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) throws Throwable {
        Log.e(this.TAG, "PIDProvider query:" + uri + "  watch Pid:" + du2.m118054n().f201822d);
        int iMatch = this.mMatcher.match(uri);
        BufferedReader bufferedReader = null;
        if (iMatch == -1 || ContentUris.parseId(uri) != du2.m118054n().f201822d) {
            return null;
        }
        if (iMatch == 1) {
            MatrixCursor matrixCursor = new MatrixCursor(this.PID_COLUMN_NAMES);
            matrixCursor.addRow(new Object[]{Long.valueOf(System.currentTimeMillis()), du2.m118056p().m110248d().mo132266c()});
            return matrixCursor;
        }
        if (iMatch != 2) {
            if (iMatch != 3) {
                return null;
            }
            MatrixCursor matrixCursor2 = new MatrixCursor(this.NET_STATS_COLUMN_NAMES);
            matrixCursor2.addRow(new Object[]{"ERROR"});
            return matrixCursor2;
        }
        MatrixCursor matrixCursor3 = new MatrixCursor(this.INFO_COLUMN_NAMES);
        if (pullId == null || flavor == null) {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(du2.m118045e().getAssets().open("config/config.json")));
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        }
                        JSONObject jSONObject = new JSONObject(sb.toString());
                        pullId = jSONObject.optString("pullId");
                        flavor = jSONObject.optString("flavor");
                        m1m.m156698a(bufferedReader2);
                    } catch (Exception e) {
                        e = e;
                        bufferedReader = bufferedReader2;
                        e.printStackTrace();
                        m1m.m156698a(bufferedReader);
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        m1m.m156698a(bufferedReader);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        matrixCursor3.addRow(new Object[]{DeviceUtil.m82401k(), vc60.m200791f(), Integer.valueOf(vc60.m200790e()), DeviceUtil.m82395e(), DeviceUtil.m82397g(), Double.valueOf(DeviceUtil.m82403m(du2.m118045e())), DeviceUtil.m82391a(), du2.m118056p().m110248d().mo132264a(), Boolean.valueOf(du2.m118054n().f201819a), du2.m118054n().f201821c, Boolean.valueOf(du2.m118054n().f201820b), pullId, flavor});
        return matrixCursor3;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
