package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.packetgift.PacketGiftExpirationView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftTabView;

/* JADX INFO: loaded from: classes4.dex */
public class yrj {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m217167a(y20 y20Var, View view, int i, ViewGroup viewGroup) {
        if (y20Var != null) {
            y20Var.call((GiftDialogContentView) view);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m217168b(Context context, final y20<GiftDialogContentView> y20Var) {
        new q21(context).m174961a(yec0.f199122j1, null, new q21.InterfaceC19499e() { // from class: l.xrj
            @Override // p153l.q21.InterfaceC19499e
            /* JADX INFO: renamed from: a */
            public final void mo174967a(View view, int i, ViewGroup viewGroup) {
                yrj.m217167a(y20Var, view, i, viewGroup);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static GiftTabView m217169c(ViewGroup viewGroup) {
        return (GiftTabView) LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199187o1, viewGroup, false);
    }

    /* JADX INFO: renamed from: d */
    public static PacketGiftExpirationView m217170d(Act act) {
        return (PacketGiftExpirationView) act.inflater().inflate(yec0.f199148l1, (ViewGroup) null);
    }
}
