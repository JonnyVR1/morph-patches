package p153l;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.live.base.span.LiveAnimatedWebpSpanDrawable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public final class ivr {

    /* JADX INFO: renamed from: l.ivr$a */
    public class C17809a implements C22421c.a<ruf0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f117110a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f117111b;

        /* JADX INFO: renamed from: l.ivr$a$a */
        public class a extends aj2<fb5<db5>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ gcg0 f117112a;

            public a(gcg0 gcg0Var) {
                this.f117112a = gcg0Var;
            }

            @Override // p153l.aj2
            /* JADX INFO: renamed from: e */
            public void mo98346e(i6c<fb5<db5>> i6cVar) {
                if (this.f117112a.isUnsubscribed()) {
                    return;
                }
                this.f117112a.onCompleted();
            }

            @Override // p153l.aj2
            /* JADX INFO: renamed from: f */
            public void mo98347f(i6c<fb5<db5>> i6cVar) throws Throwable {
                wp0 wp0Var;
                Throwable th;
                if (!i6cVar.mo8236e()) {
                    return;
                }
                fb5<db5> result = i6cVar.getResult();
                if (this.f117112a.isUnsubscribed()) {
                    fb5.m124874v(result);
                    return;
                }
                if (result == null) {
                    if (this.f117112a.isUnsubscribed()) {
                        return;
                    }
                    this.f117112a.onCompleted();
                    return;
                }
                boolean z = false;
                wp0 wp0Var2 = null;
                try {
                    db5 db5VarM124875B = result.m124875B();
                    rce rceVarM201531b = vjm.m201527m().m201531b(App.f16088e);
                    if (rceVarM201531b != null && db5VarM124875B != null && rceVarM201531b.mo99068a(db5VarM124875B)) {
                        Drawable drawableMo99069b = rceVarM201531b.mo99069b(db5VarM124875B);
                        if (drawableMo99069b instanceof wp0) {
                            wp0Var = (wp0) drawableMo99069b;
                            try {
                                if (!this.f117112a.isUnsubscribed()) {
                                    this.f117112a.m137019l(new LiveAnimatedWebpSpanDrawable(wp0Var, result));
                                    z = true;
                                    this.f117112a.onCompleted();
                                }
                                wp0Var2 = wp0Var;
                            } catch (Throwable th2) {
                                th = th2;
                                if (!z) {
                                    if (wp0Var != null) {
                                        wp0Var.mo134586a();
                                    }
                                    fb5.m124874v(result);
                                    if (!this.f117112a.isUnsubscribed()) {
                                        this.f117112a.onCompleted();
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                    if (z) {
                        return;
                    }
                    if (wp0Var2 != null) {
                        wp0Var2.mo134586a();
                    }
                    fb5.m124874v(result);
                    if (this.f117112a.isUnsubscribed()) {
                        return;
                    }
                    this.f117112a.onCompleted();
                } catch (Throwable th3) {
                    wp0Var = null;
                    th = th3;
                }
            }
        }

        public C17809a(String str, int i) {
            this.f117110a = str;
            this.f117111b = i;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super ruf0> gcg0Var) {
            if (TextUtils.isEmpty(this.f117110a) || !LiveAnimatedWebpSpanDrawable.m69783j(this.f117110a)) {
                gcg0Var.onCompleted();
                return;
            }
            ImageRequestBuilder imageRequestBuilderM8646y = ImageRequestBuilder.m8646y(Uri.parse(this.f117110a.trim()));
            int i = this.f117111b;
            final i6c<fb5<db5>> i6cVarM181720h = f9j.m124659a().m181720h(imageRequestBuilderM8646y.m8661O(new q3d0(i, i)).m8668a(), App.f16088e);
            gcg0Var.m129866b(pcg0.m171648a(new x20() { // from class: l.hvr
                @Override // p153l.x20
                public final void call() {
                    i6cVarM181720h.close();
                }
            }));
            i6cVarM181720h.mo8237f(new a(gcg0Var), f94.m124626k());
        }
    }

    /* JADX INFO: renamed from: a */
    public static C22421c<ruf0> m142355a(String str, int i) {
        return C22421c.create(new C17809a(str, i));
    }
}
