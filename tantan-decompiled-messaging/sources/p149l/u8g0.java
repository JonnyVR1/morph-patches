package p149l;

import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.SudInitSDKParamModel;
import tech.sud.gip.core.network.detection.INetworkDetectionListener;
import tech.sud.gip.core.network.detection.NetworkDetectionDetail;
import tech.sud.gip.core.network.detection.NetworkDetectionResult;
import tech.sud.gip.core.network.detection.NetworkDetectionStep;
import tech.sud.gip.core.network.detection.NetworkDetectionStepResult;
import tech.sud.gip.core.network.detection.SudNetworkDetectionParamModel;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class u8g0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public SudNetworkDetectionParamModel f175127a;

    /* JADX INFO: renamed from: b */
    public INetworkDetectionListener f175128b;

    /* JADX INFO: renamed from: c */
    public final q7g0 f175129c;

    /* JADX INFO: renamed from: d */
    public boolean f175130d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f175131e;

    /* JADX INFO: renamed from: f */
    public int f175132f;

    /* JADX INFO: renamed from: g */
    public int f175133g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f175134h;

    /* JADX INFO: renamed from: i */
    public int f175135i;

    /* JADX INFO: renamed from: j */
    public mcg0 f175136j;

    public u8g0(SudNetworkDetectionParamModel sudNetworkDetectionParamModel, INetworkDetectionListener iNetworkDetectionListener) {
        new Handler(Looper.getMainLooper());
        this.f175129c = new q7g0(this);
        this.f175131e = new ArrayList();
        this.f175134h = new ArrayList();
        this.f175127a = sudNetworkDetectionParamModel;
        this.f175128b = iNetworkDetectionListener;
        this.f175136j = new mcg0("networkDetection");
    }

    /* JADX INFO: renamed from: a */
    public final void m192194a() {
        final zig0 zig0Var = new zig0();
        zig0Var.f203328b = "getFqs";
        NetworkDetectionStep networkDetectionStep = zig0Var.f203327a;
        int i = this.f175135i + 1;
        this.f175135i = i;
        networkDetectionStep.identifier = i;
        networkDetectionStep.protocol = "https";
        networkDetectionStep.method = "GET";
        this.f175131e.add(zig0Var);
        final qfg0 qfg0Var = new qfg0(zig0Var.f203327a);
        final zig0 zig0Var2 = new zig0();
        zig0Var2.f203328b = "getSdkToken";
        NetworkDetectionStep networkDetectionStep2 = zig0Var2.f203327a;
        int i2 = this.f175135i + 1;
        this.f175135i = i2;
        networkDetectionStep2.identifier = i2;
        networkDetectionStep2.protocol = "https";
        networkDetectionStep2.method = "GET";
        this.f175131e.add(zig0Var2);
        final qfg0 qfg0Var2 = new qfg0(zig0Var2.f203327a);
        ThreadUtils.postUITask(new Runnable() { // from class: l.p8g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f147599a.m192196c(zig0Var, qfg0Var, zig0Var2, qfg0Var2);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m192195b(int i, String str) {
        NetworkDetectionResult networkDetectionResult = new NetworkDetectionResult();
        networkDetectionResult.code = i;
        networkDetectionResult.msg = str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f175131e;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList.add(((zig0) obj).f203327a.deepCopy());
        }
        networkDetectionResult.stepList = arrayList;
        INetworkDetectionListener iNetworkDetectionListener = this.f175128b;
        if (iNetworkDetectionListener != null) {
            iNetworkDetectionListener.onCompleted(networkDetectionResult);
        }
        m192197d(networkDetectionResult);
        this.f175127a = null;
        this.f175128b = null;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m192196c(zig0 zig0Var, qfg0 qfg0Var, zig0 zig0Var2, qfg0 qfg0Var2) {
        SudInitSDKParamModel sudInitSDKParamModel = new SudInitSDKParamModel();
        SudNetworkDetectionParamModel sudNetworkDetectionParamModel = this.f175127a;
        if (sudNetworkDetectionParamModel != null) {
            sudInitSDKParamModel.context = sudNetworkDetectionParamModel.context;
            sudInitSDKParamModel.appId = sudNetworkDetectionParamModel.appId;
            sudInitSDKParamModel.appKey = sudNetworkDetectionParamModel.appKey;
            sudInitSDKParamModel.isTestEnv = sudNetworkDetectionParamModel.isTestEnv;
            sudInitSDKParamModel.userId = sudNetworkDetectionParamModel.userId;
        }
        mlg0.m155143b(sudInitSDKParamModel, new tlg0(this, zig0Var, qfg0Var, zig0Var2, qfg0Var2), qfg0Var, qfg0Var2);
    }

    /* JADX INFO: renamed from: d */
    public final void m192197d(NetworkDetectionResult networkDetectionResult) {
        if (this.f175136j == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = this.f175131e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zig0 zig0Var = (zig0) obj;
            zig0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, zig0Var.f203328b);
                jSONObject.put("url", zig0Var.f203329c);
                jSONObject.put("identifier", zig0Var.f203327a.identifier);
                jSONObject.put("protocol", zig0Var.f203327a.protocol);
                jSONObject.put(FirebaseAnalytics.Param.METHOD, zig0Var.f203327a.method);
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, zig0Var.f203327a.status);
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < zig0Var.f203327a.detailList.size(); i2++) {
                    NetworkDetectionDetail networkDetectionDetail = zig0Var.f203327a.detailList.get(i2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", networkDetectionDetail.type);
                    jSONObject2.put("timestamp", networkDetectionDetail.timestamp);
                    jSONArray2.put(jSONObject2);
                }
                jSONObject.put("detailList", jSONArray2);
                NetworkDetectionStepResult networkDetectionStepResult = zig0Var.f203327a.result;
                if (networkDetectionStepResult != null) {
                    jSONObject.put(LovePlanetStage.result, networkDetectionStepResult.toJsonObject());
                }
            } catch (Exception e) {
                LogUtils.file("InnelNetworkDetectionStep", "jsonError:" + LogUtils.getErrorInfo(e));
            }
            jSONArray.put(jSONObject);
        }
        this.f175136j.f133120j.put("stepList", jSONArray);
        mcg0 mcg0Var = this.f175136j;
        mcg0Var.f133115e = networkDetectionResult.code;
        String str = networkDetectionResult.msg;
        if (str != null) {
            mcg0Var.f133116f = str;
        }
        xlg0.m209889b(mcg0Var);
        this.f175136j = null;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m192198e() {
        INetworkDetectionListener iNetworkDetectionListener = this.f175128b;
        if (iNetworkDetectionListener != null) {
            iNetworkDetectionListener.onStarted();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m192199f() {
        NetworkDetectionResult networkDetectionResult = new NetworkDetectionResult();
        int i = 0;
        networkDetectionResult.code = 0;
        networkDetectionResult.msg = "success";
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f175131e;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((zig0) obj).f203327a.deepCopy());
        }
        networkDetectionResult.stepList = arrayList;
        INetworkDetectionListener iNetworkDetectionListener = this.f175128b;
        if (iNetworkDetectionListener != null) {
            iNetworkDetectionListener.onCompleted(networkDetectionResult);
        }
        m192197d(networkDetectionResult);
        this.f175127a = null;
        this.f175128b = null;
    }

    /* JADX INFO: renamed from: g */
    public final void m192200g(final int i, final String str) {
        ThreadUtils.postUITask(new Runnable() { // from class: l.r8g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f158216a.m192195b(i, str);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m192201h() {
        ThreadUtils.postUITask(new Runnable() { // from class: l.s8g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f163059a.m192199f();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m192202i() {
        ThreadUtils.postUITask(new Runnable() { // from class: l.q8g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f153192a.m192198e();
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f175130d) {
            return;
        }
        m192202i();
        m192194a();
    }
}
