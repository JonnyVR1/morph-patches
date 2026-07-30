package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationItemWebView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceOperationItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class hdo0 extends lb2 {

    /* JADX INFO: renamed from: e */
    public final qdo0 f109026e;

    /* JADX INFO: renamed from: f */
    public final List<BLiveVoiceCampaign> f109027f = new ArrayList();

    public hdo0(qdo0 qdo0Var) {
        this.f109026e = qdo0Var;
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f109027f.size();
    }

    @Override // p153l.cf60
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        if (TextUtils.isEmpty(this.f109027f.get(i).entranceImage)) {
            VoiceNewOperationItemWebView voiceNewOperationItemWebView = (VoiceNewOperationItemWebView) LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198953V9, viewGroup, false);
            voiceNewOperationItemWebView.m79477j(this.f109027f.get(i), this.f109026e);
            voiceNewOperationItemWebView.setTag(Integer.valueOf(i));
            viewGroup.addView(voiceNewOperationItemWebView);
            return voiceNewOperationItemWebView;
        }
        VoiceOperationItemView voiceOperationItemView = (VoiceOperationItemView) LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198977X9, viewGroup, false);
        voiceOperationItemView.m79497c(this.f109027f.get(i), this.f109026e);
        voiceOperationItemView.setTag(Integer.valueOf(i));
        viewGroup.addView(voiceOperationItemView);
        return voiceOperationItemView;
    }

    /* JADX INFO: renamed from: q */
    public void m134612q(List<BLiveVoiceCampaign> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f109027f.clear();
        this.f109027f.addAll(list);
        notifyDataSetChanged();
    }
}
