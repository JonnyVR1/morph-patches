package com.p000p1.mobile.putong.core.p001ui.mediapreview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager.widget.ViewPager;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAndMedia;
import com.p1.mobile.putong.core.ui.AutoReleaseVideoAct;
import com.p1.mobile.putong.core.ui.PhotoPreviewView;
import com.p1.mobile.putong.core.ui.PlayerView;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.c680;
import l.e51;
import l.ib1;
import l.j760;
import l.l680;
import l.mkd0;
import l.q860;
import l.qib0;
import l.roj0;
import l.rol;
import l.rzb0;
import l.s680;
import l.t100;
import l.u4c0;
import l.vtx;
import l.vwb;
import l.w0c0;
import l.xdl0;
import l.zvf0;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p003l.d30;
import p003l.e30;
import p003l.eb2;
import p003l.guy;
import p003l.m250;
import p003l.n000;
import p003l.td50;
import p003l.v9j;
import p003l.w9j;
import p014rx.C1099c;
import p028v.VFrame;
import p028v.VImage;
import p028v.VPager;
import p028v.fresco.subscaleview.SubsamplingScaleImageView;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MediaPreviewAct extends AutoReleaseVideoAct implements rol {

    /* JADX INFO: renamed from: c */
    public FrameLayout f549c;

    /* JADX INFO: renamed from: d */
    public VPager f550d;

    /* JADX INFO: renamed from: e */
    public VImage f551e;

    /* JADX INFO: renamed from: f */
    public String f552f;

    /* JADX INFO: renamed from: g */
    public C0053a f553g;

    /* JADX INFO: renamed from: l */
    public MessageAndMedia f558l;

    /* JADX INFO: renamed from: m */
    public boolean f559m;

    /* JADX INFO: renamed from: n */
    public c680 f560n;

    /* JADX INFO: renamed from: o */
    public c680 f561o;

    /* JADX INFO: renamed from: r */
    public boolean f564r;

    /* JADX INFO: renamed from: h */
    public q860<MessageAndMedia> f554h = q860.a();

    /* JADX INFO: renamed from: i */
    public ArrayList<MessageAndMedia> f555i = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    public int f556j = 0;

    /* JADX INFO: renamed from: k */
    public boolean f557k = true;

    /* JADX INFO: renamed from: p */
    public boolean f562p = true;

    /* JADX INFO: renamed from: q */
    public int f563q = 0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.mediapreview.MediaPreviewAct$a */
    public class C0053a extends eb2 implements ViewPager.j {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.mediapreview.MediaPreviewAct$a$a */
        public class a extends c680.c {
            public a() {
            }

            public void onStart() {
                MediaPreviewAct.this.f562p = false;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.mediapreview.MediaPreviewAct$a$b */
        public class b implements td50 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ MessageAndMedia f567a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PhotoPreviewView f568b;

            public b(MessageAndMedia messageAndMedia, PhotoPreviewView photoPreviewView) {
                this.f567a = messageAndMedia;
                this.f568b = photoPreviewView;
            }

            @Override // p003l.td50
            /* JADX INFO: renamed from: c */
            public void mo929c(float f, float f2) {
                if (TEnum.equals(this.f567a.message.messageType, "real_shot")) {
                    PhotoPreviewView photoPreviewView = this.f568b;
                    boolean z = false;
                    boolean z2 = f2 <= 0.0f;
                    if (this.f567a.message.isOtherUser() && !this.f567a.message.isLocal()) {
                        z = true;
                    }
                    photoPreviewView.O(z2, z);
                }
                if (f2 >= 0.0f) {
                    MediaPreviewAct.this.decorOrSwipingDecorView().getBackground().setAlpha((int) ((xdl0.w0() / (xdl0.w0() + f2)) * 255.0f));
                }
            }

            @Override // p003l.td50
            /* JADX INFO: renamed from: d */
            public void mo930d() {
                MediaPreviewAct.this.m884F2();
            }
        }

        public C0053a() {
        }

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void m921A() {
            MediaPreviewAct.this.m884F2();
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m922C(PhotoPreviewView photoPreviewView) {
            photoPreviewView.b.setVisibility(4);
            photoPreviewView.postDelayed(new Runnable() { // from class: l.stx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7304a.m921A();
                }
            }, 100L);
        }

        public int getCount() {
            return MediaPreviewAct.this.f554h.a.size();
        }

        public int getItemPosition(Object obj) {
            int iIndexOf = MediaPreviewAct.this.f554h.a.indexOf(obj);
            if (iIndexOf >= 0) {
                return iIndexOf;
            }
            PlayerView playerViewFindViewWithTag = MediaPreviewAct.this.f550d.findViewWithTag(obj);
            return (NullChecker.a(playerViewFindViewWithTag) && (playerViewFindViewWithTag instanceof PlayerView) && playerViewFindViewWithTag.C()) ? -1 : -2;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view.getTag().equals(obj);
        }

        @Override // p003l.eb2
        /* JADX INFO: renamed from: o */
        public void mo923o(ViewGroup viewGroup, int i, Object obj) {
            PlayerView playerViewFindViewWithTag = viewGroup.findViewWithTag(obj);
            if (NullChecker.a(playerViewFindViewWithTag)) {
                if (playerViewFindViewWithTag instanceof PlayerView) {
                    playerViewFindViewWithTag.setPlayer((c680) null);
                }
                playerViewFindViewWithTag.setTag(null);
                viewGroup.removeView(playerViewFindViewWithTag);
            }
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            MediaPreviewAct mediaPreviewAct = MediaPreviewAct.this;
            MessageAndMedia messageAndMedia = mediaPreviewAct.f558l;
            PhotoPreviewView photoPreviewViewFindViewWithTag = mediaPreviewAct.f550d.findViewWithTag(messageAndMedia);
            if (photoPreviewViewFindViewWithTag instanceof PhotoPreviewView) {
                photoPreviewViewFindViewWithTag.reset();
            }
            MediaPreviewAct mediaPreviewAct2 = MediaPreviewAct.this;
            mediaPreviewAct2.f558l = (MessageAndMedia) mediaPreviewAct2.f554h.a.get(i);
            if (MediaPreviewAct.this.f558l.message.isOtherUser()) {
                zvf0.A("e_photo_text_reply", "p_chat_view", new j760[]{new j760("message_id", ((DbObject) MediaPreviewAct.this.f558l.message).id), new j760("moments_user_id", MediaPreviewAct.this.f558l.message.owner)});
            }
            MediaPreviewAct mediaPreviewAct3 = MediaPreviewAct.this;
            mediaPreviewAct3.m911H2(mediaPreviewAct3.f558l);
            MessageAndMedia messageAndMedia2 = MediaPreviewAct.this.f558l;
            if (messageAndMedia2 == null || messageAndMedia == null || !messageAndMedia.media.equals(messageAndMedia2.media)) {
                ib1.b().e(PlayerView.A);
                if (NullChecker.a(MediaPreviewAct.this.f561o)) {
                    MediaPreviewAct.this.f561o.stop();
                }
                if (NullChecker.a(MediaPreviewAct.this.f560n)) {
                    MediaPreviewAct.this.f560n.stop();
                }
            }
            MediaPreviewAct.this.dimStatusBar(true);
            if (i == MediaPreviewAct.this.f554h.a.size() - 1) {
                MediaPreviewAct.this.m912I2();
            }
        }

        @Override // p003l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo924p(ViewGroup viewGroup, int i) {
            final MessageAndMedia messageAndMedia = (MessageAndMedia) MediaPreviewAct.this.f554h.a.get(i);
            Media media = messageAndMedia.media;
            if (!(media instanceof Video)) {
                if (media instanceof Picture) {
                    final View photoPreviewView = new PhotoPreviewView(((Act) MediaPreviewAct.this).act);
                    photoPreviewView.N(messageAndMedia.media, messageAndMedia.message.messageType == null);
                    photoPreviewView.setReplayVisibility(8);
                    photoPreviewView.setPictureZoomAnimationKey(n000.m6523h(messageAndMedia.message, messageAndMedia.media));
                    if (TEnum.equals(messageAndMedia.message.messageType, "real_shot")) {
                        photoPreviewView.setText(messageAndMedia.message.value);
                        if (messageAndMedia.message.isOtherUser()) {
                            photoPreviewView.setReplayVisibility(0);
                        }
                        photoPreviewView.setReplayClick(new View.OnClickListener() { // from class: l.ptx
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f6510a.m927y(messageAndMedia, view);
                            }
                        });
                    }
                    photoPreviewView.setOnLongPressListener(new PhotoPreviewView.b() { // from class: l.qtx
                        /* JADX INFO: renamed from: a */
                        public final boolean m7032a() {
                            return this.f6697a.m928z(messageAndMedia);
                        }
                    });
                    photoPreviewView.setOnTapListener(new PhotoPreviewView.c() { // from class: l.rtx
                        /* JADX INFO: renamed from: a */
                        public final void m7373a() {
                            this.f7069a.m922C(photoPreviewView);
                        }
                    });
                    ((PhotoPreviewView) photoPreviewView).a.setOnDragDismissListenler(new b(messageAndMedia, photoPreviewView));
                    photoPreviewView.setTag(messageAndMedia);
                    viewGroup.addView(photoPreviewView);
                }
                return messageAndMedia;
            }
            View playerView = new PlayerView(((Act) MediaPreviewAct.this).act);
            playerView.setProgressBarsEnabled(false);
            c680 c680VarM914v2 = MediaPreviewAct.this.m914v2(messageAndMedia.media.url);
            c680VarM914v2.a("chat");
            playerView.setPlayer(c680VarM914v2);
            ((PlayerView) playerView).h.setBackground(null);
            viewGroup.addView(playerView);
            playerView.setTag(messageAndMedia);
            playerView.setVideo(messageAndMedia.media);
            playerView.setReplayVisibility(4);
            if (!TextUtils.isEmpty(messageAndMedia.media.formatAspectRatio())) {
                qib0.S0(messageAndMedia.media.formatAspectRatio());
            }
            if (TEnum.equals(messageAndMedia.message.messageType, "real_shot")) {
                playerView.setText(messageAndMedia.message.value);
                if (messageAndMedia.message.isOtherUser()) {
                    playerView.setReplayVisibility(0);
                }
                playerView.setReplayClick(new View.OnClickListener() { // from class: l.ntx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f5971a.m925w(messageAndMedia, view);
                    }
                });
            }
            playerView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.otx
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f6223a.m926x(messageAndMedia, view);
                }
            });
            playerView.v(new a());
            return messageAndMedia;
        }

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ void m925w(MessageAndMedia messageAndMedia, View view) {
            zvf0.u("e_photo_text_reply", "p_chat_view", new j760[]{new j760("message_id", ((DbObject) messageAndMedia.message).id), new j760("moments_user_id", messageAndMedia.message.owner)});
            MediaPreviewAct.this.m884F2();
            guy.f4017x.onNext(roj0.a);
        }

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ boolean m926x(MessageAndMedia messageAndMedia, View view) {
            if (MediaPreviewAct.this.lifecycle_() == c.i && !TEnum.equals(messageAndMedia.message.messageType, "real_shot")) {
                CoreDlg.M1(((Act) MediaPreviewAct.this).act, messageAndMedia.media, messageAndMedia.message);
            }
            return true;
        }

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ void m927y(MessageAndMedia messageAndMedia, View view) {
            zvf0.u("e_photo_text_reply", "p_chat_view", new j760[]{new j760("message_id", ((DbObject) messageAndMedia.message).id), new j760("moments_user_id", messageAndMedia.message.owner)});
            MediaPreviewAct.this.m884F2();
            guy.f4017x.onNext(roj0.a);
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ boolean m928z(MessageAndMedia messageAndMedia) {
            if (MediaPreviewAct.this.lifecycle_() == c.i && !TEnum.equals(messageAndMedia.message.messageType, "real_shot")) {
                MediaPreviewAct mediaPreviewAct = MediaPreviewAct.this;
                if (!mediaPreviewAct.f564r) {
                    CoreDlg.M1(((Act) mediaPreviewAct).act, messageAndMedia.media, (Message) null);
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ C1099c m882A2() {
        return CoreModule.c.f0.Xn(this.f552f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ void m883B2() {
        int currentItem;
        if (this.f562p && lifecycle_() == c.i && (currentItem = this.f550d.getCurrentItem()) >= 0 && currentItem < this.f554h.a.size()) {
            MessageAndMedia messageAndMedia = (MessageAndMedia) this.f554h.a.get(currentItem);
            if (messageAndMedia.media instanceof Video) {
                PlayerView playerViewFindViewWithTag = this.f550d.findViewWithTag(messageAndMedia);
                if (playerViewFindViewWithTag instanceof PlayerView) {
                    PlayerView playerView = playerViewFindViewWithTag;
                    if (playerView.C()) {
                        return;
                    }
                    if (TEnum.equals(messageAndMedia.message.messageType, "real_shot")) {
                        playerView.L(true);
                    } else {
                        playerView.K();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$2(Bundle bundle) {
        m911H2(this.f558l);
        this.f550d.setPageMargin(t100.d(8.0f));
        xdl0.a0(this.f550d);
        C0053a c0053a = new C0053a();
        this.f553g = c0053a;
        this.f550d.setAdapter(c0053a);
        this.f550d.setOnPageChangeListener(this.f553g);
        xdl0.E0(this.f551e, new View.OnClickListener() { // from class: l.psx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6506a.m905w2(view);
            }
        });
    }

    /* JADX INFO: renamed from: q2 */
    public static final Intent m901q2(Context context, String str, MessageAndMedia messageAndMedia) {
        return m902r2(context, str, messageAndMedia, false);
    }

    /* JADX INFO: renamed from: r2 */
    public static final Intent m902r2(Context context, String str, MessageAndMedia messageAndMedia, boolean z) {
        return m903s2(context, str, messageAndMedia, z, false);
    }

    /* JADX INFO: renamed from: s2 */
    public static final Intent m903s2(Context context, String str, MessageAndMedia messageAndMedia, boolean z, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) MediaPreviewAct.class);
        intent.putExtra("start_data", MessageAndMedia.PROTOBUF_ADAPTER.toBytes(messageAndMedia));
        intent.putExtra("user_id", str);
        intent.putExtra("not_more_media", z);
        intent.putExtra("forbid_long_press", z2);
        return intent;
    }

    /* JADX INFO: renamed from: u2 */
    public static Intent m904u2(Context context, String str, boolean z) {
        Picture pictureNew_ = Picture.new_();
        ((Media) pictureNew_).url = str;
        Message messageNew_ = Message.new_();
        ArrayList arrayList = new ArrayList();
        messageNew_.media = arrayList;
        arrayList.add(pictureNew_);
        return m903s2(context, null, new MessageAndMedia(pictureNew_, messageNew_), true, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public /* synthetic */ void m905w2(View view) {
        m884F2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m906y2(c cVar) {
        if (cVar == c.m || cVar == c.j || cVar == c.k || cVar == c.o) {
            CoreModule.Q().Zo().f(false);
        } else if (DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4.equals(this.f558l.media.mediaType)) {
            CoreModule.Q().Zo().f(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m907z2() {
        ib1.b().e(PlayerView.A);
        if (NullChecker.a(this.f561o)) {
            this.f561o.release();
        }
        if (NullChecker.a(this.f560n)) {
            this.f560n.release();
        }
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ Boolean m908C2(MessageAndMedia messageAndMedia) {
        Message message;
        Message message2;
        return Boolean.valueOf(messageAndMedia.media.url.equals(this.f558l.media.url) && (message = messageAndMedia.message) != null && (message2 = this.f558l.message) != null && message.createdTime == message2.createdTime);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m909D2(q860 q860Var) {
        int iG;
        q860<MessageAndMedia> q860Var2 = this.f554h;
        int size = q860Var2 == null ? 0 : q860Var2.a.size();
        if (this.f557k) {
            for (int size2 = q860Var.a.size() - 1; size2 >= 0; size2--) {
                Message message = (Message) q860Var.a.get(size2);
                if (NullChecker.a(message.media)) {
                    for (Media media : message.media) {
                        if ((media instanceof Picture) || (media instanceof Video)) {
                            this.f555i.add(new MessageAndMedia(media, message));
                        }
                    }
                }
            }
        }
        if (!this.f557k && q860Var.a.size() > this.f563q) {
            for (int size3 = (q860Var.a.size() - this.f563q) - 1; size3 >= 0; size3--) {
                Message message2 = (Message) q860Var.a.get(size3);
                if (NullChecker.a(message2.media)) {
                    for (Media media2 : message2.media) {
                        if ((media2 instanceof Picture) || (media2 instanceof Video)) {
                            this.f555i.add(new MessageAndMedia(media2, message2));
                        }
                    }
                }
            }
        }
        this.f563q = q860Var.a.size();
        this.f554h = new q860<>(this.f555i, q860Var.b);
        this.f553g.notifyDataSetChanged();
        this.f550d.post(new Runnable() { // from class: l.ktx
            @Override // java.lang.Runnable
            public final void run() {
                this.f5069a.m883B2();
            }
        });
        if (this.f557k && (iG = vwb.G(this.f555i, new w9j() { // from class: l.mtx
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f5767a.m908C2((MessageAndMedia) obj);
            }
        })) >= 0) {
            this.f550d.T(iG, false);
            this.f558l = (MessageAndMedia) this.f554h.a.get(iG);
            this.f557k = false;
        }
        if (size != this.f554h.a.size() || this.f556j >= 5) {
            this.f556j = 0;
        } else {
            m912I2();
        }
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m910E2(c cVar) {
        ib1.b().e(PlayerView.A);
        if (NullChecker.a(this.f560n)) {
            this.f560n.stop();
        }
        if (NullChecker.a(this.f561o)) {
            this.f561o.stop();
        }
    }

    /* JADX INFO: renamed from: H2 */
    public final void m911H2(MessageAndMedia messageAndMedia) {
        if (NullChecker.a(messageAndMedia) && NullChecker.a(messageAndMedia.media)) {
            boolean z = messageAndMedia.media instanceof Video;
            AppCompatImageView appCompatImageView = this.f551e;
            if (z) {
                xdl0.M(appCompatImageView, true);
            } else {
                xdl0.M(appCompatImageView, false);
            }
        }
    }

    /* JADX INFO: renamed from: I2 */
    public final void m912I2() {
        this.f556j++;
        if (this.f554h.c()) {
            CoreModule.c.f0.Bn(this.f552f);
        }
    }

    /* JADX INFO: renamed from: finish, reason: merged with bridge method [inline-methods] */
    public void m884F2() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(rzb0.a, rzb0.b);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View topViewLayout = setTopViewLayout(m913p2(layoutInflater, viewGroup));
        this.f551e.setColorFilter(-1);
        return topViewLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initDataOnCreate();
        this.f558l = (MessageAndMedia) MessageAndMedia.PROTOBUF_ADAPTER.get(getIntent().getByteArrayExtra("start_data"));
        this.f559m = getIntent().getBooleanExtra("not_more_media", false);
        this.f564r = getIntent().getBooleanExtra("forbid_long_press", false);
    }

    public void initSubscription() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initSubscription();
        creates(new e30() { // from class: l.wsx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8615a.lambda$initSubscription$2((Bundle) obj);
            }
        }, new d30() { // from class: l.ysx
            @Override // p003l.d30
            public final void call() {
                this.f9130a.m907z2();
            }
        });
        if (!this.f559m) {
            duringCreated(new v9j() { // from class: l.atx
                @Override // p003l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f2277a.m882A2();
                }
            }).subscribe((m250) mkd0.G(new e30() { // from class: l.ctx
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f2803a.m909D2((q860) obj);
                }
            }));
        }
        lifecycle().filter(new w9j() { // from class: l.etx
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.j);
            }
        }).subscribe((m250) mkd0.G(new e30() { // from class: l.gtx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4010a.m910E2((c) obj);
            }
        }));
        lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.itx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4497a.m906y2((c) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        View viewFindViewWithTag = this.f550d.findViewWithTag(this.f558l);
        if (viewFindViewWithTag instanceof VFrame) {
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) viewFindViewWithTag.findViewById(u4c0.G7);
            if (NullChecker.a(subsamplingScaleImageView)) {
                subsamplingScaleImageView.setOnImageEventListener(null);
                subsamplingScaleImageView.setVisibility(8);
                ((VFrame) viewFindViewWithTag).removeView(subsamplingScaleImageView);
                e51.H(this, new Runnable() { // from class: l.nsx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5961a.m884F2();
                    }
                }, 100L);
                return;
            }
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    /* JADX INFO: renamed from: p2 */
    public View m913p2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vtx.b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        this.f554h = new q860<>(vwb.f0(new MessageAndMedia[]{this.f558l}), (DbLinks) null);
        this.f552f = getIntent().getStringExtra("user_id");
        setSwipeBackEnable(false);
        dimStatusBar(true);
        setStatusBarColor(getResources().getColor(w0c0.V1));
        decorOrSwipingDecorView().setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(rzb0.c, rzb0.d);
    }

    /* JADX INFO: renamed from: v2 */
    public c680 m914v2(String str) {
        if (!NullChecker.a(str) || str.startsWith("http")) {
            if (this.f561o == null) {
                this.f561o = new s680();
            }
            return this.f561o;
        }
        if (this.f560n == null) {
            this.f560n = new l680();
        }
        return this.f560n;
    }
}
