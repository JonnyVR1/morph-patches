package p153l;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.common.thread.C3486c;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/hk3;", "Ll/ul8;", "Ll/hul;", "pMkWebview", "<init>", "(Ll/hul;)V", "Lorg/json/JSONObject;", CommandMessage.PARAMS, "", BaseSei.f14624X, "(Lorg/json/JSONObject;)V", "", "namespace", FirebaseAnalytics.Param.METHOD, "", "p", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Z", BaseSei.f14625Y, "w", "(Lorg/json/JSONObject;)Z", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class hk3 extends ul8 {

    /* JADX INFO: renamed from: l.hk3$a */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m88121d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class DialogInterfaceOnClickListenerC17482a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f110366b;

        public DialogInterfaceOnClickListenerC17482a(String str) {
            this.f110366b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + this.f110366b));
            Context contextM177460c = hk3.this.m177460c();
            if (contextM177460c != null) {
                contextM177460c.startActivity(intent);
            }
        }
    }

    /* JADX INFO: renamed from: l.hk3$c */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC17484c implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f110368b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Context f110369c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f110370d;

        public RunnableC17484c(JSONObject jSONObject, Context context, String str) {
            this.f110368b = jSONObject;
            this.f110369c = context;
            this.f110370d = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            try {
                JSONObject jSONObject = new JSONObject();
                Iterator<String> itKeys = this.f110368b.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObjectOptJSONObject = this.f110368b.optJSONObject(next);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("pkg_android");
                        if (i8g0.m139002d(strOptString)) {
                            PackageManager packageManager = this.f110369c.getPackageManager();
                            try {
                                if (Build.VERSION.SDK_INT >= 28) {
                                    packageManager.getPackageInfo(strOptString, 134217728);
                                } else {
                                    packageManager.getPackageInfo(strOptString, 64);
                                }
                                i = 1;
                            } catch (Throwable th) {
                                jzv.m147730c(qpl.f158878b, "", th);
                                i = 0;
                            }
                        } else {
                            i = 0;
                        }
                        jSONObject.put(next, i);
                    }
                }
                hk3 hk3Var = hk3.this;
                String str = this.f110370d;
                if (str == null) {
                    str = "";
                }
                hk3Var.m177463g(str, jSONObject.toString());
            } catch (Exception e) {
                jzv.m147730c(qpl.f158878b, "", e);
            }
        }
    }

    /* JADX INFO: renamed from: l.hk3$d */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m88121d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class DialogInterfaceOnClickListenerC17485d implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f110371a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f110372b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Context f110373c;

        public DialogInterfaceOnClickListenerC17485d(String str, String str2, Context context) {
            this.f110371a = str;
            this.f110372b = str2;
            this.f110373c = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SENDTO");
            intent.setData(Uri.parse("smsto:" + this.f110371a));
            intent.putExtra("sms_body", this.f110372b);
            try {
                this.f110373c.startActivity(intent);
            } catch (Exception unused) {
                t1j0.m188917m("该设备不支持短信息功能,请使用其他手机发送短信");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk3(@NotNull hul hulVar) {
        super(hulVar);
        hulVar.getClass();
    }

    /* JADX INFO: renamed from: x */
    private final void m135612x(JSONObject params) {
        Context contextM177460c = m177460c();
        if (contextM177460c != null) {
            JSONObject jSONObjectOptJSONObject = params != null ? params.optJSONObject("apps") : null;
            String strOptString = params != null ? params.optString("callback") : null;
            if (jSONObjectOptJSONObject == null) {
                return;
            }
            C3486c.m17566d(2, new RunnableC17484c(jSONObjectOptJSONObject, contextM177460c, strOptString));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.ul8, p153l.qpl
    /* JADX INFO: renamed from: p */
    public boolean mo18018p(@Nullable String namespace, @Nullable String method, @Nullable JSONObject params) {
        if (!Intrinsics.m88377d(namespace, Device.TYPE) || m177460c() == null) {
            return false;
        }
        if (method != null) {
            switch (method.hashCode()) {
                case -1060266576:
                    if (method.equals("callPhone")) {
                        return m135613w(params);
                    }
                    break;
                case -1014718591:
                    if (method.equals("checkAppInstalled")) {
                        m135612x(params);
                        return false;
                    }
                    break;
                case 1789030906:
                    if (method.equals("isLockDownMode")) {
                        m177467k(namespace, method, params);
                        return true;
                    }
                    break;
                case 1979901105:
                    if (method.equals("sendSMS")) {
                        if (!sjw.m186319h()) {
                            m135614y(params);
                            return true;
                        }
                        return false;
                    }
                    break;
            }
        }
        return super.mo18018p(namespace, method, params);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m135613w(@Nullable JSONObject params) {
        String strOptString;
        if (params != null) {
            try {
                strOptString = params.optString("phoneNumber");
            } catch (Exception e) {
                jzv.m147730c(qpl.f158878b, "", e);
                return false;
            }
        } else {
            strOptString = null;
        }
        Integer numValueOf = params != null ? Integer.valueOf(params.optInt(BLiveVoiceSingTogehterState.confirm, 0)) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + strOptString));
            Context contextM177460c = m177460c();
            if (contextM177460c == null) {
                return true;
            }
            contextM177460c.startActivity(intent);
            return true;
        }
        Context contextM177460c2 = m177460c();
        if (contextM177460c2 == null) {
            return false;
        }
        new AlertDialog.Builder(contextM177460c2).setTitle("Alert").setMessage("是否拨打电话").setPositiveButton("OK", new DialogInterfaceOnClickListenerC17482a(strOptString)).setNegativeButton("NO", DialogInterfaceOnClickListenerC17483b.INSTANCE).create().show();
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final void m135614y(@Nullable JSONObject params) {
        if (m177460c() == null || this.f158879a == null) {
            return;
        }
        String strOptString = params != null ? params.optString("phoneNumber") : null;
        String strOptString2 = params != null ? params.optString("text") : null;
        Integer numValueOf = params != null ? Integer.valueOf(params.optInt(BLiveVoiceSingTogehterState.confirm, 0)) : null;
        Context contextM177460c = m177460c();
        if (contextM177460c != null) {
            if (numValueOf == null || numValueOf.intValue() != 0) {
                new AlertDialog.Builder(contextM177460c).setTitle("Alert").setMessage("是否发送短信").setPositiveButton("OK", new DialogInterfaceOnClickListenerC17485d(strOptString, strOptString2, contextM177460c)).setNegativeButton("NO", DialogInterfaceOnClickListenerC17486e.INSTANCE).create().show();
                return;
            }
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SENDTO");
            intent.setData(Uri.parse("smsto:" + strOptString));
            intent.putExtra("sms_body", strOptString2);
            try {
                contextM177460c.startActivity(intent);
            } catch (Exception unused) {
                t1j0.m188917m("该设备不支持短信息功能,请使用其他手机发送短信");
            }
        }
    }

    /* JADX INFO: renamed from: l.hk3$b */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m88121d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class DialogInterfaceOnClickListenerC17483b implements DialogInterface.OnClickListener {
        public static final DialogInterfaceOnClickListenerC17483b INSTANCE = new DialogInterfaceOnClickListenerC17483b();

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* JADX INFO: renamed from: l.hk3$e */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m88121d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class DialogInterfaceOnClickListenerC17486e implements DialogInterface.OnClickListener {
        public static final DialogInterfaceOnClickListenerC17486e INSTANCE = new DialogInterfaceOnClickListenerC17486e();

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }
}
