package com.p046p1.mobile.putong.core.p053ui.mediapreview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.messaging.Constants;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAndMedia;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.p053ui.AutoReleaseVideoAct;
import com.p046p1.mobile.putong.core.p053ui.PhotoPreviewView;
import com.p046p1.mobile.putong.core.p053ui.PlayerView;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p133rx.C22306c;
import p147v.VFrame;
import p147v.VImage;
import p147v.VPager;
import p147v.fresco.subscaleview.SubsamplingScaleImageView;
import p149l.c680;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.eb2;
import p149l.guy;
import p149l.ib1;
import p149l.j760;
import p149l.l680;
import p149l.mkd0;
import p149l.n000;
import p149l.q860;
import p149l.qib0;
import p149l.roj0;
import p149l.rol;
import p149l.rzb0;
import p149l.s680;
import p149l.t100;
import p149l.td50;
import p149l.u4c0;
import p149l.v9j;
import p149l.vtx;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9j;
import p149l.xdl0;
import p149l.zvf0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class MediaPreviewAct extends AutoReleaseVideoAct implements rol {

    /* JADX INFO: renamed from: c */
    public FrameLayout f30658c;

    /* JADX INFO: renamed from: d */
    public VPager f30659d;

    /* JADX INFO: renamed from: e */
    public VImage f30660e;

    /* JADX INFO: renamed from: f */
    public String f30661f;

    /* JADX INFO: renamed from: g */
    public C8470a f30662g;

    /* JADX INFO: renamed from: l */
    public MessageAndMedia f30667l;

    /* JADX INFO: renamed from: m */
    public boolean f30668m;

    /* JADX INFO: renamed from: n */
    public c680 f30669n;

    /* JADX INFO: renamed from: o */
    public c680 f30670o;

    /* JADX INFO: renamed from: r */
    public boolean f30673r;

    /* JADX INFO: renamed from: h */
    public q860<MessageAndMedia> f30663h = q860.m173341a();

    /* JADX INFO: renamed from: i */
    public ArrayList<MessageAndMedia> f30664i = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    public int f30665j = 0;

    /* JADX INFO: renamed from: k */
    public boolean f30666k = true;

    /* JADX INFO: renamed from: p */
    public boolean f30671p = true;

    /* JADX INFO: renamed from: q */
    public int f30672q = 0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.mediapreview.MediaPreviewAct$a */
    public class C8470a extends eb2 implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.mediapreview.MediaPreviewAct$a$a */
        public class a extends c680.C16085c {
            public a() {
            }

            @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
            public void onStart() {
                MediaPreviewAct.this.f30671p = false;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.mediapreview.MediaPreviewAct$a$b */
        public class b implements td50 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ MessageAndMedia f30676a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PhotoPreviewView f30677b;

            public b(MessageAndMedia messageAndMedia, PhotoPreviewView photoPreviewView) {
                this.f30676a = messageAndMedia;
                this.f30677b = photoPreviewView;
            }

            @Override // p149l.td50
            /* JADX INFO: renamed from: c */
            public void mo44483c(float f, float f2) {
                if (TEnum.equals(this.f30676a.message.messageType, MessageType.real_shot)) {
                    PhotoPreviewView photoPreviewView = this.f30677b;
                    boolean z = false;
                    boolean z2 = f2 <= 0.0f;
                    if (this.f30676a.message.isOtherUser() && !this.f30676a.message.isLocal()) {
                        z = true;
                    }
                    photoPreviewView.m43945O(z2, z);
                }
                if (f2 >= 0.0f) {
                    MediaPreviewAct.this.decorOrSwipingDecorView().getBackground().setAlpha((int) ((xdl0.m208408w0() / (xdl0.m208408w0() + f2)) * 255.0f));
                }
            }

            @Override // p149l.td50
            /* JADX INFO: renamed from: d */
            public void mo44484d() {
                MediaPreviewAct.this.m47815F2();
            }
        }

        public C8470a() {
        }

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void m47852A() {
            MediaPreviewAct.this.m47815F2();
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m47853C(PhotoPreviewView photoPreviewView) {
            photoPreviewView.f28023b.setVisibility(4);
            photoPreviewView.postDelayed(new Runnable() { // from class: l.stx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166399a.m47852A();
                }
            }, 100L);
        }

        @Override // p149l.w660
        public int getCount() {
            return MediaPreviewAct.this.f30663h.f153135a.size();
        }

        @Override // p149l.w660
        public int getItemPosition(Object obj) {
            int iIndexOf = MediaPreviewAct.this.f30663h.f153135a.indexOf(obj);
            if (iIndexOf >= 0) {
                return iIndexOf;
            }
            View viewFindViewWithTag = MediaPreviewAct.this.f30659d.findViewWithTag(obj);
            return (NullChecker.m81303a(viewFindViewWithTag) && (viewFindViewWithTag instanceof PlayerView) && ((PlayerView) viewFindViewWithTag).m44036C()) ? -1 : -2;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(View view, Object obj) {
            return view.getTag().equals(obj);
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
            if (NullChecker.m81303a(viewFindViewWithTag)) {
                if (viewFindViewWithTag instanceof PlayerView) {
                    ((PlayerView) viewFindViewWithTag).setPlayer(null);
                }
                viewFindViewWithTag.setTag(null);
                viewGroup.removeView(viewFindViewWithTag);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            MediaPreviewAct mediaPreviewAct = MediaPreviewAct.this;
            MessageAndMedia messageAndMedia = mediaPreviewAct.f30667l;
            View viewFindViewWithTag = mediaPreviewAct.f30659d.findViewWithTag(messageAndMedia);
            if (viewFindViewWithTag instanceof PhotoPreviewView) {
                ((PhotoPreviewView) viewFindViewWithTag).reset();
            }
            MediaPreviewAct mediaPreviewAct2 = MediaPreviewAct.this;
            mediaPreviewAct2.f30667l = mediaPreviewAct2.f30663h.f153135a.get(i);
            if (MediaPreviewAct.this.f30667l.message.isOtherUser()) {
                zvf0.m220368A("e_photo_text_reply", OMSDialogPositon.p_chat_view, new j760(Constants.MessagePayloadKeys.MSGID_SERVER, MediaPreviewAct.this.f30667l.message.f56011id), new j760("moments_user_id", MediaPreviewAct.this.f30667l.message.owner));
            }
            MediaPreviewAct mediaPreviewAct3 = MediaPreviewAct.this;
            mediaPreviewAct3.m47842H2(mediaPreviewAct3.f30667l);
            MessageAndMedia messageAndMedia2 = MediaPreviewAct.this.f30667l;
            if (messageAndMedia2 == null || messageAndMedia == null || !messageAndMedia.media.equals(messageAndMedia2.media)) {
                ib1.m135233b().mo135237e(PlayerView.f28107A);
                if (NullChecker.m81303a(MediaPreviewAct.this.f30670o)) {
                    MediaPreviewAct.this.f30670o.stop();
                }
                if (NullChecker.m81303a(MediaPreviewAct.this.f30669n)) {
                    MediaPreviewAct.this.f30669n.stop();
                }
            }
            MediaPreviewAct.this.dimStatusBar(true);
            if (i == MediaPreviewAct.this.f30663h.f153135a.size() - 1) {
                MediaPreviewAct.this.m47843I2();
            }
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            final MessageAndMedia messageAndMedia = MediaPreviewAct.this.f30663h.f153135a.get(i);
            Media media = messageAndMedia.media;
            if (!(media instanceof Video)) {
                if (media instanceof Picture) {
                    final PhotoPreviewView photoPreviewView = new PhotoPreviewView(MediaPreviewAct.this.act);
                    photoPreviewView.m43944N((Picture) messageAndMedia.media, messageAndMedia.message.messageType == null);
                    photoPreviewView.setReplayVisibility(8);
                    photoPreviewView.setPictureZoomAnimationKey(n000.m157189h(messageAndMedia.message, (Picture) messageAndMedia.media));
                    if (TEnum.equals(messageAndMedia.message.messageType, MessageType.real_shot)) {
                        photoPreviewView.setText(messageAndMedia.message.value);
                        if (messageAndMedia.message.isOtherUser()) {
                            photoPreviewView.setReplayVisibility(0);
                        }
                        photoPreviewView.setReplayClick(new View.OnClickListener() { // from class: l.ptx
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f151231a.m47856y(messageAndMedia, view);
                            }
                        });
                    }
                    photoPreviewView.setOnLongPressListener(new PhotoPreviewView.InterfaceC8262b() { // from class: l.qtx
                        @Override // com.p046p1.mobile.putong.core.p053ui.PhotoPreviewView.InterfaceC8262b
                        /* JADX INFO: renamed from: a */
                        public final boolean mo43949a() {
                            return this.f156406a.m47857z(messageAndMedia);
                        }
                    });
                    photoPreviewView.setOnTapListener(new PhotoPreviewView.InterfaceC8263c() { // from class: l.rtx
                        @Override // com.p046p1.mobile.putong.core.p053ui.PhotoPreviewView.InterfaceC8263c
                        /* JADX INFO: renamed from: a */
                        public final void mo43950a() {
                            this.f161008a.m47853C(photoPreviewView);
                        }
                    });
                    photoPreviewView.f28022a.setOnDragDismissListenler(new b(messageAndMedia, photoPreviewView));
                    photoPreviewView.setTag(messageAndMedia);
                    viewGroup.addView(photoPreviewView);
                }
                return messageAndMedia;
            }
            PlayerView playerView = new PlayerView(MediaPreviewAct.this.act);
            playerView.setProgressBarsEnabled(false);
            c680 c680VarM47845v2 = MediaPreviewAct.this.m47845v2(messageAndMedia.media.url);
            c680VarM47845v2.mo105366a("chat");
            playerView.setPlayer(c680VarM47845v2);
            playerView.f28115h.setBackground(null);
            viewGroup.addView(playerView);
            playerView.setTag(messageAndMedia);
            playerView.setVideo((Video) messageAndMedia.media);
            playerView.setReplayVisibility(4);
            if (!TextUtils.isEmpty(((Video) messageAndMedia.media).formatAspectRatio())) {
                qib0.m174792S0(((Video) messageAndMedia.media).formatAspectRatio());
            }
            if (TEnum.equals(messageAndMedia.message.messageType, MessageType.real_shot)) {
                playerView.setText(messageAndMedia.message.value);
                if (messageAndMedia.message.isOtherUser()) {
                    playerView.setReplayVisibility(0);
                }
                playerView.setReplayClick(new View.OnClickListener() { // from class: l.ntx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f140551a.m47854w(messageAndMedia, view);
                    }
                });
            }
            playerView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.otx
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f145634a.m47855x(messageAndMedia, view);
                }
            });
            playerView.m44047v(new a());
            return messageAndMedia;
        }

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ void m47854w(MessageAndMedia messageAndMedia, View view) {
            zvf0.m220399u("e_photo_text_reply", OMSDialogPositon.p_chat_view, new j760(Constants.MessagePayloadKeys.MSGID_SERVER, messageAndMedia.message.f56011id), new j760("moments_user_id", messageAndMedia.message.owner));
            MediaPreviewAct.this.m47815F2();
            guy.f104486x.onNext(roj0.f160388a);
        }

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ boolean m47855x(MessageAndMedia messageAndMedia, View view) {
            if (MediaPreviewAct.this.lifecycle_() == C4319c.f15548i && !TEnum.equals(messageAndMedia.message.messageType, MessageType.real_shot)) {
                CoreDlg.m45005M1(MediaPreviewAct.this.act, messageAndMedia.media, messageAndMedia.message);
            }
            return true;
        }

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ void m47856y(MessageAndMedia messageAndMedia, View view) {
            zvf0.m220399u("e_photo_text_reply", OMSDialogPositon.p_chat_view, new j760(Constants.MessagePayloadKeys.MSGID_SERVER, messageAndMedia.message.f56011id), new j760("moments_user_id", messageAndMedia.message.owner));
            MediaPreviewAct.this.m47815F2();
            guy.f104486x.onNext(roj0.f160388a);
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ boolean m47857z(MessageAndMedia messageAndMedia) {
            if (MediaPreviewAct.this.lifecycle_() == C4319c.f15548i && !TEnum.equals(messageAndMedia.message.messageType, MessageType.real_shot)) {
                MediaPreviewAct mediaPreviewAct = MediaPreviewAct.this;
                if (!mediaPreviewAct.f30673r) {
                    CoreDlg.m45005M1(mediaPreviewAct.act, messageAndMedia.media, null);
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ C22306c m47813A2() {
        return CoreModule.f17545c.f19642f0.m32865Xn(this.f30661f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ void m47814B2() {
        int currentItem;
        if (this.f30671p && lifecycle_() == C4319c.f15548i && (currentItem = this.f30659d.getCurrentItem()) >= 0 && currentItem < this.f30663h.f153135a.size()) {
            MessageAndMedia messageAndMedia = this.f30663h.f153135a.get(currentItem);
            if (messageAndMedia.media instanceof Video) {
                View viewFindViewWithTag = this.f30659d.findViewWithTag(messageAndMedia);
                if (viewFindViewWithTag instanceof PlayerView) {
                    PlayerView playerView = (PlayerView) viewFindViewWithTag;
                    if (playerView.m44036C()) {
                        return;
                    }
                    if (TEnum.equals(messageAndMedia.message.messageType, MessageType.real_shot)) {
                        playerView.m44043L(true);
                    } else {
                        playerView.m44042K();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$2(Bundle bundle) {
        m47842H2(this.f30667l);
        this.f30659d.setPageMargin(t100.m186890d(8.0f));
        xdl0.m208364a0(this.f30659d);
        C8470a c8470a = new C8470a();
        this.f30662g = c8470a;
        this.f30659d.setAdapter(c8470a);
        this.f30659d.setOnPageChangeListener(this.f30662g);
        xdl0.m208329E0(this.f30660e, new View.OnClickListener() { // from class: l.psx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151075a.m47836w2(view);
            }
        });
    }

    /* JADX INFO: renamed from: q2 */
    public static final Intent m47832q2(Context context, String str, MessageAndMedia messageAndMedia) {
        return m47833r2(context, str, messageAndMedia, false);
    }

    /* JADX INFO: renamed from: r2 */
    public static final Intent m47833r2(Context context, String str, MessageAndMedia messageAndMedia, boolean z) {
        return m47834s2(context, str, messageAndMedia, z, false);
    }

    /* JADX INFO: renamed from: s2 */
    public static final Intent m47834s2(Context context, String str, MessageAndMedia messageAndMedia, boolean z, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) MediaPreviewAct.class);
        intent.putExtra("start_data", MessageAndMedia.PROTOBUF_ADAPTER.toBytes(messageAndMedia));
        intent.putExtra("user_id", str);
        intent.putExtra("not_more_media", z);
        intent.putExtra("forbid_long_press", z2);
        return intent;
    }

    /* JADX INFO: renamed from: u2 */
    public static Intent m47835u2(Context context, String str, boolean z) {
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = str;
        Message messageNew_ = Message.new_();
        ArrayList arrayList = new ArrayList();
        messageNew_.media = arrayList;
        arrayList.add(pictureNew_);
        return m47834s2(context, null, new MessageAndMedia(pictureNew_, messageNew_), true, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public /* synthetic */ void m47836w2(View view) {
        m47815F2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m47837y2(C4319c c4319c) {
        if (c4319c == C4319c.f15552m || c4319c == C4319c.f15549j || c4319c == C4319c.f15550k || c4319c == C4319c.f15554o) {
            CoreModule.m29936Q().mo67253Zo().mo111895f(false);
        } else if (DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4.equals(this.f30667l.media.mediaType)) {
            CoreModule.m29936Q().mo67253Zo().mo111895f(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m47838z2() {
        ib1.m135233b().mo135237e(PlayerView.f28107A);
        if (NullChecker.m81303a(this.f30670o)) {
            this.f30670o.release();
        }
        if (NullChecker.m81303a(this.f30669n)) {
            this.f30669n.release();
        }
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ Boolean m47839C2(MessageAndMedia messageAndMedia) {
        Message message;
        Message message2;
        return Boolean.valueOf(messageAndMedia.media.url.equals(this.f30667l.media.url) && (message = messageAndMedia.message) != null && (message2 = this.f30667l.message) != null && message.createdTime == message2.createdTime);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m47840D2(q860 q860Var) {
        int iM200293G;
        q860<MessageAndMedia> q860Var2 = this.f30663h;
        int size = q860Var2 == null ? 0 : q860Var2.f153135a.size();
        if (this.f30666k) {
            for (int size2 = q860Var.f153135a.size() - 1; size2 >= 0; size2--) {
                Message message = (Message) q860Var.f153135a.get(size2);
                if (NullChecker.m81303a(message.media)) {
                    for (Media media : message.media) {
                        if ((media instanceof Picture) || (media instanceof Video)) {
                            this.f30664i.add(new MessageAndMedia(media, message));
                        }
                    }
                }
            }
        }
        if (!this.f30666k && q860Var.f153135a.size() > this.f30672q) {
            for (int size3 = (q860Var.f153135a.size() - this.f30672q) - 1; size3 >= 0; size3--) {
                Message message2 = (Message) q860Var.f153135a.get(size3);
                if (NullChecker.m81303a(message2.media)) {
                    for (Media media2 : message2.media) {
                        if ((media2 instanceof Picture) || (media2 instanceof Video)) {
                            this.f30664i.add(new MessageAndMedia(media2, message2));
                        }
                    }
                }
            }
        }
        this.f30672q = q860Var.f153135a.size();
        this.f30663h = new q860<>(this.f30664i, q860Var.f153136b);
        this.f30662g.notifyDataSetChanged();
        this.f30659d.post(new Runnable() { // from class: l.ktx
            @Override // java.lang.Runnable
            public final void run() {
                this.f124622a.m47814B2();
            }
        });
        if (this.f30666k && (iM200293G = vwb.m200293G(this.f30664i, new w9j() { // from class: l.mtx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f135711a.m47839C2((MessageAndMedia) obj);
            }
        })) >= 0) {
            this.f30659d.m4176T(iM200293G, false);
            this.f30667l = this.f30663h.f153135a.get(iM200293G);
            this.f30666k = false;
        }
        if (size != this.f30663h.f153135a.size() || this.f30665j >= 5) {
            this.f30665j = 0;
        } else {
            m47843I2();
        }
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m47841E2(C4319c c4319c) {
        ib1.m135233b().mo135237e(PlayerView.f28107A);
        if (NullChecker.m81303a(this.f30669n)) {
            this.f30669n.stop();
        }
        if (NullChecker.m81303a(this.f30670o)) {
            this.f30670o.stop();
        }
    }

    /* JADX INFO: renamed from: H2 */
    public final void m47842H2(MessageAndMedia messageAndMedia) {
        if (NullChecker.m81303a(messageAndMedia) && NullChecker.m81303a(messageAndMedia.media)) {
            boolean z = messageAndMedia.media instanceof Video;
            VImage vImage = this.f30660e;
            if (z) {
                xdl0.m208344M(vImage, true);
            } else {
                xdl0.m208344M(vImage, false);
            }
        }
    }

    /* JADX INFO: renamed from: I2 */
    public final void m47843I2() {
        this.f30665j++;
        if (this.f30663h.m173343c()) {
            CoreModule.f17545c.f19642f0.m32597Bn(this.f30661f);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish, reason: merged with bridge method [inline-methods] */
    public void m47815F2() {
        super.m47815F2();
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(rzb0.f161629a, rzb0.f161630b);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View topViewLayout = setTopViewLayout(m47844p2(layoutInflater, viewGroup));
        this.f30660e.setColorFilter(-1);
        return topViewLayout;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f30667l = MessageAndMedia.PROTOBUF_ADAPTER.get(getIntent().getByteArrayExtra("start_data"));
        this.f30668m = getIntent().getBooleanExtra("not_more_media", false);
        this.f30673r = getIntent().getBooleanExtra("forbid_long_press", false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.wsx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187982a.lambda$initSubscription$2((Bundle) obj);
            }
        }, new d30() { // from class: l.ysx
            @Override // p149l.d30
            public final void call() {
                this.f199845a.m47838z2();
            }
        });
        if (!this.f30668m) {
            duringCreated(new v9j() { // from class: l.atx
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f71689a.m47813A2();
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.ctx
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f82510a.m47840D2((q860) obj);
                }
            }));
        }
        lifecycle().filter(new w9j() { // from class: l.etx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15549j);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.gtx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104356a.m47841E2((C4319c) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.itx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114951a.m47837y2((C4319c) obj);
            }
        }));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        View viewFindViewWithTag = this.f30659d.findViewWithTag(this.f30667l);
        if (viewFindViewWithTag instanceof VFrame) {
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) viewFindViewWithTag.findViewById(u4c0.f173826G7);
            if (NullChecker.m81303a(subsamplingScaleImageView)) {
                subsamplingScaleImageView.setOnImageEventListener(null);
                subsamplingScaleImageView.setVisibility(8);
                ((VFrame) viewFindViewWithTag).removeView(subsamplingScaleImageView);
                e51.m114743H(this, new Runnable() { // from class: l.nsx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f140303a.m47815F2();
                    }
                }, 100L);
                return;
            }
        }
        super.onBackPressed();
    }

    /* JADX INFO: renamed from: p2 */
    public View m47844p2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vtx.m200055b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f30663h = new q860<>(vwb.m200324f0(this.f30667l), null);
        this.f30661f = getIntent().getStringExtra("user_id");
        setSwipeBackEnable(false);
        dimStatusBar(true);
        setStatusBarColor(getResources().getColor(w0c0.f183814V1));
        decorOrSwipingDecorView().setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(rzb0.f161631c, rzb0.f161632d);
    }

    /* JADX INFO: renamed from: v2 */
    public c680 m47845v2(String str) {
        if (!NullChecker.m81303a(str) || str.startsWith("http")) {
            if (this.f30670o == null) {
                this.f30670o = new s680();
            }
            return this.f30670o;
        }
        if (this.f30669n == null) {
            this.f30669n = new l680();
        }
        return this.f30669n;
    }
}
