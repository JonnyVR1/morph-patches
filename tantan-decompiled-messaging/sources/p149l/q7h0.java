package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveComplexCard;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class q7h0 implements o7h0 {

    /* JADX INFO: renamed from: a */
    public um10 f153046a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m173258a(BLiveEnvelope bLiveEnvelope) {
        List<BLiveComplexCard> list = bLiveEnvelope.data.complexCardList;
        if (list == null || list.size() == 0) {
            return null;
        }
        return bLiveEnvelope.data;
    }

    /* JADX INFO: renamed from: b */
    public static C22306c<? extends Object> m173259b() {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m67315u(ytr.m216076e("/complex-card"), new mt0[0]), "getComplexCardData").map(new w9j() { // from class: l.p7h0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return q7h0.m173258a((BLiveEnvelope) obj);
            }
        });
    }

    @Override // p149l.o7h0
    /* JADX INFO: renamed from: c */
    public void mo162976c(int i, View view, Object obj) {
        mep0.m154302d1(view, t100.m186890d(20.0f));
        if (i == 0 && this.f153046a == null) {
            im10.m137060e();
        }
        if (i != 0 || obj == null) {
            return;
        }
        this.f153046a = new um10(view, obj);
    }

    @Override // p149l.o7h0
    /* JADX INFO: renamed from: d */
    public ArrayList<Integer> mo162977d() {
        return (ArrayList) s9s.f163228b.m195583A3().swipeCardConfig.positions;
    }

    @Override // p149l.o7h0
    /* JADX INFO: renamed from: e */
    public boolean mo162978e() {
        BLiveSettings bLiveSettingsM195583A3;
        BLiveCommonConfig bLiveCommonConfig;
        mo162979f();
        uut uutVar = s9s.f163228b;
        if (uutVar == null || (bLiveSettingsM195583A3 = uutVar.m195583A3()) == null || (bLiveCommonConfig = bLiveSettingsM195583A3.swipeCardConfig) == null) {
            return false;
        }
        return bLiveCommonConfig.f44350on;
    }

    @Override // p149l.o7h0
    /* JADX INFO: renamed from: f */
    public void mo162979f() {
        um10 um10Var = this.f153046a;
        if (um10Var != null) {
            um10Var.m194298k();
            this.f153046a = null;
        }
    }

    @Override // p149l.o7h0
    /* JADX INFO: renamed from: g */
    public void mo162980g(String str, String str2) {
        im10.m137058a(str, str2);
    }

    @Override // p149l.o7h0
    /* JADX INFO: renamed from: h */
    public View mo162981h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(s6c0.f162793s0, viewGroup, false);
    }

    @Override // p149l.o7h0
    /* JADX INFO: renamed from: i */
    public C22306c<? extends Object> mo162982i() {
        return m173259b();
    }
}
