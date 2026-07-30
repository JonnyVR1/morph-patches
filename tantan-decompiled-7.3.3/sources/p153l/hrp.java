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
public class hrp implements iam<erp> {

    /* JADX INFO: renamed from: a */
    public erp f111376a;

    /* JADX INFO: renamed from: b */
    public IntlVoiceBgPagerView f111377b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m136912a(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, d3q d3qVar) {
        if (d3qVar instanceof p4o0) {
            ((p4o0) d3qVar).m170575I(bLiveVoiceBackGroundPics);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(erp erpVar) {
        this.f111376a = erpVar;
        this.f111377b = new IntlVoiceBgPagerView(this.f111376a.act(), this.f111376a.act().getString(R$string.f47917Xi));
    }

    /* JADX INFO: renamed from: d */
    public IntlVoiceBgPagerView m136915d() {
        return this.f111377b;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m136916e(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, View view) {
        if (bLiveVoiceBackGroundPics.check) {
            return;
        }
        this.f111376a.m122236M3(bLiveVoiceBackGroundPics);
    }

    /* JADX INFO: renamed from: f */
    public void m136917f(List<BLiveVoiceBackGroundPics> list) {
        ArrayList arrayList = new ArrayList();
        for (final BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics : list) {
            p4o0 p4o0Var = new p4o0(bLiveVoiceBackGroundPics, "me");
            p4o0Var.mo113881A(new View.OnClickListener() { // from class: l.frp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f100443a.m136916e(bLiveVoiceBackGroundPics, view);
                }
            });
            arrayList.add(p4o0Var);
        }
        this.f111377b.m79593d(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public void m136918i(final BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        jyb.m147537z(this.f111377b.getModels(), new y20() { // from class: l.grp
            @Override // p153l.y20
            public final void call(Object obj) {
                hrp.m136912a(bLiveVoiceBackGroundPics, (d3q) obj);
            }
        });
        this.f111377b.m79592c();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
