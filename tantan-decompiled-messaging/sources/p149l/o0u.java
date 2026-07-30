package p149l;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.LiveVoiceInternalCommonFrag;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareTabBean;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class o0u extends atu {

    /* JADX INFO: renamed from: l */
    public final List<LiveVoiceInternalSquareTabBean> f141371l;

    /* JADX INFO: renamed from: m */
    public final String f141372m;

    /* JADX INFO: renamed from: n */
    public final mss f141373n;

    public o0u(mss mssVar, String str) {
        super(mssVar.f135531b.getChildFragmentManager(), true, 0, 0);
        this.f141371l = new ArrayList();
        this.f141372m = str;
        this.f141373n = mssVar;
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f141371l.size();
    }

    @Override // p149l.atu
    /* JADX INFO: renamed from: k */
    public LiveVPagerBaseFrag mo98885k(int i) {
        LiveVoiceInternalCommonFrag liveVoiceInternalCommonFrag = new LiveVoiceInternalCommonFrag();
        Bundle bundle = new Bundle();
        bundle.putString("tab_name_extra", this.f141371l.get(i).getName());
        bundle.putString("tab_id_extra", this.f141371l.get(i).getTabId());
        bundle.putString("source_extra", this.f141372m);
        liveVoiceInternalCommonFrag.setArguments(bundle);
        liveVoiceInternalCommonFrag.m69867Y4(new v9j() { // from class: l.n0u
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f136585a.m162172m();
            }
        });
        liveVoiceInternalCommonFrag.m70823T4(false);
        return liveVoiceInternalCommonFrag;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ mss m162172m() {
        return this.f141373n;
    }

    /* JADX INFO: renamed from: n */
    public void m162173n(int i) {
        Fragment item = getItem(i);
        if (item instanceof LiveVoiceInternalCommonFrag) {
            ((LiveVoiceInternalCommonFrag) item).m69869q();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m162174o(int i) {
        if (getCount() == 0) {
            return;
        }
        ((LiveVPagerBaseFrag) getItem(i)).m70823T4(true);
    }

    /* JADX INFO: renamed from: p */
    public void m162175p(int i) {
        if (getCount() == 0) {
            return;
        }
        ((LiveVPagerBaseFrag) getItem(i)).m70823T4(false);
    }

    /* JADX INFO: renamed from: q */
    public void m162176q(List<LiveVoiceInternalSquareTabBean> list) {
        this.f141371l.clear();
        this.f141371l.addAll(list);
    }
}
