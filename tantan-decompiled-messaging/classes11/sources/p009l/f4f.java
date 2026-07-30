package p009l;

import com.sina.weibo.sdk.share.WbShareCallback;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import l.c4g0;
import l.e30;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class f4f {

    /* JADX INFO: renamed from: b */
    public static c4g0 f12774b;

    /* JADX INFO: renamed from: a */
    public static b<C0883e> f12773a = b.b();

    /* JADX INFO: renamed from: c */
    public static WbShareCallback f12775c = new C0879a();

    /* JADX INFO: renamed from: d */
    public static IWXAPIEventHandler f12776d = new C0880b();

    /* JADX INFO: renamed from: e */
    public static IUiListener f12777e = new C0881c();

    /* JADX INFO: renamed from: l.f4f$a */
    public class C0879a implements WbShareCallback {
        @Override // com.sina.weibo.sdk.share.WbShareCallback
        public void onWbShareCancel() {
            f4f.f12773a.onNext(new C0883e(1, null));
        }

        @Override // com.sina.weibo.sdk.share.WbShareCallback
        public void onWbShareFail() {
            f4f.f12773a.onNext(new C0883e(2, null));
        }

        @Override // com.sina.weibo.sdk.share.WbShareCallback
        public void onWbShareSuccess() {
            f4f.f12773a.onNext(new C0883e(0, null));
        }
    }

    /* JADX INFO: renamed from: l.f4f$d */
    public class C0882d implements e30<C0883e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f12778a;

        public C0882d(e30 e30Var) {
            this.f12778a = e30Var;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(C0883e c0883e) {
            this.f12778a.call(c0883e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m14204a(c4g0 c4g0Var) {
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            return;
        }
        c4g0Var.unsubscribe();
    }

    /* JADX INFO: renamed from: b */
    public static void m14205b(e30<C0883e> e30Var) {
        m14204a(f12774b);
        f12774b = f12773a.take(1).subscribe(new C0882d(e30Var));
    }

    /* JADX INFO: renamed from: c */
    public static void m14206c(C0883e c0883e) {
        f12773a.onNext(c0883e);
    }

    /* JADX INFO: renamed from: l.f4f$e */
    public static class C0883e {

        /* JADX INFO: renamed from: a */
        public int f12779a;

        /* JADX INFO: renamed from: b */
        public String f12780b;

        /* JADX INFO: renamed from: c */
        public BaseResp f12781c;

        public C0883e(int i, String str) {
            this.f12779a = i;
            this.f12780b = str;
        }

        public C0883e(BaseResp baseResp) {
            this.f12781c = baseResp;
        }
    }

    /* JADX INFO: renamed from: l.f4f$b */
    public class C0880b implements IWXAPIEventHandler {
        public void onResp(BaseResp baseResp) {
            f4f.f12773a.onNext(new C0883e(baseResp));
        }

        public void onReq(BaseReq baseReq) {
        }
    }

    /* JADX INFO: renamed from: l.f4f$c */
    public class C0881c implements IUiListener {
        public void onCancel() {
            f4f.f12773a.onNext(new C0883e(1, null));
        }

        public void onComplete(Object obj) {
            f4f.f12773a.onNext(new C0883e(0, null));
        }

        public void onError(UiError uiError) {
            f4f.f12773a.onNext(new C0883e(2, "error code:" + uiError.errorCode + "\nerror message: " + uiError.errorMessage + "\nerror detail:" + uiError.errorDetail));
        }

        public void onWarning(int i) {
        }
    }
}
