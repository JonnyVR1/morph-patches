package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.gears.LiveVChatGiftGearsFlyView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class lsj {

    /* JADX INFO: renamed from: a */
    public final List<LiveVChatGiftGearsFlyView> f133430a;

    /* JADX INFO: renamed from: l.lsj$a */
    public static class C18450a {
        public static lsj INSTANCE = new lsj();
    }

    public lsj() {
        this.f133430a = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public static lsj m155698b() {
        return C18450a.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public LiveVChatGiftGearsFlyView m155699a(Context context) {
        return this.f133430a.isEmpty() ? (LiveVChatGiftGearsFlyView) LayoutInflater.from(context).inflate(xec0.f193929z1, (ViewGroup) null) : this.f133430a.remove(0);
    }

    /* JADX INFO: renamed from: c */
    public void m155700c(LiveVChatGiftGearsFlyView liveVChatGiftGearsFlyView) {
        if (liveVChatGiftGearsFlyView == null) {
            return;
        }
        ((ViewGroup) liveVChatGiftGearsFlyView.getParent()).removeView(liveVChatGiftGearsFlyView);
        liveVChatGiftGearsFlyView.m70800n();
        this.f133430a.add(liveVChatGiftGearsFlyView);
    }
}
