package p153l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLiveAssert;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSquareButton;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p051p1.mobile.putong.live.external.view.widgets.VirtualVoiceSquareTopBtnView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class g9v implements iam<w8v> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f102886a;

    /* JADX INFO: renamed from: b */
    public VImage f102887b;

    /* JADX INFO: renamed from: c */
    public BLiveVoiceLiveAssert f102888c;

    /* JADX INFO: renamed from: d */
    public final List<View> f102889d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List<View> f102890e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final List<BLiveVoiceSquareButton> f102891f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final boolean f102892g;

    /* JADX INFO: renamed from: h */
    public VFrame f102893h;

    public g9v(VNavigationBar vNavigationBar, boolean z) {
        this.f102886a = vNavigationBar;
        this.f102892g = z;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m129615e(Act act, View view) {
        act.startActivity(m129622p(act));
        i4g0.m138520r("e_audio_room_rank_button", "p_audio_explore_recommend");
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m129617i(Act act, View view) {
        act.startActivity(m129622p(act));
        i4g0.m138520r("e_audio_room_rank_button", "p_audio_explore_recommend");
    }

    /* JADX INFO: renamed from: m */
    private View m129620m(Act act, BLiveVoiceSquareButton bLiveVoiceSquareButton) {
        VirtualVoiceSquareTopBtnView virtualVoiceSquareTopBtnView = new VirtualVoiceSquareTopBtnView(act);
        virtualVoiceSquareTopBtnView.m72117d(bLiveVoiceSquareButton);
        return virtualVoiceSquareTopBtnView;
    }

    /* JADX INFO: renamed from: n */
    private boolean m129621n(List<BLiveVoiceSquareButton> list) {
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).type, this.f102891f.get(i).type)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static Intent m129622p(Context context) {
        Intent intentM70066d2 = LiveWebViewAct.m70066d2(context, efv.m120727e());
        intentM70066d2.putExtra("extra_is_need_status_bar_hide", true);
        return intentM70066d2;
    }

    /* JADX INFO: renamed from: s */
    private boolean m129623s(List<BLiveVoiceSquareButton> list) {
        return (list.size() == this.f102891f.size() && m129621n(list)) ? false : true;
    }

    /* JADX INFO: renamed from: z */
    private void m129624z(List<BLiveVoiceSquareButton> list) {
        VLinear rightIconContainer = this.f102886a.getRightIconContainer();
        for (int i = 0; i < list.size() && i < rightIconContainer.getChildCount(); i++) {
            View childAt = rightIconContainer.getChildAt(i);
            BLiveVoiceSquareButton bLiveVoiceSquareButton = list.get(i);
            if (childAt instanceof VirtualVoiceSquareTopBtnView) {
                VirtualVoiceSquareTopBtnView virtualVoiceSquareTopBtnView = (VirtualVoiceSquareTopBtnView) childAt;
                if (virtualVoiceSquareTopBtnView.m72116c(bLiveVoiceSquareButton.type)) {
                    virtualVoiceSquareTopBtnView.m72118e(bLiveVoiceSquareButton.showRedDot);
                }
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m129625A(final Act act, List<BLiveVoiceSquareButton> list) {
        VLinear rightIconContainer = this.f102886a.getRightIconContainer();
        if (!m129623s(list)) {
            if (jyb.m147479J(list) && rightIconContainer.getChildCount() == 0) {
                this.f102886a.setRightIconViews((View[]) this.f102889d.toArray(new View[0]));
                return;
            } else {
                if (jyb.m147479J(list)) {
                    return;
                }
                m129624z(list);
                return;
            }
        }
        this.f102891f.clear();
        this.f102890e.clear();
        rightIconContainer.removeAllViews();
        final ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(list)) {
            this.f102891f.addAll(list);
            jyb.m147537z(this.f102891f, new y20() { // from class: l.f9v
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f97914a.m129631w(arrayList, act, (BLiveVoiceSquareButton) obj);
                }
            });
        }
        this.f102890e.addAll(arrayList);
        this.f102890e.addAll(this.f102889d);
        this.f102886a.m224835z((View[]) this.f102890e.toArray(new View[0]));
    }

    /* JADX INFO: renamed from: B */
    public void m129626B(BLiveVoiceLiveAssert bLiveVoiceLiveAssert) {
        this.f102888c = bLiveVoiceLiveAssert;
        bnl0.m105524M(this.f102887b, NullChecker.m82486a(bLiveVoiceLiveAssert) && bLiveVoiceLiveAssert.showMyGuild);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public void m129628q(Act act, BLiveSquareTab bLiveSquareTab) {
        VText vText = new VText(act);
        vText.setText("在线交友");
        vText.setTextSize(21.0f);
        vText.setTextColor(act.getResources().getColor(m9c0.f135369C));
        vText.setTypeface(null, 1);
        vText.setMaxLines(1);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setPadding(0, qa00.f156316c, 0, 0);
        this.f102886a.setTitleView(vText);
        this.f102886a.setBackgroundResource(m9c0.f135374H);
        if (this.f102892g) {
            m129632x(act, bLiveSquareTab, vText);
        } else {
            m129633y(act);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m129629u(Act act, View view) {
        BLiveVoiceLiveAssert bLiveVoiceLiveAssert = this.f102888c;
        if (bLiveVoiceLiveAssert == null) {
            return;
        }
        Intent intentM70066d2 = LiveWebViewAct.m70066d2(act, bLiveVoiceLiveAssert.myGuildH5Link);
        intentM70066d2.putExtra("extra_is_need_status_bar_hide", true);
        act.startActivity(intentM70066d2);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m129630v(Act act, View view) {
        BLiveVoiceLiveAssert bLiveVoiceLiveAssert = this.f102888c;
        if (bLiveVoiceLiveAssert == null) {
            return;
        }
        Intent intentM70066d2 = LiveWebViewAct.m70066d2(act, bLiveVoiceLiveAssert.myGuildH5Link);
        intentM70066d2.putExtra("extra_is_need_status_bar_hide", true);
        act.startActivity(intentM70066d2);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m129631w(List list, Act act, BLiveVoiceSquareButton bLiveVoiceSquareButton) {
        list.add(m129620m(act, bLiveVoiceSquareButton));
    }

    /* JADX INFO: renamed from: x */
    public final void m129632x(final Act act, BLiveSquareTab bLiveSquareTab, VText vText) {
        VImage vImage = new VImage(act);
        vImage.setImageDrawable(act.getDrawable(nbc0.f141189p1));
        bnl0.m105509E0(vImage, new View.OnClickListener() { // from class: l.a9v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g9v.m129615e(act, view);
            }
        });
        VImage vImage2 = new VImage(act);
        vImage2.setImageDrawable(act.getDrawable(nbc0.f141085A));
        bnl0.m105509E0(vImage2, new View.OnClickListener() { // from class: l.b9v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Act act2 = act;
                act2.startActivity(LiveIndependentSettingAct.m71882Z1(act2, "live_internal_my_room_frag", null));
            }
        });
        VImage vImage3 = new VImage(act);
        vImage3.setImageDrawable(act.getDrawable(nbc0.f141088B));
        bnl0.m105509E0(vImage3, new View.OnClickListener() { // from class: l.c9v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Act act2 = act;
                act2.startActivity(LiveIndependentSettingAct.m71882Z1(act2, "live_internal_voice_search", null));
            }
        });
        VImage vImage4 = new VImage(act);
        this.f102887b = vImage4;
        vImage4.setImageDrawable(act.getDrawable(nbc0.f141090B1));
        bnl0.m105509E0(this.f102887b, new View.OnClickListener() { // from class: l.d9v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85820a.m129629u(act, view);
            }
        });
        bnl0.m105525M0(this.f102887b, false);
        this.f102889d.add(this.f102887b);
        this.f102889d.add(vImage);
        this.f102889d.add(vImage3);
        this.f102889d.add(vImage2);
        act.setStatusBarColor(act.color(m9c0.f135378c));
        if (bLiveSquareTab != null) {
            vText.setText("");
            return;
        }
        act.setNavigationBarColor(act.color(m9c0.f135378c));
        VImage vImage5 = new VImage(act);
        vImage5.setImageDrawable(act.getDrawable(nbc0.f141180m1));
        this.f102886a.setLeftIconView(vImage5);
        this.f102886a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.e9v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                act.m68056e2();
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final void m129633y(final Act act) {
        VImage vImage = new VImage(act);
        vImage.setImageDrawable(act.getDrawable(nbc0.f141180m1));
        this.f102886a.setLeftIconView(vImage);
        this.f102886a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.x8v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                act.m68056e2();
            }
        });
        VImage vImage2 = new VImage(act);
        vImage2.setImageDrawable(act.getDrawable(nbc0.f141189p1));
        bnl0.m105509E0(vImage2, new View.OnClickListener() { // from class: l.y8v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g9v.m129617i(act, view);
            }
        });
        VImage vImage3 = new VImage(act);
        this.f102887b = vImage3;
        vImage3.setImageDrawable(act.getDrawable(nbc0.f141090B1));
        bnl0.m105509E0(this.f102887b, new View.OnClickListener() { // from class: l.z8v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203419a.m129630v(act, view);
            }
        });
        bnl0.m105525M0(this.f102887b, false);
        this.f102893h = new VFrame(act);
        this.f102889d.add(this.f102887b);
        this.f102889d.add(vImage2);
        this.f102889d.add(this.f102893h);
        act.setStatusBarColor(act.color(m9c0.f135378c));
        act.setNavigationBarColor(act.color(m9c0.f135378c));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(w8v w8vVar) {
    }
}
