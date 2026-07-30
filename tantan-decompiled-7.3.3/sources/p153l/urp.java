package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.roombg.common.IntlVoiceBgPagerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class urp implements iam<rrp> {

    /* JADX INFO: renamed from: a */
    public IntlVoiceBgPagerView f180667a;

    /* JADX INFO: renamed from: b */
    public rrp f180668b;

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rrp rrpVar) {
        this.f180668b = rrpVar;
        this.f180667a = new IntlVoiceBgPagerView(rrpVar.act(), this.f180668b.act().getString(R$string.f47938Yi));
    }

    /* JADX INFO: renamed from: d */
    public IntlVoiceBgPagerView m197642d() {
        return this.f180667a;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m197643e(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        this.f180668b.m182804X3(bLiveVoiceBackGroundPics);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m197644f(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, View view) {
        this.f180668b.m182803W3(bLiveVoiceBackGroundPics);
    }

    /* JADX INFO: renamed from: i */
    public void m197645i(List<BLiveVoiceBackGroundPics> list) {
        ArrayList arrayList = new ArrayList();
        for (final BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics : list) {
            p4o0 p4o0Var = new p4o0(bLiveVoiceBackGroundPics, "shop", new Runnable() { // from class: l.srp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f170362a.m197643e(bLiveVoiceBackGroundPics);
                }
            });
            p4o0Var.mo113881A(new View.OnClickListener() { // from class: l.trp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f175913a.m197644f(bLiveVoiceBackGroundPics, view);
                }
            });
            arrayList.add(p4o0Var);
        }
        this.f180667a.m79593d(arrayList);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
