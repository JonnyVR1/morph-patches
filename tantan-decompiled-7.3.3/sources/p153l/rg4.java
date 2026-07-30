package p153l;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: loaded from: classes13.dex */
public class rg4 extends ar2<bh4> {

    /* JADX INFO: renamed from: a */
    public ArrayList<Media> f162897a;

    /* JADX INFO: renamed from: b */
    public List<g90> f162898b;

    /* JADX INFO: renamed from: c */
    public MessageLocation f162899c;

    /* JADX INFO: renamed from: d */
    public boolean f162900d;

    /* JADX INFO: renamed from: e */
    public l90 f162901e;

    /* JADX INFO: renamed from: l.rg4$a */
    public class C19835a implements qol.InterfaceC19615a {
        public C19835a() {
        }

        @Override // p153l.qol.InterfaceC19615a
        /* JADX INFO: renamed from: a */
        public void mo146707a(List<g90> list) {
            rg4.this.f162898b.clear();
            if (!jyb.m147479J(list)) {
                rg4.this.f162898b.addAll(list);
            }
            ((bh4) rg4.this.viewModel).m104316Q();
        }

        @Override // p153l.qol.InterfaceC19615a
        public void onError(Throwable th) {
            ((bh4) rg4.this.viewModel).m104306G();
        }
    }

    public rg4(ner nerVar) {
        super(nerVar);
        this.f162897a = new ArrayList<>();
        this.f162898b = jyb.m147507f0(new g90());
        this.f162900d = false;
        this.f162901e = new l90(new C19835a());
    }

    /* JADX INFO: renamed from: m0 */
    private void m181317m0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
        if (NullChecker.m82486a(stringExtra)) {
            ((bh4) this.viewModel).m104310K(stringExtra);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m181318q0(Bundle bundle) {
        Intent intent = act().getIntent();
        String action = intent.getAction();
        String type = intent.getType();
        if ("android.intent.action.SEND".equals(action) && NullChecker.m82486a(type)) {
            if (MimeTypes.TEXT_PLAIN.equals(type)) {
                this.f162900d = true;
                m181317m0(intent);
            } else if (type.startsWith("image/")) {
                this.f162900d = true;
                m181322k0(intent);
            }
        } else if ("android.intent.action.SEND_MULTIPLE".equals(action) && NullChecker.m82486a(type)) {
            if (type.startsWith("image/")) {
                this.f162900d = true;
                m181323l0(intent);
            }
        } else if (!"action_send_with_media".equals(action) || !NullChecker.m82486a(type)) {
            this.f162897a = (ArrayList) act().getIntent().getSerializableExtra("images");
        } else if (type.startsWith("image/")) {
            this.f162900d = true;
            this.f162897a = (ArrayList) act().getIntent().getSerializableExtra("images");
        }
        if (jyb.m147479J(this.f162897a)) {
            this.f162897a = new ArrayList<>();
        }
        ((bh4) this.viewModel).m104325w(bundle);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.qg4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157380a.m181318q0((Bundle) obj);
            }
        });
    }

    @Override // p153l.ar2
    @NonNull
    public Act act() {
        return ((bh4) this.viewModel).getAct();
    }

    @Override // p153l.k3m
    public void destroy() {
        if (NullChecker.m82486a(this.f162901e)) {
            this.f162901e.destroy();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public List<g90> m181319h0() {
        return this.f162898b;
    }

    /* JADX INFO: renamed from: i0 */
    public void m181320i0() {
        this.f162899c = null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m181321j0(Location location) {
        this.f162901e.mo119236a(location, act());
    }

    /* JADX INFO: renamed from: k0 */
    public final void m181322k0(Intent intent) {
        m181317m0(intent);
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
        if (NullChecker.m82486a(uri)) {
            String strM168012C = oki.m168012C(h26.m133370g(uri));
            if (NullChecker.m82486a(strM168012C)) {
                Picture picture = new Picture();
                picture.url = strM168012C;
                picture.status = MediaLocalStatus.get("raw");
                this.f162897a.add(picture);
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m181323l0(Intent intent) {
        m181317m0(intent);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (NullChecker.m82486a(parcelableArrayListExtra)) {
            int size = parcelableArrayListExtra.size() <= 9 ? parcelableArrayListExtra.size() : 9;
            for (int i = 0; i < size; i++) {
                String strM168012C = oki.m168012C(h26.m133370g((Uri) parcelableArrayListExtra.get(i)));
                if (NullChecker.m82486a(strM168012C)) {
                    Picture picture = new Picture();
                    picture.url = strM168012C;
                    picture.status = MediaLocalStatus.get("raw");
                    this.f162897a.add(picture);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m181324n0() {
        this.f162901e.init();
    }

    /* JADX INFO: renamed from: o0 */
    public void m181325o0(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String string = bundle.getString("sharedText");
        if (!TextUtils.isEmpty(string)) {
            ((bh4) this.viewModel).m104315P(string);
        }
        ArrayList<Media> arrayList = (ArrayList) bundle.getSerializable("images");
        if (!jyb.m147479J(arrayList)) {
            this.f162897a = arrayList;
        }
        MessageLocation messageLocation = (MessageLocation) bundle.getSerializable("location");
        if (NullChecker.m82486a(messageLocation)) {
            this.f162899c = messageLocation;
            ((bh4) this.viewModel).m104311L(messageLocation);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m181326p0() {
        return jyb.m147479J(this.f162897a);
    }

    /* JADX INFO: renamed from: r0 */
    public void m181327r0(int i, int i2, Intent intent) {
        if (i == 1) {
            uqb0.f180370E.m80051t();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m181328s0(List<Media> list) {
        if (!NullChecker.m82487b(list) || list.size() <= 0 || !(list.get(0) instanceof Video) || new vel0(oki.m168038z(list.get(0).url)).f183806b <= 15000) {
            ((bh4) this.viewModel).m104312M(list);
        } else {
            o1j0.m165634h(R$string.f40035z3);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m181329t0() {
        if (!((bh4) this.viewModel).m104321q() || act().isFinishing()) {
            return true;
        }
        Moment momentNew_ = Moment.new_();
        momentNew_.media = this.f162897a;
        momentNew_.value = ((bh4) this.viewModel).m104320p();
        momentNew_.location = this.f162899c;
        if (this.f162900d) {
            FeedModule.f39702c.m61917j4(momentNew_);
        } else {
            Intent intent = new Intent();
            intent.putExtra("moment", momentNew_);
            act().setResult(-1, intent);
        }
        act().lambda$debugItems$19();
        return true;
    }

    /* JADX INFO: renamed from: u0 */
    public void m181330u0(g90 g90Var) {
        MessageLocation messageLocation = new MessageLocation();
        this.f162899c = messageLocation;
        messageLocation.name = g90Var.m129468c();
        this.f162899c.address = g90Var.m129466a();
        this.f162899c.coordinates = g90Var.m129467b();
        ((bh4) this.viewModel).m104313N(this.f162899c.name);
    }

    /* JADX INFO: renamed from: x0 */
    public void m181331x0(Bundle bundle) {
        String strM104322s = ((bh4) this.viewModel).m104322s();
        if (!TextUtils.isEmpty(strM104322s)) {
            bundle.putString("sharedText", strM104322s);
        }
        if (!jyb.m147479J(this.f162897a)) {
            bundle.putSerializable("images", this.f162897a);
        }
        if (NullChecker.m82486a(this.f162899c)) {
            bundle.putSerializable("location", this.f162899c);
        }
    }
}
