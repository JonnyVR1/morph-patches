package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSquareButton;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareBean;
import com.p046p1.mobile.putong.live.external.view.widgets.VirtualVoiceSquareTopBtnView;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class vav implements s7m<sav> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f180783a;

    /* JADX INFO: renamed from: b */
    public VFrame f180784b;

    /* JADX INFO: renamed from: c */
    public VLinear f180785c;

    /* JADX INFO: renamed from: d */
    public final a8v f180786d = new a8v();

    /* JADX INFO: renamed from: e */
    public final List<BLiveVoiceSquareButton> f180787e = new ArrayList();

    public vav(VNavigationBar vNavigationBar) {
        this.f180783a = vNavigationBar;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m197653d(List<BLiveVoiceSquareButton> list) {
        if (list.size() != this.f180787e.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(this.f180787e.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m197654e(final Act act) {
        VText vText = new VText(act);
        vText.setText("在线交友");
        vText.setTextSize(21.0f);
        vText.setTextColor(act.getResources().getColor(g1c0.f100139C));
        vText.setTypeface(null, 1);
        vText.setMaxLines(1);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setPadding(0, t100.f167254c, 0, 0);
        this.f180783a.setTitleView(vText);
        this.f180783a.setBackgroundResource(g1c0.f100144H);
        this.f180784b = new VFrame(act);
        VLinear vLinear = new VLinear(act);
        this.f180785c = vLinear;
        this.f180783a.m223589z(vLinear, this.f180784b);
        this.f180783a.setLeftIconDrawable(act.getDrawable(h3c0.f105689m1));
        this.f180783a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.tav
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                act.m66873d2();
            }
        });
        act.setStatusBarColor(act.color(g1c0.f100148c));
        act.setNavigationBarColor(act.color(g1c0.f100148c));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m197655f(Act act, BLiveVoiceSquareButton bLiveVoiceSquareButton) {
        VirtualVoiceSquareTopBtnView virtualVoiceSquareTopBtnView = new VirtualVoiceSquareTopBtnView(act);
        virtualVoiceSquareTopBtnView.m70934d(bLiveVoiceSquareButton);
        int i = xdl0.f192404f;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, i);
        marginLayoutParams.leftMargin = t100.m186890d(8.0f);
        this.f180785c.addView(virtualVoiceSquareTopBtnView, marginLayoutParams);
    }

    /* JADX INFO: renamed from: i */
    public void m197656i(LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        this.f180786d.m95369h(this.f180784b, liveVoiceInternalSquareBean);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m197657j(final Act act, List<BLiveVoiceSquareButton> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (m197653d(list)) {
            this.f180787e.clear();
            this.f180787e.addAll(list);
            this.f180785c.removeAllViews();
            if (vwb.m200296J(list)) {
                return;
            }
            vwb.m200354z(list, new e30() { // from class: l.uav
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f175640a.m197655f(act, (BLiveVoiceSquareButton) obj);
                }
            });
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(sav savVar) {
    }
}
