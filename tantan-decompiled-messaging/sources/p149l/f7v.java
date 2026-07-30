package p149l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLiveAssert;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSquareButton;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p046p1.mobile.putong.live.external.view.widgets.VirtualVoiceSquareTopBtnView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class f7v implements s7m<v6v> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f96287a;

    /* JADX INFO: renamed from: b */
    public VImage f96288b;

    /* JADX INFO: renamed from: c */
    public BLiveVoiceLiveAssert f96289c;

    /* JADX INFO: renamed from: d */
    public final List<View> f96290d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List<View> f96291e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final List<BLiveVoiceSquareButton> f96292f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final boolean f96293g;

    /* JADX INFO: renamed from: h */
    public VFrame f96294h;

    public f7v(VNavigationBar vNavigationBar, boolean z) {
        this.f96287a = vNavigationBar;
        this.f96293g = z;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m119825e(Act act, View view) {
        act.startActivity(m119832p(act));
        zvf0.m220396r("e_audio_room_rank_button", "p_audio_explore_recommend");
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m119827i(Act act, View view) {
        act.startActivity(m119832p(act));
        zvf0.m220396r("e_audio_room_rank_button", "p_audio_explore_recommend");
    }

    /* JADX INFO: renamed from: m */
    private View m119830m(Act act, BLiveVoiceSquareButton bLiveVoiceSquareButton) {
        VirtualVoiceSquareTopBtnView virtualVoiceSquareTopBtnView = new VirtualVoiceSquareTopBtnView(act);
        virtualVoiceSquareTopBtnView.m70934d(bLiveVoiceSquareButton);
        return virtualVoiceSquareTopBtnView;
    }

    /* JADX INFO: renamed from: n */
    private boolean m119831n(List<BLiveVoiceSquareButton> list) {
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).type, this.f96292f.get(i).type)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static Intent m119832p(Context context) {
        Intent intentM68883c2 = LiveWebViewAct.m68883c2(context, ddv.m111072e());
        intentM68883c2.putExtra("extra_is_need_status_bar_hide", true);
        return intentM68883c2;
    }

    /* JADX INFO: renamed from: s */
    private boolean m119833s(List<BLiveVoiceSquareButton> list) {
        return (list.size() == this.f96292f.size() && m119831n(list)) ? false : true;
    }

    /* JADX INFO: renamed from: z */
    private void m119834z(List<BLiveVoiceSquareButton> list) {
        VLinear rightIconContainer = this.f96287a.getRightIconContainer();
        for (int i = 0; i < list.size() && i < rightIconContainer.getChildCount(); i++) {
            View childAt = rightIconContainer.getChildAt(i);
            BLiveVoiceSquareButton bLiveVoiceSquareButton = list.get(i);
            if (childAt instanceof VirtualVoiceSquareTopBtnView) {
                VirtualVoiceSquareTopBtnView virtualVoiceSquareTopBtnView = (VirtualVoiceSquareTopBtnView) childAt;
                if (virtualVoiceSquareTopBtnView.m70933c(bLiveVoiceSquareButton.type)) {
                    virtualVoiceSquareTopBtnView.m70935e(bLiveVoiceSquareButton.showRedDot);
                }
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m119835A(final Act act, List<BLiveVoiceSquareButton> list) {
        VLinear rightIconContainer = this.f96287a.getRightIconContainer();
        if (!m119833s(list)) {
            if (vwb.m200296J(list) && rightIconContainer.getChildCount() == 0) {
                this.f96287a.setRightIconViews((View[]) this.f96290d.toArray(new View[0]));
                return;
            } else {
                if (vwb.m200296J(list)) {
                    return;
                }
                m119834z(list);
                return;
            }
        }
        this.f96292f.clear();
        this.f96291e.clear();
        rightIconContainer.removeAllViews();
        final ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(list)) {
            this.f96292f.addAll(list);
            vwb.m200354z(this.f96292f, new e30() { // from class: l.e7v
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f89752a.m119841w(arrayList, act, (BLiveVoiceSquareButton) obj);
                }
            });
        }
        this.f96291e.addAll(arrayList);
        this.f96291e.addAll(this.f96290d);
        this.f96287a.m223589z((View[]) this.f96291e.toArray(new View[0]));
    }

    /* JADX INFO: renamed from: B */
    public void m119836B(BLiveVoiceLiveAssert bLiveVoiceLiveAssert) {
        this.f96289c = bLiveVoiceLiveAssert;
        xdl0.m208344M(this.f96288b, NullChecker.m81303a(bLiveVoiceLiveAssert) && bLiveVoiceLiveAssert.showMyGuild);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public void m119838q(Act act, BLiveSquareTab bLiveSquareTab) {
        VText vText = new VText(act);
        vText.setText("在线交友");
        vText.setTextSize(21.0f);
        vText.setTextColor(act.getResources().getColor(g1c0.f100139C));
        vText.setTypeface(null, 1);
        vText.setMaxLines(1);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setPadding(0, t100.f167254c, 0, 0);
        this.f96287a.setTitleView(vText);
        this.f96287a.setBackgroundResource(g1c0.f100144H);
        if (this.f96293g) {
            m119842x(act, bLiveSquareTab, vText);
        } else {
            m119843y(act);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m119839u(Act act, View view) {
        BLiveVoiceLiveAssert bLiveVoiceLiveAssert = this.f96289c;
        if (bLiveVoiceLiveAssert == null) {
            return;
        }
        Intent intentM68883c2 = LiveWebViewAct.m68883c2(act, bLiveVoiceLiveAssert.myGuildH5Link);
        intentM68883c2.putExtra("extra_is_need_status_bar_hide", true);
        act.startActivity(intentM68883c2);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m119840v(Act act, View view) {
        BLiveVoiceLiveAssert bLiveVoiceLiveAssert = this.f96289c;
        if (bLiveVoiceLiveAssert == null) {
            return;
        }
        Intent intentM68883c2 = LiveWebViewAct.m68883c2(act, bLiveVoiceLiveAssert.myGuildH5Link);
        intentM68883c2.putExtra("extra_is_need_status_bar_hide", true);
        act.startActivity(intentM68883c2);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m119841w(List list, Act act, BLiveVoiceSquareButton bLiveVoiceSquareButton) {
        list.add(m119830m(act, bLiveVoiceSquareButton));
    }

    /* JADX INFO: renamed from: x */
    public final void m119842x(final Act act, BLiveSquareTab bLiveSquareTab, VText vText) {
        VImage vImage = new VImage(act);
        vImage.setImageDrawable(act.getDrawable(h3c0.f105698p1));
        xdl0.m208329E0(vImage, new View.OnClickListener() { // from class: l.z6v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f7v.m119825e(act, view);
            }
        });
        VImage vImage2 = new VImage(act);
        vImage2.setImageDrawable(act.getDrawable(h3c0.f105594A));
        xdl0.m208329E0(vImage2, new View.OnClickListener() { // from class: l.a7v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Act act2 = act;
                act2.startActivity(LiveIndependentSettingAct.m70699Y1(act2, "live_internal_my_room_frag", null));
            }
        });
        VImage vImage3 = new VImage(act);
        vImage3.setImageDrawable(act.getDrawable(h3c0.f105597B));
        xdl0.m208329E0(vImage3, new View.OnClickListener() { // from class: l.b7v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Act act2 = act;
                act2.startActivity(LiveIndependentSettingAct.m70699Y1(act2, "live_internal_voice_search", null));
            }
        });
        VImage vImage4 = new VImage(act);
        this.f96288b = vImage4;
        vImage4.setImageDrawable(act.getDrawable(h3c0.f105599B1));
        xdl0.m208329E0(this.f96288b, new View.OnClickListener() { // from class: l.c7v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79649a.m119839u(act, view);
            }
        });
        xdl0.m208345M0(this.f96288b, false);
        this.f96290d.add(this.f96288b);
        this.f96290d.add(vImage);
        this.f96290d.add(vImage3);
        this.f96290d.add(vImage2);
        act.setStatusBarColor(act.color(g1c0.f100148c));
        if (bLiveSquareTab != null) {
            vText.setText("");
            return;
        }
        act.setNavigationBarColor(act.color(g1c0.f100148c));
        VImage vImage5 = new VImage(act);
        vImage5.setImageDrawable(act.getDrawable(h3c0.f105689m1));
        this.f96287a.setLeftIconView(vImage5);
        this.f96287a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.d7v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                act.m66873d2();
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final void m119843y(final Act act) {
        VImage vImage = new VImage(act);
        vImage.setImageDrawable(act.getDrawable(h3c0.f105689m1));
        this.f96287a.setLeftIconView(vImage);
        this.f96287a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.w6v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                act.m66873d2();
            }
        });
        VImage vImage2 = new VImage(act);
        vImage2.setImageDrawable(act.getDrawable(h3c0.f105698p1));
        xdl0.m208329E0(vImage2, new View.OnClickListener() { // from class: l.x6v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f7v.m119827i(act, view);
            }
        });
        VImage vImage3 = new VImage(act);
        this.f96288b = vImage3;
        vImage3.setImageDrawable(act.getDrawable(h3c0.f105599B1));
        xdl0.m208329E0(this.f96288b, new View.OnClickListener() { // from class: l.y6v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196642a.m119840v(act, view);
            }
        });
        xdl0.m208345M0(this.f96288b, false);
        this.f96294h = new VFrame(act);
        this.f96290d.add(this.f96288b);
        this.f96290d.add(vImage2);
        this.f96290d.add(this.f96294h);
        act.setStatusBarColor(act.color(g1c0.f100148c));
        act.setNavigationBarColor(act.color(g1c0.f100148c));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(v6v v6vVar) {
    }
}
