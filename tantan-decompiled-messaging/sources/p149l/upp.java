package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.roombg.common.IntlVoiceBgPagerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class upp implements s7m<rpp> {

    /* JADX INFO: renamed from: a */
    public IntlVoiceBgPagerView f177652a;

    /* JADX INFO: renamed from: b */
    public rpp f177653b;

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rpp rppVar) {
        this.f177653b = rppVar;
        this.f177652a = new IntlVoiceBgPagerView(rppVar.act(), this.f177653b.act().getString(R$string.f47090Yi));
    }

    /* JADX INFO: renamed from: d */
    public IntlVoiceBgPagerView m194903d() {
        return this.f177652a;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m194904e(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        this.f177653b.m180386X3(bLiveVoiceBackGroundPics);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m194905f(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, View view) {
        this.f177653b.m180385W3(bLiveVoiceBackGroundPics);
    }

    /* JADX INFO: renamed from: i */
    public void m194906i(List<BLiveVoiceBackGroundPics> list) {
        ArrayList arrayList = new ArrayList();
        for (final BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics : list) {
            lvn0 lvn0Var = new lvn0(bLiveVoiceBackGroundPics, "shop", new Runnable() { // from class: l.spp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165874a.m194904e(bLiveVoiceBackGroundPics);
                }
            });
            lvn0Var.mo109662A(new View.OnClickListener() { // from class: l.tpp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f171498a.m194905f(bLiveVoiceBackGroundPics, view);
                }
            });
            arrayList.add(lvn0Var);
        }
        this.f177652a.m78410d(arrayList);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
