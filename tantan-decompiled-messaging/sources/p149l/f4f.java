package p149l;

import com.sina.weibo.sdk.share.WbShareCallback;
import com.tencent.p101mm.opensdk.modelbase.BaseReq;
import com.tencent.p101mm.opensdk.modelbase.BaseResp;
import com.tencent.p101mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class f4f {

    /* JADX INFO: renamed from: b */
    public static c4g0 f94810b;

    /* JADX INFO: renamed from: a */
    public static C22393b<C16752e> f94809a = C22393b.m221521b();

    /* JADX INFO: renamed from: c */
    public static WbShareCallback f94811c = new C16748a();

    /* JADX INFO: renamed from: d */
    public static IWXAPIEventHandler f94812d = new C16749b();

    /* JADX INFO: renamed from: e */
    public static IUiListener f94813e = new C16750c();

    /* JADX INFO: renamed from: l.f4f$a */
    public class C16748a implements WbShareCallback {
        @Override // com.sina.weibo.sdk.share.WbShareCallback
        public void onWbShareCancel() {
            f4f.f94809a.onNext(new C16752e(1, null));
        }

        @Override // com.sina.weibo.sdk.share.WbShareCallback
        public void onWbShareFail() {
            f4f.f94809a.onNext(new C16752e(2, null));
        }

        @Override // com.sina.weibo.sdk.share.WbShareCallback
        public void onWbShareSuccess() {
            f4f.f94809a.onNext(new C16752e(0, null));
        }
    }

    /* JADX INFO: renamed from: l.f4f$d */
    public class C16751d implements e30<C16752e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f94814a;

        public C16751d(e30 e30Var) {
            this.f94814a = e30Var;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(C16752e c16752e) {
            this.f94814a.call(c16752e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m119308a(c4g0 c4g0Var) {
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            return;
        }
        c4g0Var.unsubscribe();
    }

    /* JADX INFO: renamed from: b */
    public static void m119309b(e30<C16752e> e30Var) {
        m119308a(f94810b);
        f94810b = f94809a.take(1).subscribe(new C16751d(e30Var));
    }

    /* JADX INFO: renamed from: c */
    public static void m119310c(C16752e c16752e) {
        f94809a.onNext(c16752e);
    }

    /* JADX INFO: renamed from: l.f4f$e */
    public static class C16752e {

        /* JADX INFO: renamed from: a */
        public int f94815a;

        /* JADX INFO: renamed from: b */
        public String f94816b;

        /* JADX INFO: renamed from: c */
        public BaseResp f94817c;

        public C16752e(int i, String str) {
            this.f94815a = i;
            this.f94816b = str;
        }

        public C16752e(BaseResp baseResp) {
            this.f94817c = baseResp;
        }
    }

    /* JADX INFO: renamed from: l.f4f$b */
    public class C16749b implements IWXAPIEventHandler {
        @Override // com.tencent.p101mm.opensdk.openapi.IWXAPIEventHandler
        public void onResp(BaseResp baseResp) {
            f4f.f94809a.onNext(new C16752e(baseResp));
        }

        @Override // com.tencent.p101mm.opensdk.openapi.IWXAPIEventHandler
        public void onReq(BaseReq baseReq) {
        }
    }

    /* JADX INFO: renamed from: l.f4f$c */
    public class C16750c implements IUiListener {
        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            f4f.f94809a.onNext(new C16752e(1, null));
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            f4f.f94809a.onNext(new C16752e(0, null));
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            f4f.f94809a.onNext(new C16752e(2, "error code:" + uiError.errorCode + "\nerror message: " + uiError.errorMessage + "\nerror detail:" + uiError.errorDetail));
        }

        @Override // com.tencent.tauth.IUiListener
        public void onWarning(int i) {
        }
    }
}
