package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.apibean.LiveRoomSuggestBean;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestSubView;
import com.p051p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestView;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class qit extends LiveMenuDialogHolder<vit> {

    /* JADX INFO: renamed from: A */
    public String f157869A;

    /* JADX INFO: renamed from: k */
    public LiveRoomSuggestView f157870k;

    /* JADX INFO: renamed from: l */
    public VText f157871l;

    /* JADX INFO: renamed from: m */
    public VText f157872m;

    /* JADX INFO: renamed from: n */
    public VRecyclerView f157873n;

    /* JADX INFO: renamed from: o */
    public LiveRoomSuggestSubView f157874o;

    /* JADX INFO: renamed from: p */
    public VImage f157875p;

    /* JADX INFO: renamed from: q */
    public VText f157876q;

    /* JADX INFO: renamed from: r */
    public VRecyclerView f157877r;

    /* JADX INFO: renamed from: s */
    public FrameLayout f157878s;

    /* JADX INFO: renamed from: t */
    public FrameLayout f157879t;

    /* JADX INFO: renamed from: u */
    public VImage f157880u;

    /* JADX INFO: renamed from: v */
    public VText f157881v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f157882w;

    /* JADX INFO: renamed from: x */
    public VText f157883x;

    /* JADX INFO: renamed from: y */
    public VText f157884y;

    /* JADX INFO: renamed from: z */
    public LiveRoomSuggestBean f157885z;

    public qit(Act act, @NonNull @NotNull vit vitVar) {
        super(yec0.f199100h5, act, vitVar, qag0.m175922c(0.0f));
        this.f157869A = "p_live_exit_popup";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m176758J(View view) {
        List<BLiveSuggestLive> suggestedLives;
        if (this.f157885z == null) {
            return;
        }
        boolean zEquals = TextUtils.equals(this.f157869A, "p_live_exit_popup");
        LiveRoomSuggestBean liveRoomSuggestBean = this.f157885z;
        if (zEquals) {
            suggestedLives = liveRoomSuggestBean.getSuggestedLives();
        } else {
            suggestedLives = liveRoomSuggestBean.getLiveQuitPopup() != null ? this.f157885z.getLiveQuitPopup().level2SuggestedLives : null;
        }
        if (suggestedLives == null || suggestedLives.size() == 0) {
            return;
        }
        amd0.m98819a(this.f157869A, suggestedLives.get(0));
        ((vit) this.f48605b).m201419W3(this.f157869A, suggestedLives.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m176759K(View view) {
        i4g0.m138520r("e_live_exit_popup_exit", this.f157869A);
        mo73021p();
        ((vit) this.f48605b).m201418V3();
    }

    /* JADX INFO: renamed from: r */
    private void m176760r() {
        bnl0.m105509E0(this.f157883x, new View.OnClickListener() { // from class: l.oit
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147580a.m176758J(view);
            }
        });
        bnl0.m105509E0(this.f157884y, new View.OnClickListener() { // from class: l.pit
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152616a.m176759K(view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final void m176761H(View view) {
        rit.m181601a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public void m176762I(boolean z) {
        int i;
        int i2;
        this.f157878s.setVisibility(8);
        if (this.f157885z == null) {
            i = obc0.f146318e4;
            i2 = R$string.f48053e3;
        } else if (z) {
            i = obc0.f146342g4;
            i2 = R$string.f48075f3;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i != 0) {
            this.f157878s.setVisibility(0);
            this.f157874o.setVisibility(8);
            this.f157870k.setVisibility(8);
            this.f157880u.setImageResource(i);
            this.f157881v.setText(i2);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m176763L(boolean z, String str) {
        this.f157869A = str;
        if (!z) {
            this.f157870k.m74317Z((vit) this.f48605b, this.f157885z);
            this.f157870k.m74313V();
            this.f157874o.m74305V();
        } else {
            LiveRoomSuggestBean liveRoomSuggestBean = this.f157885z;
            if (liveRoomSuggestBean != null && liveRoomSuggestBean.getLiveQuitPopup() != null) {
                this.f157874o.m74306W((vit) this.f48605b, this.f157885z.getLiveQuitPopup());
            }
            this.f157870k.m74316Y();
            this.f157874o.m74304T();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m176764M(LiveRoomSuggestBean liveRoomSuggestBean) {
        this.f157885z = liveRoomSuggestBean;
        if (liveRoomSuggestBean != null && !jyb.m147479J(liveRoomSuggestBean.getSuggestedLives())) {
            amd0.m98820b("p_live_exit_popup", this.f157885z.getSuggestedLives().get(0));
        }
        this.f157869A = "p_live_exit_popup";
        this.f157874o.setVisibility(8);
        this.f157870k.setVisibility(0);
        this.f157870k.m74317Z((vit) this.f48605b, this.f157885z);
        LiveRoomSuggestBean liveRoomSuggestBean2 = this.f157885z;
        m176762I(liveRoomSuggestBean2 == null || jyb.m147479J(liveRoomSuggestBean2.getSuggestedLives()));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m176761H(view);
        m176760r();
    }
}
