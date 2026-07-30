package p006l;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.verification.national.IntroductionAct;
import com.p000p1.mobile.putong.core.p004ui.verification.national.NationalIdAuthAct;
import l.axp;
import l.e30;
import l.mbh0;
import l.rza;
import l.s7m;
import l.u4k;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zwp implements s7m<wwp> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f29011a;

    /* JADX INFO: renamed from: b */
    public VImage f29012b;

    /* JADX INFO: renamed from: c */
    public Button f29013c;

    /* JADX INFO: renamed from: d */
    public IntroductionAct f29014d;

    public zwp(IntroductionAct introductionAct) {
        this.f29014d = introductionAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m28843i(View view) {
        zvf0.r("e_id_verification_poster_next_click", "p_id_verification_poster_view");
        act().startActivityForResult(NationalIdAuthAct.m9498X1(act(), this.f29014d.m9495Y1(), this.f29014d.m9496Z1()), 0);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m28844C0() {
        return this.f29014d;
    }

    /* JADX INFO: renamed from: c */
    public View m28845c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return axp.b(this, layoutInflater, viewGroup);
    }

    @DrawableRes
    /* JADX INFO: renamed from: e */
    public final int m28847e() {
        if (this.f29014d.m9496Z1()) {
            if (rza.G0()) {
                return !u4k.a() ? x2c0.f25890G8 : x2c0.f25952I8;
            }
            return x2c0.f25921H8;
        }
        if (rza.G0()) {
            return !u4k.a() ? x2c0.f25794D8 : x2c0.f25858F8;
        }
        return x2c0.f25826E8;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m28848f(int i, int i2, int[] iArr) {
        xdl0.C0(this.f29012b, (int) (((i * 1.0f) / i2) * iArr[0]));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m28845c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m28850r() {
        this.f29011a.setTitle(this.f29014d.string(R$string.f1923M7));
        this.f29011a.setLeftIconAsBack(act());
        int iM28847e = m28847e();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(this.f29014d.getResources(), iM28847e, options);
        final int i = options.outWidth;
        final int i2 = options.outHeight;
        xdl0.Q0(this.f29012b, new e30() { // from class: l.xwp
            public final void call(Object obj) {
                this.f27766a.m28848f(i2, i, (int[]) obj);
            }
        });
        this.f29012b.setImageResource(iM28847e);
        xdl0.E0(this.f29013c, new View.OnClickListener() { // from class: l.ywp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28459a.m28843i(view);
            }
        });
        this.f29014d.addSwipeBackListener(new C1543a());
    }

    /* JADX INFO: renamed from: l.zwp$a */
    public class C1543a implements mbh0 {
        public C1543a() {
        }

        /* JADX INFO: renamed from: O */
        public void m28853O() {
            zvf0.r("e_id_verification_poster_cancel_click", "p_id_verification_poster_view");
        }

        /* JADX INFO: renamed from: E0 */
        public void m28852E0() {
        }

        /* JADX INFO: renamed from: Z */
        public void m28854Z() {
        }

        /* JADX INFO: renamed from: D0 */
        public void m28851D0(boolean z, float f, int i) {
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m28849i1(wwp wwpVar) {
    }
}
