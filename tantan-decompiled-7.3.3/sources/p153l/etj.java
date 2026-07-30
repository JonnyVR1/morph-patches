package p153l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftInnerContentView;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class etj {

    /* JADX INFO: renamed from: a */
    public List<jjs> f95758a;

    /* JADX INFO: renamed from: b */
    public final String f95759b;

    public etj(List<jjs> list, String str) {
        this.f95758a = list;
        this.f95759b = str;
    }

    /* JADX INFO: renamed from: a */
    public void m122459a(LiveVChatGiftInnerContentView liveVChatGiftInnerContentView, vlu<?> vluVar) {
        liveVChatGiftInnerContentView.m70598I(this, vluVar);
    }

    /* JADX INFO: renamed from: b */
    public String m122460b() {
        return this.f95759b;
    }

    /* JADX INFO: renamed from: c */
    public LiveVChatGiftInnerContentView m122461c(ViewGroup viewGroup) {
        return (LiveVChatGiftInnerContentView) LayoutInflater.from(viewGroup.getContext()).inflate(xec0.f193771C1, viewGroup, false);
    }
}
