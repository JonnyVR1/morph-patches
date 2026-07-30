package p149l;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.live.base.span.LiveAnimatedWebpSpanDrawable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public final class htr {

    /* JADX INFO: renamed from: l.htr$a */
    public class C17389a implements C22306c.a<imf0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f109441a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f109442b;

        /* JADX INFO: renamed from: l.htr$a$a */
        public class a extends ti2<fa5<da5>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z3g0 f109443a;

            public a(z3g0 z3g0Var) {
                this.f109443a = z3g0Var;
            }

            @Override // p149l.ti2
            /* JADX INFO: renamed from: e */
            public void mo102384e(c5c<fa5<da5>> c5cVar) {
                if (this.f109443a.isUnsubscribed()) {
                    return;
                }
                this.f109443a.onCompleted();
            }

            @Override // p149l.ti2
            /* JADX INFO: renamed from: f */
            public void mo96183f(c5c<fa5<da5>> c5cVar) throws Throwable {
                aq0 aq0Var;
                Throwable th;
                if (!c5cVar.mo8182e()) {
                    return;
                }
                fa5<da5> result = c5cVar.getResult();
                if (this.f109443a.isUnsubscribed()) {
                    fa5.m120154v(result);
                    return;
                }
                if (result == null) {
                    if (this.f109443a.isUnsubscribed()) {
                        return;
                    }
                    this.f109443a.onCompleted();
                    return;
                }
                boolean z = false;
                aq0 aq0Var2 = null;
                try {
                    da5 da5VarM120155B = result.m120155B();
                    nbe nbeVarM184246b = shm.m184242m().m184246b(App.f15369e);
                    if (nbeVarM184246b != null && da5VarM120155B != null && nbeVarM184246b.mo146384a(da5VarM120155B)) {
                        Drawable drawableMo146385b = nbeVarM184246b.mo146385b(da5VarM120155B);
                        if (drawableMo146385b instanceof aq0) {
                            aq0Var = (aq0) drawableMo146385b;
                            try {
                                if (!this.f109443a.isUnsubscribed()) {
                                    this.f109443a.m132487l(new LiveAnimatedWebpSpanDrawable(aq0Var, result));
                                    z = true;
                                    this.f109443a.onCompleted();
                                }
                                aq0Var2 = aq0Var;
                            } catch (Throwable th2) {
                                th = th2;
                                if (!z) {
                                    if (aq0Var != null) {
                                        aq0Var.mo98207a();
                                    }
                                    fa5.m120154v(result);
                                    if (!this.f109443a.isUnsubscribed()) {
                                        this.f109443a.onCompleted();
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                    if (z) {
                        return;
                    }
                    if (aq0Var2 != null) {
                        aq0Var2.mo98207a();
                    }
                    fa5.m120154v(result);
                    if (this.f109443a.isUnsubscribed()) {
                        return;
                    }
                    this.f109443a.onCompleted();
                } catch (Throwable th3) {
                    aq0Var = null;
                    th = th3;
                }
            }
        }

        public C17389a(String str, int i) {
            this.f109441a = str;
            this.f109442b = i;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super imf0> z3g0Var) {
            if (TextUtils.isEmpty(this.f109441a) || !LiveAnimatedWebpSpanDrawable.m68600j(this.f109441a)) {
                z3g0Var.onCompleted();
                return;
            }
            ImageRequestBuilder imageRequestBuilderM8592y = ImageRequestBuilder.m8592y(Uri.parse(this.f109441a.trim()));
            int i = this.f109442b;
            final c5c<fa5<da5>> c5cVarM164409h = l6j.m148744a().m164409h(imageRequestBuilderM8592y.m8607O(new nvc0(i, i)).m8614a(), App.f15369e);
            z3g0Var.m217046b(h4g0.m129240a(new d30() { // from class: l.gtr
                @Override // p149l.d30
                public final void call() {
                    c5cVarM164409h.close();
                }
            }));
            c5cVarM164409h.mo8183f(new a(z3g0Var), g84.m124744k());
        }
    }

    /* JADX INFO: renamed from: a */
    public static C22306c<imf0> m132937a(String str, int i) {
        return C22306c.create(new C17389a(str, i));
    }
}
