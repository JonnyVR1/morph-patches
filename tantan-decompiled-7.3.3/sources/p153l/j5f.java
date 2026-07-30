package p153l;

import com.sina.weibo.sdk.share.WbShareCallback;
import com.tencent.p106mm.opensdk.modelbase.BaseReq;
import com.tencent.p106mm.opensdk.modelbase.BaseResp;
import com.tencent.p106mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes10.dex */
public class j5f {

    /* JADX INFO: renamed from: b */
    public static kcg0 f118426b;

    /* JADX INFO: renamed from: a */
    public static C22508b<C17884e> f118425a = C22508b.m222767b();

    /* JADX INFO: renamed from: c */
    public static WbShareCallback f118427c = new C17880a();

    /* JADX INFO: renamed from: d */
    public static IWXAPIEventHandler f118428d = new C17881b();

    /* JADX INFO: renamed from: e */
    public static IUiListener f118429e = new C17882c();

    /* JADX INFO: renamed from: l.j5f$a */
    public class C17880a implements WbShareCallback {
        @Override // com.sina.weibo.sdk.share.WbShareCallback
        public void onWbShareCancel() {
            j5f.f118425a.onNext(new C17884e(1, null));
        }

        @Override // com.sina.weibo.sdk.share.WbShareCallback
        public void onWbShareFail() {
            j5f.f118425a.onNext(new C17884e(2, null));
        }

        @Override // com.sina.weibo.sdk.share.WbShareCallback
        public void onWbShareSuccess() {
            j5f.f118425a.onNext(new C17884e(0, null));
        }
    }

    /* JADX INFO: renamed from: l.j5f$d */
    public class C17883d implements y20<C17884e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y20 f118430a;

        public C17883d(y20 y20Var) {
            this.f118430a = y20Var;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(C17884e c17884e) {
            this.f118430a.call(c17884e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m143521a(kcg0 kcg0Var) {
        if (kcg0Var == null || kcg0Var.isUnsubscribed()) {
            return;
        }
        kcg0Var.unsubscribe();
    }

    /* JADX INFO: renamed from: b */
    public static void m143522b(y20<C17884e> y20Var) {
        m143521a(f118426b);
        f118426b = f118425a.take(1).subscribe(new C17883d(y20Var));
    }

    /* JADX INFO: renamed from: c */
    public static void m143523c(C17884e c17884e) {
        f118425a.onNext(c17884e);
    }

    /* JADX INFO: renamed from: l.j5f$e */
    public static class C17884e {

        /* JADX INFO: renamed from: a */
        public int f118431a;

        /* JADX INFO: renamed from: b */
        public String f118432b;

        /* JADX INFO: renamed from: c */
        public BaseResp f118433c;

        public C17884e(int i, String str) {
            this.f118431a = i;
            this.f118432b = str;
        }

        public C17884e(BaseResp baseResp) {
            this.f118433c = baseResp;
        }
    }

    /* JADX INFO: renamed from: l.j5f$b */
    public class C17881b implements IWXAPIEventHandler {
        @Override // com.tencent.p106mm.opensdk.openapi.IWXAPIEventHandler
        public void onResp(BaseResp baseResp) {
            j5f.f118425a.onNext(new C17884e(baseResp));
        }

        @Override // com.tencent.p106mm.opensdk.openapi.IWXAPIEventHandler
        public void onReq(BaseReq baseReq) {
        }
    }

    /* JADX INFO: renamed from: l.j5f$c */
    public class C17882c implements IUiListener {
        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            j5f.f118425a.onNext(new C17884e(1, null));
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            j5f.f118425a.onNext(new C17884e(0, null));
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            j5f.f118425a.onNext(new C17884e(2, "error code:" + uiError.errorCode + "\nerror message: " + uiError.errorMessage + "\nerror detail:" + uiError.errorDetail));
        }

        @Override // com.tencent.tauth.IUiListener
        public void onWarning(int i) {
        }
    }
}
