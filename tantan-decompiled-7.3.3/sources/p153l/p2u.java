package p153l;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.LiveVoiceInternalCommonFrag;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareTabBean;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class p2u extends bvu {

    /* JADX INFO: renamed from: l */
    public final List<LiveVoiceInternalSquareTabBean> f150310l;

    /* JADX INFO: renamed from: m */
    public final String f150311m;

    /* JADX INFO: renamed from: n */
    public final nus f150312n;

    public p2u(nus nusVar, String str) {
        super(nusVar.f143738b.getChildFragmentManager(), true, 0, 0);
        this.f150310l = new ArrayList();
        this.f150311m = str;
        this.f150312n = nusVar;
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f150310l.size();
    }

    @Override // p153l.bvu
    /* JADX INFO: renamed from: k */
    public LiveVPagerBaseFrag mo106611k(int i) {
        LiveVoiceInternalCommonFrag liveVoiceInternalCommonFrag = new LiveVoiceInternalCommonFrag();
        Bundle bundle = new Bundle();
        bundle.putString("tab_name_extra", this.f150310l.get(i).getName());
        bundle.putString("tab_id_extra", this.f150310l.get(i).getTabId());
        bundle.putString("source_extra", this.f150311m);
        liveVoiceInternalCommonFrag.setArguments(bundle);
        liveVoiceInternalCommonFrag.m71050Y4(new pcj() { // from class: l.o2u
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f144786a.m170400m();
            }
        });
        liveVoiceInternalCommonFrag.m72006T4(false);
        return liveVoiceInternalCommonFrag;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ nus m170400m() {
        return this.f150312n;
    }

    /* JADX INFO: renamed from: n */
    public void m170401n(int i) {
        Fragment item = getItem(i);
        if (item instanceof LiveVoiceInternalCommonFrag) {
            ((LiveVoiceInternalCommonFrag) item).m71052p();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m170402o(int i) {
        if (getCount() == 0) {
            return;
        }
        ((LiveVPagerBaseFrag) getItem(i)).m72006T4(true);
    }

    /* JADX INFO: renamed from: p */
    public void m170403p(int i) {
        if (getCount() == 0) {
            return;
        }
        ((LiveVPagerBaseFrag) getItem(i)).m72006T4(false);
    }

    /* JADX INFO: renamed from: q */
    public void m170404q(List<LiveVoiceInternalSquareTabBean> list) {
        this.f150310l.clear();
        this.f150310l.addAll(list);
    }
}
