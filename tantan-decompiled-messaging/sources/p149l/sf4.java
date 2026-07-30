package p149l;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: loaded from: classes12.dex */
public class sf4 extends jq2<cg4> {

    /* JADX INFO: renamed from: a */
    public ArrayList<Media> f164198a;

    /* JADX INFO: renamed from: b */
    public List<k90> f164199b;

    /* JADX INFO: renamed from: c */
    public MessageLocation f164200c;

    /* JADX INFO: renamed from: d */
    public boolean f164201d;

    /* JADX INFO: renamed from: e */
    public p90 f164202e;

    /* JADX INFO: renamed from: l.sf4$a */
    public class C19929a implements eml.InterfaceC16646a {
        public C19929a() {
        }

        @Override // p149l.eml.InterfaceC16646a
        /* JADX INFO: renamed from: a */
        public void mo117206a(List<k90> list) {
            sf4.this.f164199b.clear();
            if (!vwb.m200296J(list)) {
                sf4.this.f164199b.addAll(list);
            }
            ((cg4) sf4.this.viewModel).m106683Q();
        }

        @Override // p149l.eml.InterfaceC16646a
        public void onError(Throwable th) {
            ((cg4) sf4.this.viewModel).m106673G();
        }
    }

    public sf4(mcr mcrVar) {
        super(mcrVar);
        this.f164198a = new ArrayList<>();
        this.f164199b = vwb.m200324f0(new k90());
        this.f164201d = false;
        this.f164202e = new p90(new C19929a());
    }

    /* JADX INFO: renamed from: m0 */
    private void m183780m0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
        if (NullChecker.m81303a(stringExtra)) {
            ((cg4) this.viewModel).m106677K(stringExtra);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m183781q0(Bundle bundle) {
        Intent intent = act().getIntent();
        String action = intent.getAction();
        String type = intent.getType();
        if ("android.intent.action.SEND".equals(action) && NullChecker.m81303a(type)) {
            if (MimeTypes.TEXT_PLAIN.equals(type)) {
                this.f164201d = true;
                m183780m0(intent);
            } else if (type.startsWith("image/")) {
                this.f164201d = true;
                m183785k0(intent);
            }
        } else if ("android.intent.action.SEND_MULTIPLE".equals(action) && NullChecker.m81303a(type)) {
            if (type.startsWith("image/")) {
                this.f164201d = true;
                m183786l0(intent);
            }
        } else if (!"action_send_with_media".equals(action) || !NullChecker.m81303a(type)) {
            this.f164198a = (ArrayList) act().getIntent().getSerializableExtra("images");
        } else if (type.startsWith("image/")) {
            this.f164201d = true;
            this.f164198a = (ArrayList) act().getIntent().getSerializableExtra("images");
        }
        if (vwb.m200296J(this.f164198a)) {
            this.f164198a = new ArrayList<>();
        }
        ((cg4) this.viewModel).m106692w(bundle);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.rf4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159101a.m183781q0((Bundle) obj);
            }
        });
    }

    @Override // p149l.jq2
    @NonNull
    public Act act() {
        return ((cg4) this.viewModel).getAct();
    }

    @Override // p149l.q0m
    public void destroy() {
        if (NullChecker.m81303a(this.f164202e)) {
            this.f164202e.destroy();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public List<k90> m183782h0() {
        return this.f164199b;
    }

    /* JADX INFO: renamed from: i0 */
    public void m183783i0() {
        this.f164200c = null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m183784j0(Location location) {
        this.f164202e.mo114573a(location, act());
    }

    /* JADX INFO: renamed from: k0 */
    public final void m183785k0(Intent intent) {
        m183780m0(intent);
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
        if (NullChecker.m81303a(uri)) {
            String strM179356C = rhi.m179356C(c16.m104830g(uri));
            if (NullChecker.m81303a(strM179356C)) {
                Picture picture = new Picture();
                picture.url = strM179356C;
                picture.status = MediaLocalStatus.get("raw");
                this.f164198a.add(picture);
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m183786l0(Intent intent) {
        m183780m0(intent);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (NullChecker.m81303a(parcelableArrayListExtra)) {
            int size = parcelableArrayListExtra.size() <= 9 ? parcelableArrayListExtra.size() : 9;
            for (int i = 0; i < size; i++) {
                String strM179356C = rhi.m179356C(c16.m104830g((Uri) parcelableArrayListExtra.get(i)));
                if (NullChecker.m81303a(strM179356C)) {
                    Picture picture = new Picture();
                    picture.url = strM179356C;
                    picture.status = MediaLocalStatus.get("raw");
                    this.f164198a.add(picture);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m183787n0() {
        this.f164202e.init();
    }

    /* JADX INFO: renamed from: o0 */
    public void m183788o0(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String string = bundle.getString("sharedText");
        if (!TextUtils.isEmpty(string)) {
            ((cg4) this.viewModel).m106682P(string);
        }
        ArrayList<Media> arrayList = (ArrayList) bundle.getSerializable("images");
        if (!vwb.m200296J(arrayList)) {
            this.f164198a = arrayList;
        }
        MessageLocation messageLocation = (MessageLocation) bundle.getSerializable("location");
        if (NullChecker.m81303a(messageLocation)) {
            this.f164200c = messageLocation;
            ((cg4) this.viewModel).m106678L(messageLocation);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m183789p0() {
        return vwb.m200296J(this.f164198a);
    }

    /* JADX INFO: renamed from: r0 */
    public void m183790r0(int i, int i2, Intent intent) {
        if (i == 1) {
            qib0.f154687E.m78868t();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m183791s0(List<Media> list) {
        if (!NullChecker.m81304b(list) || list.size() <= 0 || !(list.get(0) instanceof Video) || new r5l0(rhi.m179382z(list.get(0).url)).f157831b <= 15000) {
            ((cg4) this.viewModel).m106679M(list);
        } else {
            lsi0.m151578h(R$string.f39187z3);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m183792t0() {
        if (!((cg4) this.viewModel).m106688q() || act().isFinishing()) {
            return true;
        }
        Moment momentNew_ = Moment.new_();
        momentNew_.media = this.f164198a;
        momentNew_.value = ((cg4) this.viewModel).m106687p();
        momentNew_.location = this.f164200c;
        if (this.f164201d) {
            FeedModule.f38854c.m60733j4(momentNew_);
        } else {
            Intent intent = new Intent();
            intent.putExtra("moment", momentNew_);
            act().setResult(-1, intent);
        }
        act().lambda$debugItems$19();
        return true;
    }

    /* JADX INFO: renamed from: u0 */
    public void m183793u0(k90 k90Var) {
        MessageLocation messageLocation = new MessageLocation();
        this.f164200c = messageLocation;
        messageLocation.name = k90Var.m144984c();
        this.f164200c.address = k90Var.m144982a();
        this.f164200c.coordinates = k90Var.m144983b();
        ((cg4) this.viewModel).m106680N(this.f164200c.name);
    }

    /* JADX INFO: renamed from: x0 */
    public void m183794x0(Bundle bundle) {
        String strM106689s = ((cg4) this.viewModel).m106689s();
        if (!TextUtils.isEmpty(strM106689s)) {
            bundle.putString("sharedText", strM106689s);
        }
        if (!vwb.m200296J(this.f164198a)) {
            bundle.putSerializable("images", this.f164198a);
        }
        if (NullChecker.m81303a(this.f164200c)) {
            bundle.putSerializable("location", this.f164200c);
        }
    }
}
