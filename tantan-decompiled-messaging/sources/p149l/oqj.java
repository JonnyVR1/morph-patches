package p149l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftInnerContentView;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class oqj {

    /* JADX INFO: renamed from: a */
    public List<ihs> f145162a;

    /* JADX INFO: renamed from: b */
    public final String f145163b;

    public oqj(List<ihs> list, String str) {
        this.f145162a = list;
        this.f145163b = str;
    }

    /* JADX INFO: renamed from: a */
    public void m165459a(LiveVChatGiftInnerContentView liveVChatGiftInnerContentView, uju<?> ujuVar) {
        liveVChatGiftInnerContentView.m69415I(this, ujuVar);
    }

    /* JADX INFO: renamed from: b */
    public String m165460b() {
        return this.f145163b;
    }

    /* JADX INFO: renamed from: c */
    public LiveVChatGiftInnerContentView m165461c(ViewGroup viewGroup) {
        return (LiveVChatGiftInnerContentView) LayoutInflater.from(viewGroup.getContext()).inflate(s6c0.f162657C1, viewGroup, false);
    }
}
