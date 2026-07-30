package com.p051p1.mobile.putong.core.p058ui.mediapreview;

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
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAndMedia;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.p058ui.AutoReleaseVideoAct;
import com.p051p1.mobile.putong.core.p058ui.PhotoPreviewView;
import com.p051p1.mobile.putong.core.p058ui.PlayerView;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p137rx.C22421c;
import p151v.VFrame;
import p151v.VImage;
import p151v.VPager;
import p151v.fresco.subscaleview.SubsamplingScaleImageView;
import p153l.adc0;
import p153l.am50;
import p153l.bnl0;
import p153l.c9c0;
import p153l.crl;
import p153l.d3z;
import p153l.i4g0;
import p153l.ie80;
import p153l.jyb;
import p153l.k900;
import p153l.l51;
import p153l.lb2;
import p153l.pb1;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.re80;
import p153l.s2y;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vg60;
import p153l.x20;
import p153l.x7c0;
import p153l.y20;
import p153l.ye80;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class MediaPreviewAct extends AutoReleaseVideoAct implements crl {

    /* JADX INFO: renamed from: c */
    public FrameLayout f31506c;

    /* JADX INFO: renamed from: d */
    public VPager f31507d;

    /* JADX INFO: renamed from: e */
    public VImage f31508e;

    /* JADX INFO: renamed from: f */
    public String f31509f;

    /* JADX INFO: renamed from: g */
    public C8633a f31510g;

    /* JADX INFO: renamed from: l */
    public MessageAndMedia f31515l;

    /* JADX INFO: renamed from: m */
    public boolean f31516m;

    /* JADX INFO: renamed from: n */
    public ie80 f31517n;

    /* JADX INFO: renamed from: o */
    public ie80 f31518o;

    /* JADX INFO: renamed from: r */
    public boolean f31521r;

    /* JADX INFO: renamed from: h */
    public vg60<MessageAndMedia> f31511h = vg60.m201219a();

    /* JADX INFO: renamed from: i */
    public ArrayList<MessageAndMedia> f31512i = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    public int f31513j = 0;

    /* JADX INFO: renamed from: k */
    public boolean f31514k = true;

    /* JADX INFO: renamed from: p */
    public boolean f31519p = true;

    /* JADX INFO: renamed from: q */
    public int f31520q = 0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.mediapreview.MediaPreviewAct$a */
    public class C8633a extends lb2 implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.mediapreview.MediaPreviewAct$a$a */
        public class a extends ie80.C17711c {
            public a() {
            }

            @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
            public void onStart() {
                MediaPreviewAct.this.f31519p = false;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.mediapreview.MediaPreviewAct$a$b */
        public class b implements am50 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ MessageAndMedia f31524a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PhotoPreviewView f31525b;

            public b(MessageAndMedia messageAndMedia, PhotoPreviewView photoPreviewView) {
                this.f31524a = messageAndMedia;
                this.f31525b = photoPreviewView;
            }

            @Override // p153l.am50
            /* JADX INFO: renamed from: c */
            public void mo45666c(float f, float f2) {
                if (TEnum.equals(this.f31524a.message.messageType, MessageType.real_shot)) {
                    PhotoPreviewView photoPreviewView = this.f31525b;
                    boolean z = false;
                    boolean z2 = f2 <= 0.0f;
                    if (this.f31524a.message.isOtherUser() && !this.f31524a.message.isLocal()) {
                        z = true;
                    }
                    photoPreviewView.m45128O(z2, z);
                }
                if (f2 >= 0.0f) {
                    MediaPreviewAct.this.decorOrSwipingDecorView().getBackground().setAlpha((int) ((bnl0.m105588w0() / (bnl0.m105588w0() + f2)) * 255.0f));
                }
            }

            @Override // p153l.am50
            /* JADX INFO: renamed from: d */
            public void mo45667d() {
                MediaPreviewAct.this.m48999H2();
            }
        }

        public C8633a() {
        }

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void m49035A() {
            MediaPreviewAct.this.m48999H2();
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m49036C(PhotoPreviewView photoPreviewView) {
            photoPreviewView.f28871b.setVisibility(4);
            photoPreviewView.postDelayed(new Runnable() { // from class: l.p2y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f150342a.m49035A();
                }
            }, 100L);
        }

        @Override // p153l.cf60
        public int getCount() {
            return MediaPreviewAct.this.f31511h.f184001a.size();
        }

        @Override // p153l.cf60
        public int getItemPosition(Object obj) {
            int iIndexOf = MediaPreviewAct.this.f31511h.f184001a.indexOf(obj);
            if (iIndexOf >= 0) {
                return iIndexOf;
            }
            View viewFindViewWithTag = MediaPreviewAct.this.f31507d.findViewWithTag(obj);
            return (NullChecker.m82486a(viewFindViewWithTag) && (viewFindViewWithTag instanceof PlayerView) && ((PlayerView) viewFindViewWithTag).m45219C()) ? -1 : -2;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(View view, Object obj) {
            return view.getTag().equals(obj);
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
            if (NullChecker.m82486a(viewFindViewWithTag)) {
                if (viewFindViewWithTag instanceof PlayerView) {
                    ((PlayerView) viewFindViewWithTag).setPlayer(null);
                }
                viewFindViewWithTag.setTag(null);
                viewGroup.removeView(viewFindViewWithTag);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            MediaPreviewAct mediaPreviewAct = MediaPreviewAct.this;
            MessageAndMedia messageAndMedia = mediaPreviewAct.f31515l;
            View viewFindViewWithTag = mediaPreviewAct.f31507d.findViewWithTag(messageAndMedia);
            if (viewFindViewWithTag instanceof PhotoPreviewView) {
                ((PhotoPreviewView) viewFindViewWithTag).reset();
            }
            MediaPreviewAct mediaPreviewAct2 = MediaPreviewAct.this;
            mediaPreviewAct2.f31515l = mediaPreviewAct2.f31511h.f184001a.get(i);
            if (MediaPreviewAct.this.f31515l.message.isOtherUser()) {
                i4g0.m138492A("e_photo_text_reply", OMSDialogPositon.p_chat_view, new pf60(Constants.MessagePayloadKeys.MSGID_SERVER, MediaPreviewAct.this.f31515l.message.f56859id), new pf60("moments_user_id", MediaPreviewAct.this.f31515l.message.owner));
            }
            MediaPreviewAct mediaPreviewAct3 = MediaPreviewAct.this;
            mediaPreviewAct3.m49025I2(mediaPreviewAct3.f31515l);
            MessageAndMedia messageAndMedia2 = MediaPreviewAct.this.f31515l;
            if (messageAndMedia2 == null || messageAndMedia == null || !messageAndMedia.media.equals(messageAndMedia2.media)) {
                pb1.m171472b().mo171476e(PlayerView.f28955A);
                if (NullChecker.m82486a(MediaPreviewAct.this.f31518o)) {
                    MediaPreviewAct.this.f31518o.stop();
                }
                if (NullChecker.m82486a(MediaPreviewAct.this.f31517n)) {
                    MediaPreviewAct.this.f31517n.stop();
                }
            }
            MediaPreviewAct.this.dimStatusBar(true);
            if (i == MediaPreviewAct.this.f31511h.f184001a.size() - 1) {
                MediaPreviewAct.this.m49026K2();
            }
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            final MessageAndMedia messageAndMedia = MediaPreviewAct.this.f31511h.f184001a.get(i);
            Media media = messageAndMedia.media;
            if (!(media instanceof Video)) {
                if (media instanceof Picture) {
                    final PhotoPreviewView photoPreviewView = new PhotoPreviewView(MediaPreviewAct.this.act);
                    photoPreviewView.m45127N((Picture) messageAndMedia.media, messageAndMedia.message.messageType == null);
                    photoPreviewView.setReplayVisibility(8);
                    photoPreviewView.setPictureZoomAnimationKey(k900.m148796h(messageAndMedia.message, (Picture) messageAndMedia.media));
                    if (TEnum.equals(messageAndMedia.message.messageType, MessageType.real_shot)) {
                        photoPreviewView.setText(messageAndMedia.message.value);
                        if (messageAndMedia.message.isOtherUser()) {
                            photoPreviewView.setReplayVisibility(0);
                        }
                        photoPreviewView.setReplayClick(new View.OnClickListener() { // from class: l.m2y
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f134628a.m49039y(messageAndMedia, view);
                            }
                        });
                    }
                    photoPreviewView.setOnLongPressListener(new PhotoPreviewView.InterfaceC8425b() { // from class: l.n2y
                        @Override // com.p051p1.mobile.putong.core.p058ui.PhotoPreviewView.InterfaceC8425b
                        /* JADX INFO: renamed from: a */
                        public final boolean mo45132a() {
                            return this.f139899a.m49040z(messageAndMedia);
                        }
                    });
                    photoPreviewView.setOnTapListener(new PhotoPreviewView.InterfaceC8426c() { // from class: l.o2y
                        @Override // com.p051p1.mobile.putong.core.p058ui.PhotoPreviewView.InterfaceC8426c
                        /* JADX INFO: renamed from: a */
                        public final void mo45133a() {
                            this.f144807a.m49036C(photoPreviewView);
                        }
                    });
                    photoPreviewView.f28870a.setOnDragDismissListenler(new b(messageAndMedia, photoPreviewView));
                    photoPreviewView.setTag(messageAndMedia);
                    viewGroup.addView(photoPreviewView);
                }
                return messageAndMedia;
            }
            PlayerView playerView = new PlayerView(MediaPreviewAct.this.act);
            playerView.setProgressBarsEnabled(false);
            ie80 ie80VarM49028w2 = MediaPreviewAct.this.m49028w2(messageAndMedia.media.url);
            ie80VarM49028w2.mo139591a("chat");
            playerView.setPlayer(ie80VarM49028w2);
            playerView.f28963h.setBackground(null);
            viewGroup.addView(playerView);
            playerView.setTag(messageAndMedia);
            playerView.setVideo((Video) messageAndMedia.media);
            playerView.setReplayVisibility(4);
            if (!TextUtils.isEmpty(((Video) messageAndMedia.media).formatAspectRatio())) {
                uqb0.m197246S0(((Video) messageAndMedia.media).formatAspectRatio());
            }
            if (TEnum.equals(messageAndMedia.message.messageType, MessageType.real_shot)) {
                playerView.setText(messageAndMedia.message.value);
                if (messageAndMedia.message.isOtherUser()) {
                    playerView.setReplayVisibility(0);
                }
                playerView.setReplayClick(new View.OnClickListener() { // from class: l.k2y
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f123670a.m49037w(messageAndMedia, view);
                    }
                });
            }
            playerView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.l2y
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f129819a.m49038x(messageAndMedia, view);
                }
            });
            playerView.m45230v(new a());
            return messageAndMedia;
        }

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ void m49037w(MessageAndMedia messageAndMedia, View view) {
            i4g0.m138523u("e_photo_text_reply", OMSDialogPositon.p_chat_view, new pf60(Constants.MessagePayloadKeys.MSGID_SERVER, messageAndMedia.message.f56859id), new pf60("moments_user_id", messageAndMedia.message.owner));
            MediaPreviewAct.this.m48999H2();
            d3z.f84958x.onNext(uxj0.f181467a);
        }

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ boolean m49038x(MessageAndMedia messageAndMedia, View view) {
            if (MediaPreviewAct.this.lifecycle_() == C4470c.f16267i && !TEnum.equals(messageAndMedia.message.messageType, MessageType.real_shot)) {
                CoreDlg.m46188M1(MediaPreviewAct.this.act, messageAndMedia.media, messageAndMedia.message);
            }
            return true;
        }

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ void m49039y(MessageAndMedia messageAndMedia, View view) {
            i4g0.m138523u("e_photo_text_reply", OMSDialogPositon.p_chat_view, new pf60(Constants.MessagePayloadKeys.MSGID_SERVER, messageAndMedia.message.f56859id), new pf60("moments_user_id", messageAndMedia.message.owner));
            MediaPreviewAct.this.m48999H2();
            d3z.f84958x.onNext(uxj0.f181467a);
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ boolean m49040z(MessageAndMedia messageAndMedia) {
            if (MediaPreviewAct.this.lifecycle_() == C4470c.f16267i && !TEnum.equals(messageAndMedia.message.messageType, MessageType.real_shot)) {
                MediaPreviewAct mediaPreviewAct = MediaPreviewAct.this;
                if (!mediaPreviewAct.f31521r) {
                    CoreDlg.m46188M1(mediaPreviewAct.act, messageAndMedia.media, null);
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m48996A2() {
        pb1.m171472b().mo171476e(PlayerView.f28955A);
        if (NullChecker.m82486a(this.f31518o)) {
            this.f31518o.release();
        }
        if (NullChecker.m82486a(this.f31517n)) {
            this.f31517n.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ C22421c m48997B2() {
        return CoreModule.f18264c.f20384f0.m33868Xn(this.f31509f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public /* synthetic */ void m48998C2() {
        int currentItem;
        if (this.f31519p && lifecycle_() == C4470c.f16267i && (currentItem = this.f31507d.getCurrentItem()) >= 0 && currentItem < this.f31511h.f184001a.size()) {
            MessageAndMedia messageAndMedia = this.f31511h.f184001a.get(currentItem);
            if (messageAndMedia.media instanceof Video) {
                View viewFindViewWithTag = this.f31507d.findViewWithTag(messageAndMedia);
                if (viewFindViewWithTag instanceof PlayerView) {
                    PlayerView playerView = (PlayerView) viewFindViewWithTag;
                    if (playerView.m45219C()) {
                        return;
                    }
                    if (TEnum.equals(messageAndMedia.message.messageType, MessageType.real_shot)) {
                        playerView.m45226L(true);
                    } else {
                        playerView.m45225K();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$2(Bundle bundle) {
        m49025I2(this.f31515l);
        this.f31507d.setPageMargin(qa00.m175859d(8.0f));
        bnl0.m105544a0(this.f31507d);
        C8633a c8633a = new C8633a();
        this.f31510g = c8633a;
        this.f31507d.setAdapter(c8633a);
        this.f31507d.setOnPageChangeListener(this.f31510g);
        bnl0.m105509E0(this.f31508e, new View.OnClickListener() { // from class: l.m1y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134484a.m49020y2(view);
            }
        });
    }

    /* JADX INFO: renamed from: r2 */
    public static final Intent m49016r2(Context context, String str, MessageAndMedia messageAndMedia) {
        return m49017s2(context, str, messageAndMedia, false);
    }

    /* JADX INFO: renamed from: s2 */
    public static final Intent m49017s2(Context context, String str, MessageAndMedia messageAndMedia, boolean z) {
        return m49018u2(context, str, messageAndMedia, z, false);
    }

    /* JADX INFO: renamed from: u2 */
    public static final Intent m49018u2(Context context, String str, MessageAndMedia messageAndMedia, boolean z, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) MediaPreviewAct.class);
        intent.putExtra("start_data", MessageAndMedia.PROTOBUF_ADAPTER.toBytes(messageAndMedia));
        intent.putExtra("user_id", str);
        intent.putExtra("not_more_media", z);
        intent.putExtra("forbid_long_press", z2);
        return intent;
    }

    /* JADX INFO: renamed from: v2 */
    public static Intent m49019v2(Context context, String str, boolean z) {
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = str;
        Message messageNew_ = Message.new_();
        ArrayList arrayList = new ArrayList();
        messageNew_.media = arrayList;
        arrayList.add(pictureNew_);
        return m49018u2(context, null, new MessageAndMedia(pictureNew_, messageNew_), true, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m49020y2(View view) {
        m48999H2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m49021z2(C4470c c4470c) {
        if (c4470c == C4470c.f16271m || c4470c == C4470c.f16268j || c4470c == C4470c.f16269k || c4470c == C4470c.f16273o) {
            CoreModule.m30934Q().mo68436Zo().mo136902f(false);
        } else if (DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4.equals(this.f31515l.media.mediaType)) {
            CoreModule.m30934Q().mo68436Zo().mo136902f(true);
        }
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ Boolean m49022D2(MessageAndMedia messageAndMedia) {
        Message message;
        Message message2;
        return Boolean.valueOf(messageAndMedia.media.url.equals(this.f31515l.media.url) && (message = messageAndMedia.message) != null && (message2 = this.f31515l.message) != null && message.createdTime == message2.createdTime);
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m49023E2(vg60 vg60Var) {
        int iM147476G;
        vg60<MessageAndMedia> vg60Var2 = this.f31511h;
        int size = vg60Var2 == null ? 0 : vg60Var2.f184001a.size();
        if (this.f31514k) {
            for (int size2 = vg60Var.f184001a.size() - 1; size2 >= 0; size2--) {
                Message message = (Message) vg60Var.f184001a.get(size2);
                if (NullChecker.m82486a(message.media)) {
                    for (Media media : message.media) {
                        if ((media instanceof Picture) || (media instanceof Video)) {
                            this.f31512i.add(new MessageAndMedia(media, message));
                        }
                    }
                }
            }
        }
        if (!this.f31514k && vg60Var.f184001a.size() > this.f31520q) {
            for (int size3 = (vg60Var.f184001a.size() - this.f31520q) - 1; size3 >= 0; size3--) {
                Message message2 = (Message) vg60Var.f184001a.get(size3);
                if (NullChecker.m82486a(message2.media)) {
                    for (Media media2 : message2.media) {
                        if ((media2 instanceof Picture) || (media2 instanceof Video)) {
                            this.f31512i.add(new MessageAndMedia(media2, message2));
                        }
                    }
                }
            }
        }
        this.f31520q = vg60Var.f184001a.size();
        this.f31511h = new vg60<>(this.f31512i, vg60Var.f184002b);
        this.f31510g.notifyDataSetChanged();
        this.f31507d.post(new Runnable() { // from class: l.h2y
            @Override // java.lang.Runnable
            public final void run() {
                this.f107604a.m48998C2();
            }
        });
        if (this.f31514k && (iM147476G = jyb.m147476G(this.f31512i, new qcj() { // from class: l.j2y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f118130a.m49022D2((MessageAndMedia) obj);
            }
        })) >= 0) {
            this.f31507d.m4178T(iM147476G, false);
            this.f31515l = this.f31511h.f184001a.get(iM147476G);
            this.f31514k = false;
        }
        if (size != this.f31511h.f184001a.size() || this.f31513j >= 5) {
            this.f31513j = 0;
        } else {
            m49026K2();
        }
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ void m49024F2(C4470c c4470c) {
        pb1.m171472b().mo171476e(PlayerView.f28955A);
        if (NullChecker.m82486a(this.f31517n)) {
            this.f31517n.stop();
        }
        if (NullChecker.m82486a(this.f31518o)) {
            this.f31518o.stop();
        }
    }

    /* JADX INFO: renamed from: I2 */
    public final void m49025I2(MessageAndMedia messageAndMedia) {
        if (NullChecker.m82486a(messageAndMedia) && NullChecker.m82486a(messageAndMedia.media)) {
            boolean z = messageAndMedia.media instanceof Video;
            VImage vImage = this.f31508e;
            if (z) {
                bnl0.m105524M(vImage, true);
            } else {
                bnl0.m105524M(vImage, false);
            }
        }
    }

    /* JADX INFO: renamed from: K2 */
    public final void m49026K2() {
        this.f31513j++;
        if (this.f31511h.m201221c()) {
            CoreModule.f18264c.f20384f0.m33600Bn(this.f31509f);
        }
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish, reason: merged with bridge method [inline-methods] */
    public void m48999H2() {
        super.m48999H2();
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(x7c0.f192686a, x7c0.f192687b);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View topViewLayout = setTopViewLayout(m49027q2(layoutInflater, viewGroup));
        this.f31508e.setColorFilter(-1);
        return topViewLayout;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f31515l = MessageAndMedia.PROTOBUF_ADAPTER.get(getIntent().getByteArrayExtra("start_data"));
        this.f31516m = getIntent().getBooleanExtra("not_more_media", false);
        this.f31521r = getIntent().getBooleanExtra("forbid_long_press", false);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.t1y
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171700a.lambda$initSubscription$2((Bundle) obj);
            }
        }, new x20() { // from class: l.v1y
            @Override // p153l.x20
            public final void call() {
                this.f182032a.m48996A2();
            }
        });
        if (!this.f31516m) {
            duringCreated(new pcj() { // from class: l.x1y
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f192104a.m48997B2();
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.z1y
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f202613a.m49023E2((vg60) obj);
                }
            }));
        }
        lifecycle().filter(new qcj() { // from class: l.b2y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16268j);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.d2y
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84838a.m49024F2((C4470c) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.f2y
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96935a.m49021z2((C4470c) obj);
            }
        }));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        View viewFindViewWithTag = this.f31507d.findViewWithTag(this.f31515l);
        if (viewFindViewWithTag instanceof VFrame) {
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) viewFindViewWithTag.findViewById(adc0.f69948I7);
            if (NullChecker.m82486a(subsamplingScaleImageView)) {
                subsamplingScaleImageView.setOnImageEventListener(null);
                subsamplingScaleImageView.setVisibility(8);
                ((VFrame) viewFindViewWithTag).removeView(subsamplingScaleImageView);
                l51.m152888H(this, new Runnable() { // from class: l.k1y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f123559a.m48999H2();
                    }
                }, 100L);
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f31511h = new vg60<>(jyb.m147507f0(this.f31515l), null);
        this.f31509f = getIntent().getStringExtra("user_id");
        setSwipeBackEnable(false);
        dimStatusBar(true);
        setStatusBarColor(getResources().getColor(c9c0.f80386W1));
        decorOrSwipingDecorView().setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(x7c0.f192688c, x7c0.f192689d);
    }

    /* JADX INFO: renamed from: q2 */
    public View m49027q2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s2y.m184158b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w2 */
    public ie80 m49028w2(String str) {
        if (!NullChecker.m82486a(str) || str.startsWith("http")) {
            if (this.f31518o == null) {
                this.f31518o = new ye80();
            }
            return this.f31518o;
        }
        if (this.f31517n == null) {
            this.f31517n = new re80();
        }
        return this.f31517n;
    }
}
