package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift.PacketGiftExpirationView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftTabView;
import com.p1.mobile.android.app.Act;
import l.e30;
import l.j21;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ipj {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15283a(e30 e30Var, View view, int i, ViewGroup viewGroup) {
        if (e30Var != null) {
            e30Var.call((GiftDialogContentView) view);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m15284b(Context context, final e30<GiftDialogContentView> e30Var) {
        new j21(context).a(t6c0.f19886j1, (ViewGroup) null, new j21.e() { // from class: l.hpj
            /* JADX INFO: renamed from: a */
            public final void m14668a(View view, int i, ViewGroup viewGroup) {
                ipj.m15283a(e30Var, view, i, viewGroup);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static GiftTabView m15285c(ViewGroup viewGroup) {
        return (GiftTabView) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19951o1, viewGroup, false);
    }

    /* JADX INFO: renamed from: d */
    public static PacketGiftExpirationView m15286d(Act act) {
        return (PacketGiftExpirationView) act.inflater().inflate(t6c0.f19912l1, (ViewGroup) null);
    }
}
