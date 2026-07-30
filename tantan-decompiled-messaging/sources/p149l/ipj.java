package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.packetgift.PacketGiftExpirationView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftTabView;

/* JADX INFO: loaded from: classes4.dex */
public class ipj {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m137486a(e30 e30Var, View view, int i, ViewGroup viewGroup) {
        if (e30Var != null) {
            e30Var.call((GiftDialogContentView) view);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m137487b(Context context, final e30<GiftDialogContentView> e30Var) {
        new j21(context).m139397a(t6c0.f168390j1, null, new j21.InterfaceC17671e() { // from class: l.hpj
            @Override // p149l.j21.InterfaceC17671e
            /* JADX INFO: renamed from: a */
            public final void mo132341a(View view, int i, ViewGroup viewGroup) {
                ipj.m137486a(e30Var, view, i, viewGroup);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static GiftTabView m137488c(ViewGroup viewGroup) {
        return (GiftTabView) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168455o1, viewGroup, false);
    }

    /* JADX INFO: renamed from: d */
    public static PacketGiftExpirationView m137489d(Act act) {
        return (PacketGiftExpirationView) act.inflater().inflate(t6c0.f168416l1, (ViewGroup) null);
    }
}
