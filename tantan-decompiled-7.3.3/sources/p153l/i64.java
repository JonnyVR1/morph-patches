package p153l;

import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.BulletType;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.DefaultBulletView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class i64 extends pf2 {

    /* JADX INFO: renamed from: c */
    public String f113134c;

    public i64(String str) {
        this.f113134c = str;
    }

    @Override // p153l.pf2
    /* JADX INFO: renamed from: i */
    public CharSequence mo114496i() {
        return this.f113134c;
    }

    @Override // p153l.pf2
    /* JADX INFO: renamed from: r */
    public void mo114498r(ViewGroup viewGroup, si3 si3Var) {
        DefaultBulletView defaultBulletViewM186000a = si3Var.m186000a(BulletType.CALL_BULLET, viewGroup);
        defaultBulletViewM186000a.setBackgroundResource(obc0.f146573z7);
        viewGroup.addView(defaultBulletViewM186000a);
        ((VDraweeView) defaultBulletViewM186000a.findViewById(mdc0.f136144c6)).setImageResource(obc0.f146284b6);
        ((TextView) defaultBulletViewM186000a.findViewById(mdc0.f135911D0)).setText(this.f113134c);
        m172070d(defaultBulletViewM186000a);
        ni3.m163267d("client_liveCall", ni3.m163264a("client_liveCall"), m172073g(), this.f152150b.mo78457R2(), "", "");
    }

    @Override // p153l.pf2
    /* JADX INFO: renamed from: o */
    public void mo114497o() {
    }
}
