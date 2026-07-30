package p002l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p000p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestSubView;
import com.p000p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.apibean.LiveRoomSuggestBean;
import com.p1.mobile.putong.live.base.data.BLiveSuggestLive;
import java.util.List;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import v.VImage;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pgt extends LiveMenuDialogHolder<ugt> {

    /* JADX INFO: renamed from: A */
    public String f17322A;

    /* JADX INFO: renamed from: k */
    public LiveRoomSuggestView f17323k;

    /* JADX INFO: renamed from: l */
    public VText f17324l;

    /* JADX INFO: renamed from: m */
    public VText f17325m;

    /* JADX INFO: renamed from: n */
    public VRecyclerView f17326n;

    /* JADX INFO: renamed from: o */
    public LiveRoomSuggestSubView f17327o;

    /* JADX INFO: renamed from: p */
    public VImage f17328p;

    /* JADX INFO: renamed from: q */
    public VText f17329q;

    /* JADX INFO: renamed from: r */
    public VRecyclerView f17330r;

    /* JADX INFO: renamed from: s */
    public FrameLayout f17331s;

    /* JADX INFO: renamed from: t */
    public FrameLayout f17332t;

    /* JADX INFO: renamed from: u */
    public VImage f17333u;

    /* JADX INFO: renamed from: v */
    public VText f17334v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f17335w;

    /* JADX INFO: renamed from: x */
    public VText f17336x;

    /* JADX INFO: renamed from: y */
    public VText f17337y;

    /* JADX INFO: renamed from: z */
    public LiveRoomSuggestBean f17338z;

    public pgt(Act act, @NonNull @NotNull ugt ugtVar) {
        super(t6c0.f19864h5, act, ugtVar, j2g0.m15577c(0.0f));
        this.f17322A = "p_live_exit_popup";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m20284J(View view) {
        List suggestedLives;
        if (this.f17338z == null) {
            return;
        }
        boolean zEquals = TextUtils.equals(this.f17322A, "p_live_exit_popup");
        LiveRoomSuggestBean liveRoomSuggestBean = this.f17338z;
        if (zEquals) {
            suggestedLives = liveRoomSuggestBean.getSuggestedLives();
        } else {
            suggestedLives = liveRoomSuggestBean.getLiveQuitPopup() != null ? this.f17338z.getLiveQuitPopup().level2SuggestedLives : null;
        }
        if (suggestedLives == null || suggestedLives.size() == 0) {
            return;
        }
        ydd0.m26652a(this.f17322A, (BLiveSuggestLive) suggestedLives.get(0));
        ((ugt) this.f3799b).m23463W3(this.f17322A, (BLiveSuggestLive) suggestedLives.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m20285K(View view) {
        zvf0.r("e_live_exit_popup_exit", this.f17322A);
        mo5216p();
        ((ugt) this.f3799b).m23462V3();
    }

    /* JADX INFO: renamed from: r */
    private void m20286r() {
        xdl0.E0(this.f17336x, new View.OnClickListener() { // from class: l.ngt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16025a.m20284J(view);
            }
        });
        xdl0.E0(this.f17337y, new View.OnClickListener() { // from class: l.ogt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16594a.m20285K(view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final void m20287H(View view) {
        qgt.m21267a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public void m20288I(boolean z) {
        int i;
        int i2;
        this.f17331s.setVisibility(8);
        if (this.f17338z == null) {
            i = i3c0.f12775e4;
            i2 = R$string.f3247e3;
        } else if (z) {
            i = i3c0.f12799g4;
            i2 = R$string.f3269f3;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i != 0) {
            this.f17331s.setVisibility(0);
            this.f17327o.setVisibility(8);
            this.f17323k.setVisibility(8);
            this.f17333u.setImageResource(i);
            this.f17334v.setText(i2);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m20289L(boolean z, String str) {
        this.f17322A = str;
        if (!z) {
            this.f17323k.m6661Z((ugt) this.f3799b, this.f17338z);
            this.f17323k.m6657V();
            this.f17327o.m6648V();
        } else {
            LiveRoomSuggestBean liveRoomSuggestBean = this.f17338z;
            if (liveRoomSuggestBean != null && liveRoomSuggestBean.getLiveQuitPopup() != null) {
                this.f17327o.m6649W((ugt) this.f3799b, this.f17338z.getLiveQuitPopup());
            }
            this.f17323k.m6660Y();
            this.f17327o.m6647T();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m20290M(LiveRoomSuggestBean liveRoomSuggestBean) {
        this.f17338z = liveRoomSuggestBean;
        if (liveRoomSuggestBean != null && !vwb.J(liveRoomSuggestBean.getSuggestedLives())) {
            ydd0.m26653b("p_live_exit_popup", (BLiveSuggestLive) this.f17338z.getSuggestedLives().get(0));
        }
        this.f17322A = "p_live_exit_popup";
        this.f17327o.setVisibility(8);
        this.f17323k.setVisibility(0);
        this.f17323k.m6661Z((ugt) this.f3799b, this.f17338z);
        LiveRoomSuggestBean liveRoomSuggestBean2 = this.f17338z;
        m20288I(liveRoomSuggestBean2 == null || vwb.J(liveRoomSuggestBean2.getSuggestedLives()));
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        super.mo5214m(view);
        m20287H(view);
        m20286r();
    }
}
