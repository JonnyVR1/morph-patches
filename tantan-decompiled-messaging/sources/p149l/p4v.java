package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.external.R$string;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class p4v implements s7m<n4v> {

    /* JADX INFO: renamed from: a */
    public final VDraweeView f147216a;

    /* JADX INFO: renamed from: b */
    public n4v f147217b;

    /* JADX INFO: renamed from: c */
    public boolean f147218c;

    /* JADX INFO: renamed from: d */
    public String f147219d;

    /* JADX INFO: renamed from: e */
    public hpd0 f147220e = new hpd0("HAS_SHOW_CREATE_VOICE_TIP" + l9s.m149093o0(), Boolean.FALSE);

    public p4v(VDraweeView vDraweeView) {
        this.f147216a = vDraweeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m167417d(View view) {
        this.f147217b.m157892U2(view);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getAct();
    }

    @Override // p149l.s7m
    @NonNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f147217b.getAct();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(n4v n4vVar) {
        this.f147217b = n4vVar;
    }

    /* JADX INFO: renamed from: c */
    public void m167419c() {
        C4348d.m20896l().m20900k(this.f147219d);
    }

    @Override // p149l.s7m
    public void destroy() {
        m167419c();
    }

    /* JADX INFO: renamed from: e */
    public void m167420e(boolean z) {
        if (this.f147218c || !s9s.f163228b.m195968v7()) {
            xdl0.m208344M(this.f147216a, false);
            return;
        }
        xdl0.m208344M(this.f147216a, z);
        if (z) {
            amo0.m97567d();
        } else {
            m167419c();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m167421f(Boolean bool) {
        this.f147218c = bool.booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public void m167422i() {
        if (!TEnum.equals(qib0.f154719h0, LiveRegionTag.mainland)) {
            hfw.m130790a("[live][square]", "非mainland不展示");
            return;
        }
        if (this.f147220e.get().booleanValue()) {
            return;
        }
        VText vText = new VText(getAct());
        int i = xdl0.f192403e;
        vText.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        vText.setText(R$string.f44938y0);
        int i2 = t100.f167261j;
        vText.setPadding(i2, t100.m186890d(11.0f), i2, t100.m186890d(11.0f));
        vText.setTextColor(-1);
        this.f147219d = C4348d.m20896l().m20908t(new C4345a(getAct()).m20877s(vText).m20882x(t100.f167259h).m20864e(true).m20883y(true).m20870k(getAct().getResources().getColor(g1c0.f100146a)).m20855J(13.0f).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20875q(C4345a.f15680N | C4345a.f15682P).m20873o(C4345a.f15682P, t100.m186890d(7.0f)).m20879u(t100.f167254c), this.f147216a);
        this.f147220e.put(Boolean.TRUE);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public void m167423r() {
        xdl0.m208329E0(this.f147216a, new View.OnClickListener() { // from class: l.o4v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141817a.m167417d(view);
            }
        });
    }
}
