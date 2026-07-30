package p153l;

import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
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
public final class chg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public SudNetworkDetectionParamModel f81803a;

    /* JADX INFO: renamed from: b */
    public INetworkDetectionListener f81804b;

    /* JADX INFO: renamed from: c */
    public final yfg0 f81805c;

    /* JADX INFO: renamed from: d */
    public boolean f81806d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f81807e;

    /* JADX INFO: renamed from: f */
    public int f81808f;

    /* JADX INFO: renamed from: g */
    public int f81809g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f81810h;

    /* JADX INFO: renamed from: i */
    public int f81811i;

    /* JADX INFO: renamed from: j */
    public ukg0 f81812j;

    public chg0(SudNetworkDetectionParamModel sudNetworkDetectionParamModel, INetworkDetectionListener iNetworkDetectionListener) {
        new Handler(Looper.getMainLooper());
        this.f81805c = new yfg0(this);
        this.f81807e = new ArrayList();
        this.f81810h = new ArrayList();
        this.f81803a = sudNetworkDetectionParamModel;
        this.f81804b = iNetworkDetectionListener;
        this.f81812j = new ukg0("networkDetection");
    }

    /* JADX INFO: renamed from: a */
    public final void m109770a() {
        final hrg0 hrg0Var = new hrg0();
        hrg0Var.f111342b = "getFqs";
        NetworkDetectionStep networkDetectionStep = hrg0Var.f111341a;
        int i = this.f81811i + 1;
        this.f81811i = i;
        networkDetectionStep.identifier = i;
        networkDetectionStep.protocol = "https";
        networkDetectionStep.method = "GET";
        this.f81807e.add(hrg0Var);
        final yng0 yng0Var = new yng0(hrg0Var.f111341a);
        final hrg0 hrg0Var2 = new hrg0();
        hrg0Var2.f111342b = "getSdkToken";
        NetworkDetectionStep networkDetectionStep2 = hrg0Var2.f111341a;
        int i2 = this.f81811i + 1;
        this.f81811i = i2;
        networkDetectionStep2.identifier = i2;
        networkDetectionStep2.protocol = "https";
        networkDetectionStep2.method = "GET";
        this.f81807e.add(hrg0Var2);
        final yng0 yng0Var2 = new yng0(hrg0Var2.f111341a);
        ThreadUtils.postUITask(new Runnable() { // from class: l.xgg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f194189a.m109772c(hrg0Var, yng0Var, hrg0Var2, yng0Var2);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m109771b(int i, String str) {
        NetworkDetectionResult networkDetectionResult = new NetworkDetectionResult();
        networkDetectionResult.code = i;
        networkDetectionResult.msg = str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f81807e;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList.add(((hrg0) obj).f111341a.deepCopy());
        }
        networkDetectionResult.stepList = arrayList;
        INetworkDetectionListener iNetworkDetectionListener = this.f81804b;
        if (iNetworkDetectionListener != null) {
            iNetworkDetectionListener.onCompleted(networkDetectionResult);
        }
        m109773d(networkDetectionResult);
        this.f81803a = null;
        this.f81804b = null;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m109772c(hrg0 hrg0Var, yng0 yng0Var, hrg0 hrg0Var2, yng0 yng0Var2) {
        SudInitSDKParamModel sudInitSDKParamModel = new SudInitSDKParamModel();
        SudNetworkDetectionParamModel sudNetworkDetectionParamModel = this.f81803a;
        if (sudNetworkDetectionParamModel != null) {
            sudInitSDKParamModel.context = sudNetworkDetectionParamModel.context;
            sudInitSDKParamModel.appId = sudNetworkDetectionParamModel.appId;
            sudInitSDKParamModel.appKey = sudNetworkDetectionParamModel.appKey;
            sudInitSDKParamModel.isTestEnv = sudNetworkDetectionParamModel.isTestEnv;
            sudInitSDKParamModel.userId = sudNetworkDetectionParamModel.userId;
        }
        utg0.m198034b(sudInitSDKParamModel, new bug0(this, hrg0Var, yng0Var, hrg0Var2, yng0Var2), yng0Var, yng0Var2);
    }

    /* JADX INFO: renamed from: d */
    public final void m109773d(NetworkDetectionResult networkDetectionResult) {
        if (this.f81812j == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = this.f81807e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hrg0 hrg0Var = (hrg0) obj;
            hrg0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, hrg0Var.f111342b);
                jSONObject.put("url", hrg0Var.f111343c);
                jSONObject.put("identifier", hrg0Var.f111341a.identifier);
                jSONObject.put("protocol", hrg0Var.f111341a.protocol);
                jSONObject.put(FirebaseAnalytics.Param.METHOD, hrg0Var.f111341a.method);
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, hrg0Var.f111341a.status);
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < hrg0Var.f111341a.detailList.size(); i2++) {
                    NetworkDetectionDetail networkDetectionDetail = hrg0Var.f111341a.detailList.get(i2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", networkDetectionDetail.type);
                    jSONObject2.put("timestamp", networkDetectionDetail.timestamp);
                    jSONArray2.put(jSONObject2);
                }
                jSONObject.put("detailList", jSONArray2);
                NetworkDetectionStepResult networkDetectionStepResult = hrg0Var.f111341a.result;
                if (networkDetectionStepResult != null) {
                    jSONObject.put(LovePlanetStage.result, networkDetectionStepResult.toJsonObject());
                }
            } catch (Exception e) {
                LogUtils.file("InnelNetworkDetectionStep", "jsonError:" + LogUtils.getErrorInfo(e));
            }
            jSONArray.put(jSONObject);
        }
        this.f81812j.f179401j.put("stepList", jSONArray);
        ukg0 ukg0Var = this.f81812j;
        ukg0Var.f179396e = networkDetectionResult.code;
        String str = networkDetectionResult.msg;
        if (str != null) {
            ukg0Var.f179397f = str;
        }
        fug0.m127463b(ukg0Var);
        this.f81812j = null;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m109774e() {
        INetworkDetectionListener iNetworkDetectionListener = this.f81804b;
        if (iNetworkDetectionListener != null) {
            iNetworkDetectionListener.onStarted();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m109775f() {
        NetworkDetectionResult networkDetectionResult = new NetworkDetectionResult();
        int i = 0;
        networkDetectionResult.code = 0;
        networkDetectionResult.msg = "success";
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f81807e;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((hrg0) obj).f111341a.deepCopy());
        }
        networkDetectionResult.stepList = arrayList;
        INetworkDetectionListener iNetworkDetectionListener = this.f81804b;
        if (iNetworkDetectionListener != null) {
            iNetworkDetectionListener.onCompleted(networkDetectionResult);
        }
        m109773d(networkDetectionResult);
        this.f81803a = null;
        this.f81804b = null;
    }

    /* JADX INFO: renamed from: g */
    public final void m109776g(final int i, final String str) {
        ThreadUtils.postUITask(new Runnable() { // from class: l.zgg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f204300a.m109771b(i, str);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m109777h() {
        ThreadUtils.postUITask(new Runnable() { // from class: l.ahg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f71358a.m109775f();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m109778i() {
        ThreadUtils.postUITask(new Runnable() { // from class: l.ygg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f199830a.m109774e();
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f81806d) {
            return;
        }
        m109778i();
        m109770a();
    }
}
