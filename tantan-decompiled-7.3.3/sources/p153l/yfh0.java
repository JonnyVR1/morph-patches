package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveComplexCard;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class yfh0 implements wfh0 {

    /* JADX INFO: renamed from: a */
    public cv10 f199522a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m215581a(BLiveEnvelope bLiveEnvelope) {
        List<BLiveComplexCard> list = bLiveEnvelope.data.complexCardList;
        if (list == null || list.size() == 0) {
            return null;
        }
        return bLiveEnvelope.data;
    }

    /* JADX INFO: renamed from: b */
    public static C22421c<? extends Object> m215582b() {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m68498u(zvr.m221805e("/complex-card"), new st0[0]), "getComplexCardData").map(new qcj() { // from class: l.xfh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yfh0.m215581a((BLiveEnvelope) obj);
            }
        });
    }

    @Override // p153l.wfh0
    /* JADX INFO: renamed from: c */
    public void mo206119c(int i, View view, Object obj) {
        qnp0.m177261d1(view, qa00.m175859d(20.0f));
        if (i == 0 && this.f199522a == null) {
            qu10.m178094e();
        }
        if (i != 0 || obj == null) {
            return;
        }
        this.f199522a = new cv10(view, obj);
    }

    @Override // p153l.wfh0
    /* JADX INFO: renamed from: d */
    public ArrayList<Integer> mo206120d() {
        return (ArrayList) tbs.f172989b.m203370A3().swipeCardConfig.positions;
    }

    @Override // p153l.wfh0
    /* JADX INFO: renamed from: e */
    public boolean mo206121e() {
        BLiveSettings bLiveSettingsM203370A3;
        BLiveCommonConfig bLiveCommonConfig;
        mo206122f();
        vwt vwtVar = tbs.f172989b;
        if (vwtVar == null || (bLiveSettingsM203370A3 = vwtVar.m203370A3()) == null || (bLiveCommonConfig = bLiveSettingsM203370A3.swipeCardConfig) == null) {
            return false;
        }
        return bLiveCommonConfig.f45198on;
    }

    @Override // p153l.wfh0
    /* JADX INFO: renamed from: f */
    public void mo206122f() {
        cv10 cv10Var = this.f199522a;
        if (cv10Var != null) {
            cv10Var.m112741k();
            this.f199522a = null;
        }
    }

    @Override // p153l.wfh0
    /* JADX INFO: renamed from: g */
    public void mo206123g(String str, String str2) {
        qu10.m178092a(str, str2);
    }

    @Override // p153l.wfh0
    /* JADX INFO: renamed from: h */
    public View mo206124h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(xec0.f193907s0, viewGroup, false);
    }

    @Override // p153l.wfh0
    /* JADX INFO: renamed from: i */
    public C22421c<? extends Object> mo206125i() {
        return m215582b();
    }
}
