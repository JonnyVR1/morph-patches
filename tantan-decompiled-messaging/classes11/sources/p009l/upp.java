package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.roombg.common.IntlVoiceBgPagerView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p1.mobile.putong.live.livingroom.R;
import java.util.ArrayList;
import java.util.List;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class upp implements s7m<rpp> {

    /* JADX INFO: renamed from: a */
    public IntlVoiceBgPagerView f21306a;

    /* JADX INFO: renamed from: b */
    public rpp f21307b;

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m23126C0() {
        return null;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m23132i1(rpp rppVar) {
        this.f21307b = rppVar;
        this.f21306a = new IntlVoiceBgPagerView((Context) rppVar.act(), this.f21307b.act().getString(R.string.Yi));
    }

    /* JADX INFO: renamed from: d */
    public IntlVoiceBgPagerView m23128d() {
        return this.f21306a;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m23129e(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        this.f21307b.m21776X3(bLiveVoiceBackGroundPics);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m23130f(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, View view) {
        this.f21307b.m21775W3(bLiveVoiceBackGroundPics);
    }

    /* JADX INFO: renamed from: i */
    public void m23131i(List<BLiveVoiceBackGroundPics> list) {
        ArrayList arrayList = new ArrayList();
        for (final BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics : list) {
            lvn0 lvn0Var = new lvn0(bLiveVoiceBackGroundPics, "shop", new Runnable() { // from class: l.spp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20416a.m23129e(bLiveVoiceBackGroundPics);
                }
            });
            lvn0Var.A(new View.OnClickListener() { // from class: l.tpp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20818a.m23130f(bLiveVoiceBackGroundPics, view);
                }
            });
            arrayList.add(lvn0Var);
        }
        this.f21306a.m8611d(arrayList);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
