package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.gears.LiveVChatGiftGearsFlyView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class vpj {

    /* JADX INFO: renamed from: a */
    public final List<LiveVChatGiftGearsFlyView> f182505a;

    /* JADX INFO: renamed from: l.vpj$a */
    public static class C20715a {
        public static vpj INSTANCE = new vpj();
    }

    public vpj() {
        this.f182505a = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public static vpj m199276b() {
        return C20715a.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public LiveVChatGiftGearsFlyView m199277a(Context context) {
        return this.f182505a.isEmpty() ? (LiveVChatGiftGearsFlyView) LayoutInflater.from(context).inflate(s6c0.f162815z1, (ViewGroup) null) : this.f182505a.remove(0);
    }

    /* JADX INFO: renamed from: c */
    public void m199278c(LiveVChatGiftGearsFlyView liveVChatGiftGearsFlyView) {
        if (liveVChatGiftGearsFlyView == null) {
            return;
        }
        ((ViewGroup) liveVChatGiftGearsFlyView.getParent()).removeView(liveVChatGiftGearsFlyView);
        liveVChatGiftGearsFlyView.m69617n();
        this.f182505a.add(liveVChatGiftGearsFlyView);
    }
}
