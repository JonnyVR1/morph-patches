package com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.bean.KtvAcousticsBean;
import java.util.ArrayList;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLine;
import p151v.VLinear;
import p151v.VSwitchButton;
import p151v.VText;
import p153l.b7r;
import p153l.bnl0;
import p153l.c0s;
import p153l.iam;
import p153l.obc0;
import p153l.qa00;
import p153l.x6r;
import p153l.xzs;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
public class KtvTuningViewModel extends FrameLayout implements iam<x6r>, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VFrame f53308a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f53309b;

    /* JADX INFO: renamed from: c */
    public VImage f53310c;

    /* JADX INFO: renamed from: d */
    public VText f53311d;

    /* JADX INFO: renamed from: e */
    public VLine f53312e;

    /* JADX INFO: renamed from: f */
    public VSwitchButton f53313f;

    /* JADX INFO: renamed from: g */
    public TextView f53314g;

    /* JADX INFO: renamed from: h */
    public TextView f53315h;

    /* JADX INFO: renamed from: i */
    public VSwitchButton f53316i;

    /* JADX INFO: renamed from: j */
    public TextView f53317j;

    /* JADX INFO: renamed from: k */
    public VText f53318k;

    /* JADX INFO: renamed from: l */
    public VImage f53319l;

    /* JADX INFO: renamed from: m */
    public KtvTuningSeekBar f53320m;

    /* JADX INFO: renamed from: n */
    public VText f53321n;

    /* JADX INFO: renamed from: o */
    public VImage f53322o;

    /* JADX INFO: renamed from: p */
    public KtvTuningSeekBar f53323p;

    /* JADX INFO: renamed from: q */
    public HorizontalScrollView f53324q;

    /* JADX INFO: renamed from: r */
    public VLinear f53325r;

    /* JADX INFO: renamed from: s */
    public VImage f53326s;

    /* JADX INFO: renamed from: t */
    public VImage f53327t;

    /* JADX INFO: renamed from: u */
    public TextView f53328u;

    /* JADX INFO: renamed from: v */
    public TextView f53329v;

    /* JADX INFO: renamed from: w */
    public DialogC12774a f53330w;

    /* JADX INFO: renamed from: x */
    public x6r f53331x;

    /* JADX INFO: renamed from: y */
    public KtvAcousticsItemView f53332y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvTuningViewModel$a */
    public class C13128a implements SeekBar.OnSeekBarChangeListener {
        public C13128a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            KtvTuningViewModel.this.f53319l.setImageResource(seekBar.getProgress() == 0 ? obc0.f146095K9 : obc0.f146107L9);
            KtvTuningViewModel.this.f53331x.m209530c4(i);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvTuningViewModel$b */
    public class C13129b implements SeekBar.OnSeekBarChangeListener {
        public C13129b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            KtvTuningViewModel.this.f53322o.setImageResource(seekBar.getProgress() == 0 ? obc0.f146095K9 : obc0.f146107L9);
            KtvTuningViewModel.this.f53331x.m209528a4(i);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public KtvTuningViewModel(@NonNull Context context) {
        super(context);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public View m78304d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b7r.m102870b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(x6r x6rVar) {
        this.f53331x = x6rVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m78306f() {
        KtvAcousticsItemView ktvAcousticsItemView = this.f53332y;
        if (ktvAcousticsItemView != null) {
            ktvAcousticsItemView.setSelected(false);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m78307i(CompoundButton compoundButton, boolean z) {
        this.f53331x.m209527Z3(z);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m78304d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m78308j(CompoundButton compoundButton, boolean z) {
        this.f53331x.m209529b4(z);
    }

    /* JADX INFO: renamed from: k */
    public void m78309k(Boolean bool) {
        if (this.f53330w != null) {
            this.f53327t.setImageResource(bool.booleanValue() ? obc0.f146083J9 : obc0.f146119M9);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m78310l() {
        bnl0.m105509E0(this.f53308a, this);
        bnl0.m105509E0(this.f53310c, this);
        bnl0.m105509E0(this.f53326s, this);
        bnl0.m105509E0(this.f53329v, this);
        bnl0.m105509E0(this.f53328u, this);
        this.f53313f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.z6r
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f203180a.m78307i(compoundButton, z);
            }
        });
        this.f53316i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.a7r
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f68839a.m78308j(compoundButton, z);
            }
        });
        this.f53320m.setOnSeekBarChangeListener(new C13128a());
        this.f53323p.setOnSeekBarChangeListener(new C13129b());
        ArrayList<KtvAcousticsBean> ktvAcoustics = KtvAcousticsBean.getKtvAcoustics();
        int i = 0;
        while (i < ktvAcoustics.size()) {
            KtvAcousticsItemView ktvAcousticsItemView = (KtvAcousticsItemView) LayoutInflater.from(getContext()).inflate(yec0.f198958W2, (ViewGroup) null);
            int iMax = Math.max((int) (((bnl0.m105592y0() - qa00.m175859d(40.0f)) - ((ktvAcoustics.size() - 1) * qa00.m175859d(10.0f))) / (ktvAcoustics.size() * 1.0f)), qa00.m175859d(56.0f));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iMax, (int) ((iMax * 70) / 60.0f));
            layoutParams.leftMargin = i > 0 ? qa00.m175859d(10.0f) : 0;
            this.f53325r.addView(ktvAcousticsItemView, layoutParams);
            ktvAcousticsItemView.setTag(Integer.valueOf(ktvAcoustics.get(i).preset));
            bnl0.m105509E0(ktvAcousticsItemView, this);
            ktvAcousticsItemView.setData(ktvAcoustics.get(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m78311m(xzs xzsVar, BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        if (this.f53330w == null) {
            this.f53330w = new c0s(xzsVar, m78304d(LayoutInflater.from(getContext()), null));
            m78310l();
        }
        m78309k(Boolean.valueOf(this.f53331x.m209522T3()));
        this.f53320m.setProgress(this.f53331x.m209521R3());
        this.f53323p.setProgress(this.f53331x.m209520P3());
        this.f53330w.show();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == this.f53310c.getId() || view.getId() == this.f53308a.getId()) {
            DialogC12774a dialogC12774a = this.f53330w;
            if (dialogC12774a != null) {
                dialogC12774a.dismiss();
                return;
            }
            return;
        }
        if (view.getId() == this.f53326s.getId()) {
            x6r x6rVar = this.f53331x;
            if (x6rVar != null) {
                x6rVar.m209534g4(!x6rVar.m209522T3());
                return;
            }
            return;
        }
        if (view.getId() == this.f53329v.getId()) {
            this.f53331x.m209525X3();
            return;
        }
        if (view.getId() == this.f53328u.getId()) {
            this.f53331x.m209532e4();
            DialogC12774a dialogC12774a2 = this.f53330w;
            if (dialogC12774a2 != null) {
                dialogC12774a2.dismiss();
                return;
            }
            return;
        }
        if (view.getId() != this.f53309b.getId() && (view instanceof KtvAcousticsItemView)) {
            m78306f();
            KtvAcousticsItemView ktvAcousticsItemView = (KtvAcousticsItemView) view;
            this.f53332y = ktvAcousticsItemView;
            ktvAcousticsItemView.setSelected(true);
            this.f53331x.m209526Y3(((Integer) this.f53332y.getTag()).intValue());
        }
    }

    public void setAudioEffectPreset(int i) {
        for (int i2 = 0; i2 < this.f53325r.getChildCount(); i2++) {
            View childAt = this.f53325r.getChildAt(i2);
            if (((Integer) childAt.getTag()).intValue() == i) {
                childAt.performClick();
                return;
            }
        }
    }

    public void setEarClickable(Boolean bool) {
        VSwitchButton vSwitchButton = this.f53313f;
        if (vSwitchButton != null) {
            vSwitchButton.setClickable(bool.booleanValue());
        }
    }

    public void setEarSwitcher(Boolean bool) {
        this.f53313f.setChecked(bool.booleanValue());
    }

    public void setOriginalSwitcher(Boolean bool) {
        this.f53316i.setChecked(bool.booleanValue());
    }

    public KtvTuningViewModel(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
