package p009l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationItemWebView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceOperationItemView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import java.util.ArrayList;
import java.util.List;
import l.eb2;
import l.t6c0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class d4o0 extends eb2 {

    /* JADX INFO: renamed from: e */
    public final m4o0 f11637e;

    /* JADX INFO: renamed from: f */
    public final List<BLiveVoiceCampaign> f11638f = new ArrayList();

    public d4o0(m4o0 m4o0Var) {
        this.f11637e = m4o0Var;
    }

    public int getCount() {
        return this.f11638f.size();
    }

    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m13006o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* JADX INFO: renamed from: p */
    public Object m13007p(ViewGroup viewGroup, int i) {
        if (TextUtils.isEmpty(this.f11638f.get(i).entranceImage)) {
            VoiceNewOperationItemWebView voiceNewOperationItemWebView = (VoiceNewOperationItemWebView) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.V9, viewGroup, false);
            voiceNewOperationItemWebView.m8483j(this.f11638f.get(i), this.f11637e);
            voiceNewOperationItemWebView.setTag(Integer.valueOf(i));
            viewGroup.addView(voiceNewOperationItemWebView);
            return voiceNewOperationItemWebView;
        }
        VoiceOperationItemView voiceOperationItemView = (VoiceOperationItemView) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.X9, viewGroup, false);
        voiceOperationItemView.m8507c(this.f11638f.get(i), this.f11637e);
        voiceOperationItemView.setTag(Integer.valueOf(i));
        viewGroup.addView(voiceOperationItemView);
        return voiceOperationItemView;
    }

    /* JADX INFO: renamed from: q */
    public void m13008q(List<BLiveVoiceCampaign> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f11638f.clear();
        this.f11638f.addAll(list);
        notifyDataSetChanged();
    }
}
