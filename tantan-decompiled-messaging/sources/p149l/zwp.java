package p149l;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.verification.national.IntroductionAct;
import com.p046p1.mobile.putong.core.p053ui.verification.national.NationalIdAuthAct;
import p147v.VImage;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class zwp implements s7m<wwp> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f205250a;

    /* JADX INFO: renamed from: b */
    public VImage f205251b;

    /* JADX INFO: renamed from: c */
    public Button f205252c;

    /* JADX INFO: renamed from: d */
    public IntroductionAct f205253d;

    public zwp(IntroductionAct introductionAct) {
        this.f205253d = introductionAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m220679i(View view) {
        zvf0.m220396r("e_id_verification_poster_next_click", "p_id_verification_poster_view");
        act().startActivityForResult(NationalIdAuthAct.m56073X1(act(), this.f205253d.m56070Y1(), this.f205253d.m56071Z1()), 0);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f205253d;
    }

    /* JADX INFO: renamed from: c */
    public View m220680c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return axp.m99515b(this, layoutInflater, viewGroup);
    }

    @DrawableRes
    /* JADX INFO: renamed from: e */
    public final int m220682e() {
        if (this.f205253d.m56071Z1()) {
            if (rza.m181727G0()) {
                return !u4k.m191738a() ? x2c0.f189354G8 : x2c0.f189416I8;
            }
            return x2c0.f189385H8;
        }
        if (rza.m181727G0()) {
            return !u4k.m191738a() ? x2c0.f189258D8 : x2c0.f189322F8;
        }
        return x2c0.f189290E8;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m220683f(int i, int i2, int[] iArr) {
        xdl0.m208325C0(this.f205251b, (int) (((i * 1.0f) / i2) * iArr[0]));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m220680c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m220684r() {
        this.f205250a.setTitle(this.f205253d.string(R$string.f17934M7));
        this.f205250a.setLeftIconAsBack(act());
        int iM220682e = m220682e();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(this.f205253d.getResources(), iM220682e, options);
        final int i = options.outWidth;
        final int i2 = options.outHeight;
        xdl0.m208353Q0(this.f205251b, new e30() { // from class: l.xwp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194749a.m220683f(i2, i, (int[]) obj);
            }
        });
        this.f205251b.setImageResource(iM220682e);
        xdl0.m208329E0(this.f205252c, new View.OnClickListener() { // from class: l.ywp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200520a.m220679i(view);
            }
        });
        this.f205253d.addSwipeBackListener(new C21799a());
    }

    /* JADX INFO: renamed from: l.zwp$a */
    public class C21799a implements mbh0 {
        public C21799a() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: O */
        public void mo43536O() {
            zvf0.m220396r("e_id_verification_poster_cancel_click", "p_id_verification_poster_view");
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: E0 */
        public void mo43535E0() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: Z */
        public void mo43538Z() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: D0 */
        public void mo43534D0(boolean z, float f, int i) {
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wwp wwpVar) {
    }
}
