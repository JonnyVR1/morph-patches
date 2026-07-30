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
import l.d1q;
import l.e30;
import l.s7m;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hpp implements s7m<epp> {

    /* JADX INFO: renamed from: a */
    public epp f14216a;

    /* JADX INFO: renamed from: b */
    public IntlVoiceBgPagerView f14217b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15922a(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, d1q d1qVar) {
        if (d1qVar instanceof lvn0) {
            ((lvn0) d1qVar).m18060I(bLiveVoiceBackGroundPics);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m15924C0() {
        return null;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m15930i1(epp eppVar) {
        this.f14216a = eppVar;
        this.f14217b = new IntlVoiceBgPagerView((Context) this.f14216a.act(), this.f14216a.act().getString(R.string.Xi));
    }

    /* JADX INFO: renamed from: d */
    public IntlVoiceBgPagerView m15926d() {
        return this.f14217b;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m15927e(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, View view) {
        if (bLiveVoiceBackGroundPics.check) {
            return;
        }
        this.f14216a.m14085M3(bLiveVoiceBackGroundPics);
    }

    /* JADX INFO: renamed from: f */
    public void m15928f(List<BLiveVoiceBackGroundPics> list) {
        ArrayList arrayList = new ArrayList();
        for (final BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics : list) {
            lvn0 lvn0Var = new lvn0(bLiveVoiceBackGroundPics, "me");
            lvn0Var.A(new View.OnClickListener() { // from class: l.fpp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13134a.m15927e(bLiveVoiceBackGroundPics, view);
                }
            });
            arrayList.add(lvn0Var);
        }
        this.f14217b.m8611d(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public void m15929i(final BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        vwb.z(this.f14217b.getModels(), new e30() { // from class: l.gpp
            public final void call(Object obj) {
                hpp.m15922a(bLiveVoiceBackGroundPics, (d1q) obj);
            }
        });
        this.f14217b.m8610c();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
