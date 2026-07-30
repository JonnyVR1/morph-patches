package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.apibean.LiveRoomSuggestBean;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestSubView;
import com.p046p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestView;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class pgt extends LiveMenuDialogHolder<ugt> {

    /* JADX INFO: renamed from: A */
    public String f148810A;

    /* JADX INFO: renamed from: k */
    public LiveRoomSuggestView f148811k;

    /* JADX INFO: renamed from: l */
    public VText f148812l;

    /* JADX INFO: renamed from: m */
    public VText f148813m;

    /* JADX INFO: renamed from: n */
    public VRecyclerView f148814n;

    /* JADX INFO: renamed from: o */
    public LiveRoomSuggestSubView f148815o;

    /* JADX INFO: renamed from: p */
    public VImage f148816p;

    /* JADX INFO: renamed from: q */
    public VText f148817q;

    /* JADX INFO: renamed from: r */
    public VRecyclerView f148818r;

    /* JADX INFO: renamed from: s */
    public FrameLayout f148819s;

    /* JADX INFO: renamed from: t */
    public FrameLayout f148820t;

    /* JADX INFO: renamed from: u */
    public VImage f148821u;

    /* JADX INFO: renamed from: v */
    public VText f148822v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f148823w;

    /* JADX INFO: renamed from: x */
    public VText f148824x;

    /* JADX INFO: renamed from: y */
    public VText f148825y;

    /* JADX INFO: renamed from: z */
    public LiveRoomSuggestBean f148826z;

    public pgt(Act act, @NonNull @NotNull ugt ugtVar) {
        super(t6c0.f168368h5, act, ugtVar, j2g0.m139456c(0.0f));
        this.f148810A = "p_live_exit_popup";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m168894J(View view) {
        List<BLiveSuggestLive> suggestedLives;
        if (this.f148826z == null) {
            return;
        }
        boolean zEquals = TextUtils.equals(this.f148810A, "p_live_exit_popup");
        LiveRoomSuggestBean liveRoomSuggestBean = this.f148826z;
        if (zEquals) {
            suggestedLives = liveRoomSuggestBean.getSuggestedLives();
        } else {
            suggestedLives = liveRoomSuggestBean.getLiveQuitPopup() != null ? this.f148826z.getLiveQuitPopup().level2SuggestedLives : null;
        }
        if (suggestedLives == null || suggestedLives.size() == 0) {
            return;
        }
        ydd0.m214279a(this.f148810A, suggestedLives.get(0));
        ((ugt) this.f47757b).m193579W3(this.f148810A, suggestedLives.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m168895K(View view) {
        zvf0.m220396r("e_live_exit_popup_exit", this.f148810A);
        mo71838p();
        ((ugt) this.f47757b).m193578V3();
    }

    /* JADX INFO: renamed from: r */
    private void m168896r() {
        xdl0.m208329E0(this.f148824x, new View.OnClickListener() { // from class: l.ngt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138905a.m168894J(view);
            }
        });
        xdl0.m208329E0(this.f148825y, new View.OnClickListener() { // from class: l.ogt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143917a.m168895K(view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final void m168897H(View view) {
        qgt.m174456a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public void m168898I(boolean z) {
        int i;
        int i2;
        this.f148819s.setVisibility(8);
        if (this.f148826z == null) {
            i = i3c0.f110990e4;
            i2 = R$string.f47205e3;
        } else if (z) {
            i = i3c0.f111014g4;
            i2 = R$string.f47227f3;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i != 0) {
            this.f148819s.setVisibility(0);
            this.f148815o.setVisibility(8);
            this.f148811k.setVisibility(8);
            this.f148821u.setImageResource(i);
            this.f148822v.setText(i2);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m168899L(boolean z, String str) {
        this.f148810A = str;
        if (!z) {
            this.f148811k.m73134Z((ugt) this.f47757b, this.f148826z);
            this.f148811k.m73130V();
            this.f148815o.m73122V();
        } else {
            LiveRoomSuggestBean liveRoomSuggestBean = this.f148826z;
            if (liveRoomSuggestBean != null && liveRoomSuggestBean.getLiveQuitPopup() != null) {
                this.f148815o.m73123W((ugt) this.f47757b, this.f148826z.getLiveQuitPopup());
            }
            this.f148811k.m73133Y();
            this.f148815o.m73121T();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m168900M(LiveRoomSuggestBean liveRoomSuggestBean) {
        this.f148826z = liveRoomSuggestBean;
        if (liveRoomSuggestBean != null && !vwb.m200296J(liveRoomSuggestBean.getSuggestedLives())) {
            ydd0.m214280b("p_live_exit_popup", this.f148826z.getSuggestedLives().get(0));
        }
        this.f148810A = "p_live_exit_popup";
        this.f148815o.setVisibility(8);
        this.f148811k.setVisibility(0);
        this.f148811k.m73134Z((ugt) this.f47757b, this.f148826z);
        LiveRoomSuggestBean liveRoomSuggestBean2 = this.f148826z;
        m168898I(liveRoomSuggestBean2 == null || vwb.m200296J(liveRoomSuggestBean2.getSuggestedLives()));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m168897H(view);
        m168896r();
    }
}
