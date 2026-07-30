package p153l;

import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomClass;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomSubClass;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomClassesView;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class z2m0 extends LiveMenuDialogHolder<f3m0> {

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f202714k;

    /* JADX INFO: renamed from: l */
    public View f202715l;

    /* JADX INFO: renamed from: m */
    public View f202716m;

    /* JADX INFO: renamed from: n */
    public ImageView f202717n;

    /* JADX INFO: renamed from: o */
    public TextView f202718o;

    /* JADX INFO: renamed from: p */
    public ScrollView f202719p;

    /* JADX INFO: renamed from: q */
    public VirtualRoomClassesView f202720q;

    /* JADX INFO: renamed from: r */
    public TextView f202721r;

    /* JADX INFO: renamed from: s */
    public BLiveVoiceRoomSubClass f202722s;

    public z2m0(@NonNull f3m0 f3m0Var) {
        super(yec0.f198770G6, f3m0Var.act(), f3m0Var, qag0.m175922c(0.3f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m218449J(View view) {
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m218450K(View view) {
        BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass = this.f202722s;
        if (bLiveVoiceRoomSubClass != null) {
            ((f3m0) this.f48605b).m123748Z3(bLiveVoiceRoomSubClass);
            mo73021p();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m218451I(View view) {
        a3m0.m95825a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m218452L(BLiveVoiceRoomSubClass bLiveVoiceRoomSubClass) {
        this.f202722s = bLiveVoiceRoomSubClass;
    }

    /* JADX INFO: renamed from: M */
    public void m218453M(List<BLiveVoiceRoomClass> list) {
        this.f202720q.setSelectListener(new y20() { // from class: l.y2m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197268a.m218452L((BLiveVoiceRoomSubClass) obj);
            }
        });
        this.f202720q.m78668e(list);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m218451I(view);
        bnl0.m105509E0(this.f202717n, new View.OnClickListener() { // from class: l.w2m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f186916a.m218449J(view2);
            }
        });
        bnl0.m105509E0(this.f202721r, new View.OnClickListener() { // from class: l.x2m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f192159a.m218450K(view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo73024w() {
        super.mo73024w();
        this.f202720q.removeAllViews();
    }
}
