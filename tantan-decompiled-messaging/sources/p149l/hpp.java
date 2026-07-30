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
public class hpp implements s7m<epp> {

    /* JADX INFO: renamed from: a */
    public epp f108952a;

    /* JADX INFO: renamed from: b */
    public IntlVoiceBgPagerView f108953b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m132371a(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, d1q d1qVar) {
        if (d1qVar instanceof lvn0) {
            ((lvn0) d1qVar).m151902I(bLiveVoiceBackGroundPics);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(epp eppVar) {
        this.f108952a = eppVar;
        this.f108953b = new IntlVoiceBgPagerView(this.f108952a.act(), this.f108952a.act().getString(R$string.f47069Xi));
    }

    /* JADX INFO: renamed from: d */
    public IntlVoiceBgPagerView m132374d() {
        return this.f108953b;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m132375e(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, View view) {
        if (bLiveVoiceBackGroundPics.check) {
            return;
        }
        this.f108952a.m117665M3(bLiveVoiceBackGroundPics);
    }

    /* JADX INFO: renamed from: f */
    public void m132376f(List<BLiveVoiceBackGroundPics> list) {
        ArrayList arrayList = new ArrayList();
        for (final BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics : list) {
            lvn0 lvn0Var = new lvn0(bLiveVoiceBackGroundPics, "me");
            lvn0Var.mo109662A(new View.OnClickListener() { // from class: l.fpp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f98728a.m132375e(bLiveVoiceBackGroundPics, view);
                }
            });
            arrayList.add(lvn0Var);
        }
        this.f108953b.m78410d(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public void m132377i(final BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        vwb.m200354z(this.f108953b.getModels(), new e30() { // from class: l.gpp
            @Override // p149l.e30
            public final void call(Object obj) {
                hpp.m132371a(bLiveVoiceBackGroundPics, (d1q) obj);
            }
        });
        this.f108953b.m78409c();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
