package p153l;

import android.view.View;
import android.widget.CompoundButton;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkAsset;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p070ui.datepicker.WheelView;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class sm10 extends a8t<qo10> {

    /* JADX INFO: renamed from: q */
    public BLiveMultiPkAsset f169484q;

    /* JADX INFO: renamed from: r */
    public int f169485r;

    /* JADX INFO: renamed from: s */
    public int f169486s;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m186721B(View view) {
        if (this.f68950h.getVisibility() == 0) {
            m186732H(false);
        } else {
            mo72910j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m186722C(View view) {
        this.f68953k.setText(String.format(Locale.CHINA, "%ds", Integer.valueOf(this.f169485r)));
        m186732H(false);
        ((qo10) this.f48554b).m177280X3(this.f68955m.isChecked(), this.f169485r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m186723E(View view) {
        m186732H(true);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m186729A(WheelView wheelView, s01 s01Var, int i) {
        this.f169485r = this.f169484q.durations.get(i).duration;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m186730F(CompoundButton compoundButton, boolean z) {
        if (this.f169484q.rejectInvite == z) {
            ((qo10) this.f48554b).m177280X3(z, this.f169485r);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m186731G(BLiveMultiPkAsset bLiveMultiPkAsset) {
        this.f169484q = bLiveMultiPkAsset;
        this.f68955m.setChecked(!bLiveMultiPkAsset.rejectInvite);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bLiveMultiPkAsset.durations.size(); i++) {
            arrayList.add(bLiveMultiPkAsset.durations.get(i).duration + BLiveStormDanmakuGiftResourceType.f45294s);
            if (bLiveMultiPkAsset.durations.get(i).picked) {
                this.f169486s = i;
                this.f169485r = bLiveMultiPkAsset.durations.get(i).duration;
                this.f68953k.setText(String.format(Locale.CHINA, "%ds", Integer.valueOf(bLiveMultiPkAsset.durations.get(i).duration)));
            }
        }
        this.f68958p.setData(arrayList);
        this.f68958p.setSelectedPosition(this.f169486s);
    }

    /* JADX INFO: renamed from: H */
    public final void m186732H(boolean z) {
        this.f68950h.setVisibility(z ? 0 : 8);
        this.f68956n.setVisibility(z ? 0 : 8);
        this.f68949g.setText(z ? "PK时长" : "PK设置");
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    public void init() {
        super.init();
        this.f68958p.setNormalTextColor(this.f68956n.getResources().getColor(n9c0.f140835i1));
        this.f68958p.setSelectedTextColor(this.f68956n.getResources().getColor(n9c0.f140856p1));
        this.f68958p.setTextSize(18.0f);
        this.f68958p.setLineSpacing(35.0f);
        qnp0.m177261d1(this.f68957o, 10);
        this.f68958p.setOnItemSelectedListener(new pm50() { // from class: l.nm10
            @Override // p153l.pm50
            /* JADX INFO: renamed from: c */
            public final void mo163801c(WheelView wheelView, s01 s01Var, int i) {
                this.f142612a.m186729A(wheelView, s01Var, i);
            }
        });
        this.f68956n.setVisibility(8);
        this.f68950h.setVisibility(8);
        bnl0.m105509E0(this.f68948f, new View.OnClickListener() { // from class: l.om10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147891a.m186721B(view);
            }
        });
        bnl0.m105509E0(this.f68950h, new View.OnClickListener() { // from class: l.pm10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153116a.m186722C(view);
            }
        });
        bnl0.m105509E0(this.f68953k, new View.OnClickListener() { // from class: l.qm10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158291a.m186723E(view);
            }
        });
        this.f68955m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.rm10
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f163819a.m186730F(compoundButton, z);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo72911k() {
        return obc0.f146517v;
    }
}
