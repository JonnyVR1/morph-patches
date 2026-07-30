package p149l;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.clevertap.android.sdk.Constants;
import com.immomo.mmutil.log.Log4Android;
import com.p046p1.mobile.putong.core.data.Portrait;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class byd extends fnl {

    /* JADX INFO: renamed from: l.byd$b */
    public class DialogInterfaceOnClickListenerC16012b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f77906a;

        public DialogInterfaceOnClickListenerC16012b(String str) {
            this.f77906a = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            byd.this.m122322a().startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + this.f77906a)));
        }
    }

    public byd(MKWebView mKWebView) {
        super(mKWebView);
    }

    @Override // p149l.fnl
    /* JADX INFO: renamed from: h */
    public boolean mo104437h(String str, String str2, JSONObject jSONObject) {
        if (!TextUtils.equals(str, Device.TYPE) || m122322a() == null) {
            return false;
        }
        str2.getClass();
        switch (str2) {
            case "callPhone":
                return m104438i(jSONObject);
            case "getScreenInfo":
                JSONObject jSONObjectM104439j = m104439j();
                m122324c(jSONObject.optString("callback"), jSONObjectM104439j == null ? "" : jSONObjectM104439j.toString());
                return true;
            case "getNetworkType":
                String strOptString = jSONObject.optString("callback");
                String strM158571b = na20.m158571b();
                if (TextUtils.isEmpty(strM158571b)) {
                    strM158571b = "none";
                }
                m122324c(strOptString, liw.m149941b(new String[]{"network_type"}, new String[]{strM158571b}).toString());
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m104438i(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("phoneNumber");
            if (jSONObject.optInt(BLiveVoiceSingTogehterState.confirm) != 0) {
                new AlertDialog.Builder(m122322a()).setTitle("Alert").setMessage("是否拨打电话").setPositiveButton("OK", new DialogInterfaceOnClickListenerC16012b(strOptString)).setNegativeButton("NO", new DialogInterfaceOnClickListenerC16011a()).create().show();
                return true;
            }
            m122322a().startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + strOptString)));
            return true;
        } catch (Exception e) {
            Log4Android.m18417f().m18422e(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public JSONObject m104439j() {
        try {
            DisplayMetrics displayMetricsM184284d = shw.m184284d();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceWidth", displayMetricsM184284d.widthPixels);
            jSONObject.put("deviceHeight", displayMetricsM184284d.heightPixels);
            jSONObject.put("width", displayMetricsM184284d.heightPixels);
            jSONObject.put("height", displayMetricsM184284d.heightPixels);
            jSONObject.put(Constants.KEY_ORIENTATION, shw.m184289i().getConfiguration().orientation == 1 ? Portrait.TYPE : "landscape");
            jSONObject.put("density", displayMetricsM184284d.density);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l.byd$a */
    public class DialogInterfaceOnClickListenerC16011a implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC16011a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }
}
