package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationItemWebView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceOperationItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class d4o0 extends eb2 {

    /* JADX INFO: renamed from: e */
    public final m4o0 f84330e;

    /* JADX INFO: renamed from: f */
    public final List<BLiveVoiceCampaign> f84331f = new ArrayList();

    public d4o0(m4o0 m4o0Var) {
        this.f84330e = m4o0Var;
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f84331f.size();
    }

    @Override // p149l.w660
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        if (TextUtils.isEmpty(this.f84331f.get(i).entranceImage)) {
            VoiceNewOperationItemWebView voiceNewOperationItemWebView = (VoiceNewOperationItemWebView) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168221V9, viewGroup, false);
            voiceNewOperationItemWebView.m78294j(this.f84331f.get(i), this.f84330e);
            voiceNewOperationItemWebView.setTag(Integer.valueOf(i));
            viewGroup.addView(voiceNewOperationItemWebView);
            return voiceNewOperationItemWebView;
        }
        VoiceOperationItemView voiceOperationItemView = (VoiceOperationItemView) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168245X9, viewGroup, false);
        voiceOperationItemView.m78314c(this.f84331f.get(i), this.f84330e);
        voiceOperationItemView.setTag(Integer.valueOf(i));
        viewGroup.addView(voiceOperationItemView);
        return voiceOperationItemView;
    }

    /* JADX INFO: renamed from: q */
    public void m109995q(List<BLiveVoiceCampaign> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f84331f.clear();
        this.f84331f.addAll(list);
        notifyDataSetChanged();
    }
}
