package com.p051p1.mobile.putong.core.p058ui.profile.profilelist;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C0610n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4901p;
import com.p051p1.mobile.putong.core.app.AutoReleaseVideoFrag;
import com.p051p1.mobile.putong.core.data.Action;
import com.p051p1.mobile.putong.core.data.CategorySuggestions;
import com.p051p1.mobile.putong.core.data.CityCData;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.GreetingPermission;
import com.p051p1.mobile.putong.core.data.LikeUser;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProfileEditInfo;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RiskOtherData;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p051p1.mobile.putong.core.newui.view.PicCertGuideView;
import com.p051p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p051p1.mobile.putong.core.p058ui.FloatShadowButton;
import com.p051p1.mobile.putong.core.p058ui.GradientBgWithShadowButton;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.profile.EditProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCards;
import com.p051p1.mobile.putong.core.p058ui.profile.ParallaxView;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct_CustomTransition;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.ProfileCreateData;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.PerformanceLogUtil;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.ProfileLogEntity;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.ProfileListFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.itemholders.ProfileReportItemHolder;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileCustomBar;
import com.p051p1.mobile.putong.core.p058ui.profile.views.VPager_SquaredRefactor;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.report.C8992f;
import com.p051p1.mobile.putong.core.p058ui.report.ReportAct;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p051p1.mobile.putong.core.p058ui.vip.greet.ProfileSendContainerView;
import com.p051p1.mobile.putong.core.util.CertificationUtil;
import com.p051p1.mobile.putong.core.util.DebugUtil;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p051p1.mobile.putong.data.Contact;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.DetectRequest;
import com.p051p1.mobile.putong.data.DetectText;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.PicVerification;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.SwipeExtraScData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.UserWealthGradeConfig;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialOperation;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.joor.Reflect;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.CoverGuideView;
import p151v.SimpleCoverGuideView;
import p151v.VButton;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VFrame_FlipContainer;
import p151v.VFrame_Shadow;
import p151v.VImage;
import p151v.VLinear;
import p151v.VListCell;
import p151v.VProgressBar;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p153l.a30;
import p153l.a5i0;
import p153l.adc0;
import p153l.aia0;
import p153l.al80;
import p153l.ap90;
import p153l.aw90;
import p153l.axa0;
import p153l.az90;
import p153l.aza0;
import p153l.b43;
import p153l.bkj0;
import p153l.bnl0;
import p153l.bpe;
import p153l.bpe0;
import p153l.bsj0;
import p153l.byd0;
import p153l.c8d0;
import p153l.c9c0;
import p153l.cl80;
import p153l.cs90;
import p153l.cza0;
import p153l.d4b0;
import p153l.d79;
import p153l.dbc0;
import p153l.du90;
import p153l.dy90;
import p153l.eu4;
import p153l.ewa0;
import p153l.fcp;
import p153l.fo0;
import p153l.fs90;
import p153l.fwa0;
import p153l.fy90;
import p153l.g2b0;
import p153l.gne;
import p153l.goe;
import p153l.gra;
import p153l.gt0;
import p153l.gul0;
import p153l.gya0;
import p153l.gyp;
import p153l.h7d0;
import p153l.h9n;
import p153l.hl3;
import p153l.hme;
import p153l.hr90;
import p153l.hva0;
import p153l.hxf;
import p153l.i4g0;
import p153l.ix60;
import p153l.ixa0;
import p153l.j1a;
import p153l.j6p;
import p153l.jda0;
import p153l.joa;
import p153l.jr90;
import p153l.jva0;
import p153l.jxd0;
import p153l.jyb;
import p153l.jz90;
import p153l.k1b0;
import p153l.kda0;
import p153l.kec0;
import p153l.koe;
import p153l.kpe;
import p153l.l4g0;
import p153l.l51;
import p153l.lfc0;
import p153l.lik0;
import p153l.luh;
import p153l.lza0;
import p153l.m2b0;
import p153l.ml70;
import p153l.mm90;
import p153l.mp90;
import p153l.mya0;
import p153l.mz90;
import p153l.n1b0;
import p153l.ner;
import p153l.nme;
import p153l.nmp;
import p153l.no90;
import p153l.non;
import p153l.nrb0;
import p153l.nxa0;
import p153l.o1j0;
import p153l.olk0;
import p153l.oma0;
import p153l.on2;
import p153l.owa0;
import p153l.oz90;
import p153l.p0a0;
import p153l.p6d0;
import p153l.p6w;
import p153l.p9r;
import p153l.pcj;
import p153l.pf60;
import p153l.pgj;
import p153l.pha0;
import p153l.ppe;
import p153l.psd0;
import p153l.pza0;
import p153l.pzi0;
import p153l.q1a0;
import p153l.q3m;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.qj90;
import p153l.qq90;
import p153l.qtk;
import p153l.qu90;
import p153l.qya0;
import p153l.r1j0;
import p153l.rbb0;
import p153l.rcj;
import p153l.rgr;
import p153l.rm90;
import p153l.s1b0;
import p153l.s75;
import p153l.sfj0;
import p153l.spl0;
import p153l.t3m;
import p153l.t7m;
import p153l.th0;
import p153l.tmp;
import p153l.tnt;
import p153l.tvn;
import p153l.tya0;
import p153l.ue60;
import p153l.uqb0;
import p153l.uxj0;
import p153l.ve60;
import p153l.vq8;
import p153l.vxd0;
import p153l.vya0;
import p153l.w1e;
import p153l.w30;
import p153l.wj90;
import p153l.wkh0;
import p153l.wtk;
import p153l.wyd0;
import p153l.x20;
import p153l.x7c0;
import p153l.x95;
import p153l.xc20;
import p153l.xfc0;
import p153l.xle;
import p153l.xne;
import p153l.xwa0;
import p153l.xya0;
import p153l.y1b0;
import p153l.y20;
import p153l.yaa0;
import p153l.yab;
import p153l.yb5;
import p153l.yn90;
import p153l.z20;
import p153l.z5h0;
import p153l.zbj;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileListFrag extends AutoReleaseVideoFrag implements View.OnClickListener, q3m {

    /* JADX INFO: renamed from: G4 */
    public static l4g0 f34456G4 = new l4g0("p_edit_profile_post_pic_popup", Dialog.class.getName());

    /* JADX INFO: renamed from: H4 */
    public static Field f34457H4 = Reflect.m222381on((Class<?>) Toolbar.class).field0("mMenuView");

    /* JADX INFO: renamed from: I4 */
    public static CategorySuggestions f34458I4;

    /* JADX INFO: renamed from: A */
    public VNavigationBar f34459A;

    /* JADX INFO: renamed from: A1 */
    public VLinear f34460A1;

    /* JADX INFO: renamed from: A3 */
    public View f34462A3;

    /* JADX INFO: renamed from: A4 */
    public boolean f34463A4;

    /* JADX INFO: renamed from: B */
    public View f34464B;

    /* JADX INFO: renamed from: B4 */
    public boolean f34468B4;

    /* JADX INFO: renamed from: C */
    public TabLayout f34469C;

    /* JADX INFO: renamed from: C3 */
    public int f34472C3;

    /* JADX INFO: renamed from: C4 */
    public final lza0 f34473C4;

    /* JADX INFO: renamed from: D */
    public VFrame f34474D;

    /* JADX INFO: renamed from: D3 */
    public boolean f34477D3;

    /* JADX INFO: renamed from: D4 */
    public x20 f34478D4;

    /* JADX INFO: renamed from: E */
    public VProgressBar f34479E;

    /* JADX INFO: renamed from: E0 */
    public VFrame_Shadow f34480E0;

    /* JADX INFO: renamed from: E3 */
    public ProfileCreateData f34483E3;

    /* JADX INFO: renamed from: E4 */
    public HashMap<View, View> f34484E4;

    /* JADX INFO: renamed from: F */
    public VFrame f34485F;

    /* JADX INFO: renamed from: F0 */
    public VFrame_FlipContainer f34486F0;

    /* JADX INFO: renamed from: F4 */
    public Set<String> f34490F4;

    /* JADX INFO: renamed from: G */
    public VProgressBar f34491G;

    /* JADX INFO: renamed from: G0 */
    public VImage f34492G0;

    /* JADX INFO: renamed from: G3 */
    public LikedUser f34495G3;

    /* JADX INFO: renamed from: H */
    public ParallaxView f34496H;

    /* JADX INFO: renamed from: H0 */
    public VText f34497H0;

    /* JADX INFO: renamed from: H3 */
    public LikeUser f34500H3;

    /* JADX INFO: renamed from: I */
    public VLinear f34501I;

    /* JADX INFO: renamed from: I0 */
    public VLinear f34502I0;

    /* JADX INFO: renamed from: I3 */
    public User f34505I3;

    /* JADX INFO: renamed from: J */
    public FrameLayout f34506J;

    /* JADX INFO: renamed from: J0 */
    public VFrame_FlipContainer f34507J0;

    /* JADX INFO: renamed from: K */
    public CardView f34511K;

    /* JADX INFO: renamed from: K0 */
    public VImage f34512K0;

    /* JADX INFO: renamed from: L */
    public CardView f34516L;

    /* JADX INFO: renamed from: L0 */
    public FrameLayout f34517L0;

    /* JADX INFO: renamed from: M */
    public CardView f34521M;

    /* JADX INFO: renamed from: M0 */
    public GradientBgWithShadowButton f34522M0;

    /* JADX INFO: renamed from: N */
    public RoundedRectangleProgressView f34526N;

    /* JADX INFO: renamed from: N0 */
    public VFrame_Shadow f34527N0;

    /* JADX INFO: renamed from: N1 */
    public t7m f34528N1;

    /* JADX INFO: renamed from: O */
    public RoundedRectangleProgressView f34531O;

    /* JADX INFO: renamed from: O0 */
    public VFrame_Shadow f34532O0;

    /* JADX INFO: renamed from: P */
    public VImage f34536P;

    /* JADX INFO: renamed from: P0 */
    public RelativeLayout f34537P0;

    /* JADX INFO: renamed from: P3 */
    public String f34540P3;

    /* JADX INFO: renamed from: Q */
    public VImage f34541Q;

    /* JADX INFO: renamed from: Q0 */
    public RelativeLayout f34542Q0;

    /* JADX INFO: renamed from: R */
    public VText f34546R;

    /* JADX INFO: renamed from: R0 */
    public VLinear f34547R0;

    /* JADX INFO: renamed from: S */
    public VText f34551S;

    /* JADX INFO: renamed from: S0 */
    public VButton f34552S0;

    /* JADX INFO: renamed from: S3 */
    public CityCData f34555S3;

    /* JADX INFO: renamed from: T */
    public ViewStub f34556T;

    /* JADX INFO: renamed from: T0 */
    public VButton f34557T0;

    /* JADX INFO: renamed from: U */
    public ViewStub f34561U;

    /* JADX INFO: renamed from: U0 */
    public ConstraintLayout f34562U0;

    /* JADX INFO: renamed from: V */
    public RecyclerView f34566V;

    /* JADX INFO: renamed from: V0 */
    public FrameLayout f34567V0;

    /* JADX INFO: renamed from: W */
    public FloatShadowButton f34571W;

    /* JADX INFO: renamed from: W0 */
    public View f34572W0;

    /* JADX INFO: renamed from: W3 */
    public View f34575W3;

    /* JADX INFO: renamed from: X */
    public View f34576X;

    /* JADX INFO: renamed from: X0 */
    public VEditText f34577X0;

    /* JADX INFO: renamed from: X1 */
    public pf60<Integer, Integer> f34578X1;

    /* JADX INFO: renamed from: X3 */
    public View f34580X3;

    /* JADX INFO: renamed from: Y */
    public RelativeLayout f34581Y;

    /* JADX INFO: renamed from: Y0 */
    public VText f34582Y0;

    /* JADX INFO: renamed from: Y1 */
    public w30 f34583Y1;

    /* JADX INFO: renamed from: Y3 */
    public ViewTreeObserver.OnGlobalLayoutListener f34585Y3;

    /* JADX INFO: renamed from: Z */
    public VFrame_Shadow f34586Z;

    /* JADX INFO: renamed from: Z0 */
    public FrameLayout f34587Z0;

    /* JADX INFO: renamed from: Z1 */
    public SimpleCoverGuideView f34588Z1;

    /* JADX INFO: renamed from: Z3 */
    public boolean f34590Z3;

    /* JADX INFO: renamed from: a1 */
    public View f34591a1;

    /* JADX INFO: renamed from: a2 */
    public CoverGuideView f34592a2;

    /* JADX INFO: renamed from: a4 */
    public boolean f34594a4;

    /* JADX INFO: renamed from: b1 */
    public TextView f34595b1;

    /* JADX INFO: renamed from: b2 */
    public LinearLayoutManager f34596b2;

    /* JADX INFO: renamed from: b4 */
    public th0 f34598b4;

    /* JADX INFO: renamed from: c1 */
    public ProfileSendContainerView f34599c1;

    /* JADX INFO: renamed from: c4 */
    public User f34602c4;

    /* JADX INFO: renamed from: d1 */
    public VFrame_Shadow f34603d1;

    /* JADX INFO: renamed from: d4 */
    public final C22507a<uxj0> f34606d4;

    /* JADX INFO: renamed from: e1 */
    public RelativeLayout f34607e1;

    /* JADX INFO: renamed from: e4 */
    public boolean f34610e4;

    /* JADX INFO: renamed from: f1 */
    public SuperLikeComboAnimView f34611f1;

    /* JADX INFO: renamed from: f4 */
    public boolean f34614f4;

    /* JADX INFO: renamed from: g1 */
    public TextView f34615g1;

    /* JADX INFO: renamed from: g4 */
    public int f34618g4;

    /* JADX INFO: renamed from: h1 */
    public VFrame_Shadow f34619h1;

    /* JADX INFO: renamed from: h4 */
    public final RecyclerView.AbstractC0584t f34622h4;

    /* JADX INFO: renamed from: i1 */
    public RelativeLayout f34623i1;

    /* JADX INFO: renamed from: i4 */
    public String f34626i4;

    /* JADX INFO: renamed from: j1 */
    public VImage f34627j1;

    /* JADX INFO: renamed from: j2 */
    public User f34628j2;

    /* JADX INFO: renamed from: j4 */
    public final List<on2<?>> f34630j4;

    /* JADX INFO: renamed from: k0 */
    public RelativeLayout f34631k0;

    /* JADX INFO: renamed from: k1 */
    public VLinear f34632k1;

    /* JADX INFO: renamed from: k2 */
    public User f34633k2;

    /* JADX INFO: renamed from: k3 */
    public ValueAnimator f34634k3;

    /* JADX INFO: renamed from: k4 */
    public gne f34635k4;

    /* JADX INFO: renamed from: l1 */
    public VFrame_Shadow f34636l1;

    /* JADX INFO: renamed from: l4 */
    public hva0 f34639l4;

    /* JADX INFO: renamed from: m1 */
    public VFrame_Shadow f34640m1;

    /* JADX INFO: renamed from: m3 */
    public String f34642m3;

    /* JADX INFO: renamed from: m4 */
    public hme f34643m4;

    /* JADX INFO: renamed from: n1 */
    public VRelative f34644n1;

    /* JADX INFO: renamed from: n2 */
    public pf60<List<Literatures>, List<LiteraturesComments>> f34645n2;

    /* JADX INFO: renamed from: n3 */
    public boolean f34646n3;

    /* JADX INFO: renamed from: n4 */
    public koe f34647n4;

    /* JADX INFO: renamed from: o1 */
    public View f34648o1;

    /* JADX INFO: renamed from: o2 */
    public Animator f34649o2;

    /* JADX INFO: renamed from: o4 */
    public xle f34651o4;

    /* JADX INFO: renamed from: p0 */
    public VText f34652p0;

    /* JADX INFO: renamed from: p1 */
    public View f34653p1;

    /* JADX INFO: renamed from: p4 */
    public xne f34656p4;

    /* JADX INFO: renamed from: q1 */
    public ProfileCustomBar f34657q1;

    /* JADX INFO: renamed from: q4 */
    public ppe f34660q4;

    /* JADX INFO: renamed from: r1 */
    public View f34661r1;

    /* JADX INFO: renamed from: r4 */
    public goe f34664r4;

    /* JADX INFO: renamed from: s1 */
    public VFrame f34665s1;

    /* JADX INFO: renamed from: s4 */
    public kpe f34668s4;

    /* JADX INFO: renamed from: t1 */
    public LinearLayout f34669t1;

    /* JADX INFO: renamed from: t2 */
    public Media f34670t2;

    /* JADX INFO: renamed from: t3 */
    public String f34671t3;

    /* JADX INFO: renamed from: t4 */
    public tya0 f34672t4;

    /* JADX INFO: renamed from: u1 */
    public VText f34673u1;

    /* JADX INFO: renamed from: u4 */
    public nme f34676u4;

    /* JADX INFO: renamed from: v1 */
    public VLinear f34677v1;

    /* JADX INFO: renamed from: v2 */
    public boolean f34678v2;

    /* JADX INFO: renamed from: v4 */
    public gya0 f34680v4;

    /* JADX INFO: renamed from: w1 */
    public VLinear f34681w1;

    /* JADX INFO: renamed from: w2 */
    public boolean f34682w2;

    /* JADX INFO: renamed from: w4 */
    public jva0 f34684w4;

    /* JADX INFO: renamed from: x1 */
    public VLinear f34685x1;

    /* JADX INFO: renamed from: x2 */
    public PicCertGuideView f34686x2;

    /* JADX INFO: renamed from: x4 */
    public b43 f34688x4;

    /* JADX INFO: renamed from: y1 */
    public VLinear f34689y1;

    /* JADX INFO: renamed from: y4 */
    public boolean f34692y4;

    /* JADX INFO: renamed from: z */
    public VFrame f34693z;

    /* JADX INFO: renamed from: z1 */
    public VImage f34694z1;

    /* JADX INFO: renamed from: z2 */
    public hr90 f34695z2;

    /* JADX INFO: renamed from: z4 */
    public int f34697z4;

    /* JADX INFO: renamed from: B1 */
    public boolean f34465B1 = true;

    /* JADX INFO: renamed from: C1 */
    public final boolean f34470C1 = false;

    /* JADX INFO: renamed from: D1 */
    public vxd0 f34475D1 = new vxd0("show_share_tip_count_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: E1 */
    public vxd0 f34481E1 = new vxd0("show_share_today_tip_count" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: F1 */
    public wyd0 f34487F1 = new wyd0("show_share_tip_data_" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: G1 */
    public vxd0 f34493G1 = new vxd0("show_share_tip_user_count_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: H1 */
    @SuppressLint({"SV_USE_DUP_ID"})
    public vxd0 f34498H1 = new vxd0("show_pic_post_dialog_count_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: I1 */
    public byd0 f34503I1 = new byd0("last_auto_call_video_chat_time" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: J1 */
    public jxd0 f34508J1 = new jxd0("is_show_shimmer" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: K1 */
    public final boolean f34513K1 = m189087s();

    /* JADX INFO: renamed from: L1 */
    public final boolean f34518L1 = false;

    /* JADX INFO: renamed from: M1 */
    public boolean f34523M1 = false;

    /* JADX INFO: renamed from: O1 */
    public final C22507a<User> f34533O1 = C22507a.m222758b();

    /* JADX INFO: renamed from: P1 */
    public User f34538P1 = null;

    /* JADX INFO: renamed from: Q1 */
    public int f34543Q1 = 0;

    /* JADX INFO: renamed from: R1 */
    public int f34548R1 = -1;

    /* JADX INFO: renamed from: S1 */
    public int f34553S1 = -1;

    /* JADX INFO: renamed from: T1 */
    public boolean f34558T1 = false;

    /* JADX INFO: renamed from: U1 */
    public boolean f34563U1 = false;

    /* JADX INFO: renamed from: V1 */
    public boolean f34568V1 = false;

    /* JADX INFO: renamed from: W1 */
    public boolean f34573W1 = false;

    /* JADX INFO: renamed from: c2 */
    public boolean f34600c2 = false;

    /* JADX INFO: renamed from: d2 */
    public boolean f34604d2 = false;

    /* JADX INFO: renamed from: e2 */
    public boolean f34608e2 = false;

    /* JADX INFO: renamed from: f2 */
    public boolean f34612f2 = false;

    /* JADX INFO: renamed from: g2 */
    public boolean f34616g2 = false;

    /* JADX INFO: renamed from: h2 */
    public int f34620h2 = 0;

    /* JADX INFO: renamed from: i2 */
    public boolean f34624i2 = false;

    /* JADX INFO: renamed from: l2 */
    public boolean f34637l2 = false;

    /* JADX INFO: renamed from: m2 */
    public final C22507a<uxj0> f34641m2 = C22507a.m222758b();

    /* JADX INFO: renamed from: p2 */
    public boolean f34654p2 = false;

    /* JADX INFO: renamed from: q2 */
    public long f34658q2 = 0;

    /* JADX INFO: renamed from: r2 */
    public HashMap<String, String> f34662r2 = new HashMap<>();

    /* JADX INFO: renamed from: s2 */
    public boolean f34666s2 = false;

    /* JADX INFO: renamed from: u2 */
    public boolean f34674u2 = false;

    /* JADX INFO: renamed from: y2 */
    public hr90 f34690y2 = new hr90(this, this);

    /* JADX INFO: renamed from: A2 */
    public jr90 f34461A2 = new jr90(this, this);

    /* JADX INFO: renamed from: B2 */
    public ProfileImagesItemHolder f34466B2 = new ProfileImagesItemHolder(this, this);

    /* JADX INFO: renamed from: C2 */
    public rm90 f34471C2 = new rm90(this, this);

    /* JADX INFO: renamed from: D2 */
    public no90 f34476D2 = new ap90(this, this);

    /* JADX INFO: renamed from: E2 */
    public axa0 f34482E2 = new axa0(this, this);

    /* JADX INFO: renamed from: F2 */
    public ewa0 f34488F2 = new qya0(this, this);

    /* JADX INFO: renamed from: G2 */
    public nxa0 f34494G2 = new nxa0(this, this);

    /* JADX INFO: renamed from: H2 */
    public qq90 f34499H2 = new qq90(this, this);

    /* JADX INFO: renamed from: I2 */
    public oz90 f34504I2 = new oz90(this, this);

    /* JADX INFO: renamed from: J2 */
    public mm90 f34509J2 = new mm90(this, this);

    /* JADX INFO: renamed from: K2 */
    public xwa0 f34514K2 = new xwa0(this, this);

    /* JADX INFO: renamed from: L2 */
    public cs90 f34519L2 = new cs90(this, this);

    /* JADX INFO: renamed from: M2 */
    public bpe f34524M2 = new bpe(this, this);

    /* JADX INFO: renamed from: N2 */
    public owa0 f34529N2 = new owa0(this, this);

    /* JADX INFO: renamed from: O2 */
    public dy90 f34534O2 = new fy90(this, this);

    /* JADX INFO: renamed from: P2 */
    public mz90 f34539P2 = new mz90(this, this);

    /* JADX INFO: renamed from: Q2 */
    public yn90 f34544Q2 = new yn90(this, this);

    /* JADX INFO: renamed from: R2 */
    public g2b0 f34549R2 = new y1b0(this, this);

    /* JADX INFO: renamed from: S2 */
    public az90 f34554S2 = new jz90(this, this);

    /* JADX INFO: renamed from: T2 */
    public aza0 f34559T2 = new cza0(this, this);

    /* JADX INFO: renamed from: U2 */
    public tya0 f34564U2 = new vya0(this, this);

    /* JADX INFO: renamed from: V2 */
    public oma0 f34569V2 = new oma0(this, this);

    /* JADX INFO: renamed from: W2 */
    public p0a0 f34574W2 = new p0a0(this, this);

    /* JADX INFO: renamed from: X2 */
    public ProfileReportItemHolder f34579X2 = new ProfileReportItemHolder(this, this);

    /* JADX INFO: renamed from: Y2 */
    public k1b0 f34584Y2 = new k1b0(this, this);

    /* JADX INFO: renamed from: Z2 */
    public xya0 f34589Z2 = new xya0(this, this);

    /* JADX INFO: renamed from: a3 */
    public du90 f34593a3 = new du90(this, this);

    /* JADX INFO: renamed from: b3 */
    public n1b0 f34597b3 = new n1b0(this, this);

    /* JADX INFO: renamed from: c3 */
    public s1b0 f34601c3 = new s1b0(this, this);

    /* JADX INFO: renamed from: d3 */
    public mya0 f34605d3 = new mya0(this, this);

    /* JADX INFO: renamed from: e3 */
    public fs90 f34609e3 = new fs90(this, this);

    /* JADX INFO: renamed from: f3 */
    public m2b0 f34613f3 = new m2b0(this, this);

    /* JADX INFO: renamed from: g3 */
    public d4b0 f34617g3 = new d4b0(this, this);

    /* JADX INFO: renamed from: h3 */
    public fwa0 f34621h3 = new fwa0(this, this);

    /* JADX INFO: renamed from: i3 */
    public q1a0 f34625i3 = new q1a0();

    /* JADX INFO: renamed from: j3 */
    public boolean f34629j3 = false;

    /* JADX INFO: renamed from: l3 */
    public boolean f34638l3 = false;

    /* JADX INFO: renamed from: o3 */
    public boolean f34650o3 = false;

    /* JADX INFO: renamed from: p3 */
    public String f34655p3 = "";

    /* JADX INFO: renamed from: q3 */
    public boolean f34659q3 = false;

    /* JADX INFO: renamed from: r3 */
    public boolean f34663r3 = false;

    /* JADX INFO: renamed from: s3 */
    public boolean f34667s3 = true;

    /* JADX INFO: renamed from: u3 */
    public boolean f34675u3 = false;

    /* JADX INFO: renamed from: v3 */
    public boolean f34679v3 = false;

    /* JADX INFO: renamed from: w3 */
    public boolean f34683w3 = false;

    /* JADX INFO: renamed from: x3 */
    public int f34687x3 = 0;

    /* JADX INFO: renamed from: y3 */
    public String f34691y3 = "";

    /* JADX INFO: renamed from: z3 */
    public String f34696z3 = "";

    /* JADX INFO: renamed from: B3 */
    public RelationshipStatus f34467B3 = RelationshipStatus.get("unknown_");

    /* JADX INFO: renamed from: F3 */
    public boolean f34489F3 = false;

    /* JADX INFO: renamed from: J3 */
    public int f34510J3 = -1;

    /* JADX INFO: renamed from: K3 */
    public final ArrayList<View> f34515K3 = new ArrayList<>();

    /* JADX INFO: renamed from: L3 */
    public final ArrayList<TextView> f34520L3 = new ArrayList<>();

    /* JADX INFO: renamed from: M3 */
    public final ArrayList<View> f34525M3 = new ArrayList<>();

    /* JADX INFO: renamed from: N3 */
    public final ArrayList<View> f34530N3 = new ArrayList<>();

    /* JADX INFO: renamed from: O3 */
    public int f34535O3 = 4;

    /* JADX INFO: renamed from: Q3 */
    public int f34545Q3 = (bnl0.m105592y0() - qa00.m175859d(60.0f)) / 2;

    /* JADX INFO: renamed from: R3 */
    public boolean f34550R3 = false;

    /* JADX INFO: renamed from: T3 */
    public NewNewProfileCard.InterfaceC8014d f34560T3 = new C8864i();

    /* JADX INFO: renamed from: U3 */
    public x20 f34565U3 = new C8865j();

    /* JADX INFO: renamed from: V3 */
    public List<y20<t7m>> f34570V3 = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$6 */
    public class ResultReceiverC88556 extends ResultReceiver {
        final /* synthetic */ boolean val$matched;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResultReceiverC88556(Handler handler, boolean z) {
            super(handler);
            this.val$matched = z;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m53563b() {
            ProfileListFrag.this.act().setResult(SwipeDirection.LEFT.getValue());
            ProfileListFrag.this.act().m68056e2();
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            if (i != -1 || this.val$matched) {
                return;
            }
            ProfileListFrag.this.m21591l4(new Runnable() { // from class: com.p1.mobile.putong.core.ui.profile.profilelist.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34711a.m53563b();
                }
            });
        }
    }

    public class ProfileEditInfoException extends RuntimeException {
        public ProfileEditInfoException() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$a */
    public class C8856a implements VFrame_Shadow.InterfaceC22657a {
        public C8856a() {
        }

        @Override // p151v.VFrame_Shadow.InterfaceC22657a
        /* JADX INFO: renamed from: a */
        public void mo53564a() {
            boolean zIsFemale = false;
            ((ViewGroup) ProfileListFrag.this.mo52249J1().act().getWindow().getDecorView()).setMotionEventSplittingEnabled(false);
            boolean zEquals = TextUtils.equals(ProfileListFrag.this.f34628j2.f56859id, z5h0.m218675j().f203055m);
            bnl0.m105525M0(ProfileListFrag.this.f34611f1, true);
            ProfileListFrag profileListFrag = ProfileListFrag.this;
            SuperLikeComboAnimView superLikeComboAnimView = profileListFrag.f34611f1;
            boolean zM82486a = NullChecker.m82486a(profileListFrag.f34628j2);
            ProfileListFrag profileListFrag2 = ProfileListFrag.this;
            if (zM82486a) {
                zIsFemale = profileListFrag2.f34628j2.isFemale();
            } else if (NullChecker.m82486a(profileListFrag2.f34633k2) && !ProfileListFrag.this.f34633k2.isFemale()) {
                zIsFemale = true;
            }
            superLikeComboAnimView.m56971r(zEquals, true, zIsFemale);
        }

        @Override // p151v.VFrame_Shadow.InterfaceC22657a
        /* JADX INFO: renamed from: b */
        public void mo53565b() {
            ((ViewGroup) ProfileListFrag.this.mo52249J1().act().getWindow().getDecorView()).setMotionEventSplittingEnabled(true);
            bnl0.m105525M0(ProfileListFrag.this.f34611f1, false);
            bpe0.m105814f().m105816c(ProfileListFrag.this.f34628j2.f56859id, ProfileListFrag.this.f34611f1.m56974u(), false, OMSDialogPositon.p_suggest_user_profile_info_view);
            ProfileListFrag.this.m53454id();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$b */
    public class C8857b extends RecyclerView.AbstractC0584t {
        public C8857b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            ProfileListFrag.this.m53198rd();
            ProfileListFrag.this.m53516sd(recyclerView.canScrollVertically(-1));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$c */
    public class C8858c extends RecyclerView.AbstractC0584t {
        public C8858c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            ProfileListFrag.this.f34618g4 += i2;
            ProfileListFrag profileListFrag = ProfileListFrag.this;
            if (!profileListFrag.f34650o3) {
                profileListFrag.f34466B2.m53993S1(profileListFrag.f34618g4);
            }
            ProfileListFrag profileListFrag2 = ProfileListFrag.this;
            if (profileListFrag2.f34650o3 || !NullChecker.m82486a(profileListFrag2.f34466B2.f34907u)) {
                return;
            }
            if (i2 == 0 && ProfileListFrag.this.f34618g4 == 0) {
                ProfileListFrag.this.m53467l9();
            }
            if (i2 != 0) {
                ProfileListFrag profileListFrag3 = ProfileListFrag.this;
                profileListFrag3.f34571W.setTranslationY((-profileListFrag3.f34618g4) + ProfileListFrag.this.f34620h2);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$d */
    public class C8859d implements y20<Throwable> {
        public C8859d() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isBlocked() && NullChecker.m82486a(CoreModule.m30930K().getUserById(ProfileListFrag.this.f34642m3)) && !CoreModule.m30930K().getUserById(ProfileListFrag.this.f34642m3).unilateralBlock()) {
                CoreModule.f18264c.f20381e0.m116447Ba(ProfileListFrag.this.f34642m3);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$e */
    public class C8860e implements y20<C4470c> {
        public C8860e() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(C4470c c4470c) {
            if (c4470c != C4470c.f16267i) {
                if (c4470c == C4470c.f16269k) {
                    ProfileListFrag.this.m53423d9();
                }
            } else {
                ProfileListFrag profileListFrag = ProfileListFrag.this;
                if (profileListFrag.f34628j2 == null) {
                    profileListFrag.f34566V.setVisibility(4);
                    ProfileListFrag.this.f34496H.setVisibility(4);
                    ProfileListFrag.this.f34491G.setVisibility(0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$f */
    public class C8861f extends tya0 {
        public C8861f(t3m t3mVar, ner nerVar) {
            super(t3mVar, nerVar);
        }

        @Override // p153l.on2
        /* JADX INFO: renamed from: k */
        public boolean mo53568k() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$g */
    public class C8862g extends C0610n {
        public C8862g(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0610n
        public int getVerticalSnapPreference() {
            return -1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$h */
    public class C8863h implements x20 {
        public C8863h() {
        }

        @Override // p153l.x20
        public void call() {
            ProfileListFrag profileListFrag = ProfileListFrag.this;
            bnl0.m105524M(profileListFrag.f34632k1, bnl0.m105529O0(profileListFrag.f34636l1) || bnl0.m105529O0(ProfileListFrag.this.f34640m1));
            if (bnl0.m105529O0(ProfileListFrag.this.f34636l1) && bnl0.m105529O0(ProfileListFrag.this.f34640m1)) {
                bnl0.m105507D0(ProfileListFrag.this.f34545Q3, ProfileListFrag.this.f34636l1);
                bnl0.m105507D0(ProfileListFrag.this.f34545Q3, ProfileListFrag.this.f34640m1);
                ProfileListFrag profileListFrag2 = ProfileListFrag.this;
                profileListFrag2.m53231A8(profileListFrag2.f34636l1);
                ProfileListFrag profileListFrag3 = ProfileListFrag.this;
                profileListFrag3.m53231A8(profileListFrag3.f34640m1);
            } else if (bnl0.m105529O0(ProfileListFrag.this.f34636l1)) {
                bnl0.m105507D0(ProfileListFrag.this.f34545Q3, ProfileListFrag.this.f34636l1);
                ProfileListFrag profileListFrag4 = ProfileListFrag.this;
                profileListFrag4.m53231A8(profileListFrag4.f34636l1);
            }
            ProfileListFrag.this.m53294K8();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$i */
    public class C8864i implements NewNewProfileCard.InterfaceC8014d {
        public C8864i() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$j */
    public class C8865j implements x20 {
        public C8865j() {
        }

        @Override // p153l.x20
        public void call() {
            Intent intentM51923r2 = ProfileAct.m51923r2(ProfileListFrag.this.getContext(), ProfileListFrag.this.m189086i2().f56859id, "preview_card", false, false, ProfileListFrag.this.f34528N1 != null ? ProfileListFrag.this.f34528N1.getShowPictureIndex() : -1);
            intentM51923r2.putExtra("preview_user_info", ProfileListFrag.this.m189086i2());
            ProfileListFrag.this.startActivity(intentM51923r2);
            ProfileListFrag.this.act().overridePendingTransition(x7c0.f192710y, 0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$k */
    public class ViewTreeObserverOnGlobalLayoutListenerC8866k implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC8866k() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m53570b(View view) {
            if (uqb0.f180396b0.f170326c != null) {
                i4g0.m138523u("e_live_video_quickchat_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("anchorId", ProfileListFrag.this.f34642m3), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"));
                ProfileListFrag.this.f34629j3 = true;
                uqb0.f180396b0.f170326c.mo68472uq(ProfileListFrag.this.act(), ProfileListFrag.this.f34642m3, "profile");
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if ((!bnl0.m105529O0(ProfileListFrag.this.f34632k1) && !bnl0.m105529O0(ProfileListFrag.this.f34603d1) && !bnl0.m105529O0(ProfileListFrag.this.f34562U0) && !bnl0.m105529O0(ProfileListFrag.this.f34542Q0)) || bnl0.m105529O0(ProfileListFrag.this.f34615g1)) {
                bnl0.m105524M(ProfileListFrag.this.f34562U0, true);
                return;
            }
            boolean zM105529O0 = bnl0.m105529O0(ProfileListFrag.this.f34562U0);
            ProfileListFrag profileListFrag = ProfileListFrag.this;
            if (!zM105529O0) {
                bnl0.m105524M(profileListFrag.f34632k1, false);
                bnl0.m105524M(ProfileListFrag.this.f34603d1, false);
                bnl0.m105524M(ProfileListFrag.this.f34542Q0, false);
                bnl0.m105524M(ProfileListFrag.this.f34632k1, false);
                bnl0.m105524M(ProfileListFrag.this.f34562U0, true);
                return;
            }
            View view = profileListFrag.f34575W3;
            ProfileListFrag profileListFrag2 = ProfileListFrag.this;
            if (view == null) {
                profileListFrag2.f34575W3 = p9r.m171370a(profileListFrag2.getContext()).inflate(kec0.f125850gb, (ViewGroup) null);
                ProfileListFrag.this.f34575W3.setOnClickListener(new View.OnClickListener() { // from class: l.pda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f151726a.m53570b(view2);
                    }
                });
            } else if (profileListFrag2.f34575W3.getParent() != null && ProfileListFrag.this.f34575W3.getParent() == ProfileListFrag.this.f34580X3) {
                return;
            } else {
                bnl0.m105574p0(ProfileListFrag.this.f34575W3);
            }
            ProfileListFrag profileListFrag3 = ProfileListFrag.this;
            if (profileListFrag3.f34460A1 == null) {
                profileListFrag3.m53518t9();
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ProfileListFrag.this.f34460A1.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.bottomMargin = qa00.f156317d;
            int i = qa00.f156322i;
            layoutParams.leftMargin = -i;
            layoutParams.rightMargin = -i;
            bnl0.m105524M(ProfileListFrag.this.f34460A1, false);
            bnl0.m105524M(ProfileListFrag.this.f34581Y, false);
            bnl0.m105524M(ProfileListFrag.this.f34619h1, false);
            ((ViewGroup) ProfileListFrag.this.f34460A1.getParent()).addView(ProfileListFrag.this.f34575W3, layoutParams);
            i4g0.m138492A("e_live_video_quickchat_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("anchorId", ProfileListFrag.this.f34642m3), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"));
            ProfileListFrag profileListFrag4 = ProfileListFrag.this;
            profileListFrag4.f34580X3 = (View) profileListFrag4.f34575W3.getParent();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag$l */
    public class C8867l extends RecyclerView.AbstractC0578n {
        public C8867l() {
        }

        /* JADX INFO: renamed from: f */
        public final int m53571f(View view) {
            view.measure(View.MeasureSpec.makeMeasureSpec(ProfileListFrag.this.f34566V.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            return view.getMeasuredHeight();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.C0561a0 c0561a0) {
            super.onDrawOver(canvas, recyclerView, c0561a0);
            int iMax = 0;
            View childAt = recyclerView.getChildAt(0);
            if (childAt == null) {
                return;
            }
            int layoutPosition = recyclerView.getChildViewHolder(childAt).getLayoutPosition();
            for (int i = layoutPosition; i >= 0; i--) {
                if (ProfileListFrag.this.f34625i3.m174850L(i)) {
                    int i2 = layoutPosition + 1;
                    if (i2 < ProfileListFrag.this.f34625i3.getItemCount() && ProfileListFrag.this.f34625i3.m174850L(i2)) {
                        iMax = Math.max(ProfileListFrag.this.f34596b2.getDecoratedTop(recyclerView.getChildAt(1)), 0);
                    }
                    q1a0 q1a0Var = ProfileListFrag.this.f34625i3;
                    RecyclerView.AbstractC0569e0 abstractC0569e0CreateViewHolder = q1a0Var.createViewHolder(recyclerView, q1a0Var.getItemViewType(i));
                    ProfileListFrag.this.f34625i3.bindViewHolder(abstractC0569e0CreateViewHolder, i);
                    int iM53571f = m53571f(abstractC0569e0CreateViewHolder.itemView);
                    canvas.save();
                    if (iMax < abstractC0569e0CreateViewHolder.itemView.getMeasuredHeight() && iMax > 0) {
                        canvas.translate(0.0f, iMax - iM53571f);
                    }
                    abstractC0569e0CreateViewHolder.itemView.draw(canvas);
                    canvas.restore();
                    return;
                }
            }
        }
    }

    public ProfileListFrag() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.y7a0
            @Override // p153l.y20
            public final void call(Object obj) {
                PerformanceLogUtil.logSingle(((C4470c) obj).f16276c);
            }
        }));
        this.f34585Y3 = new ViewTreeObserverOnGlobalLayoutListenerC8866k();
        this.f34594a4 = false;
        this.f34606d4 = C22507a.m222758b();
        this.f34610e4 = false;
        this.f34614f4 = true;
        this.f34618g4 = 0;
        this.f34622h4 = new C8858c();
        this.f34626i4 = "";
        this.f34630j4 = new ArrayList();
        this.f34635k4 = new gne(this, this);
        this.f34639l4 = new hva0(this, this);
        this.f34643m4 = new hme(this, this);
        this.f34647n4 = new koe(this, this);
        this.f34651o4 = new xle(this, this);
        this.f34656p4 = new xne(this, this);
        this.f34660q4 = new ppe(this, this);
        this.f34664r4 = new goe(this, this);
        this.f34668s4 = new kpe(this, this);
        this.f34672t4 = new C8861f(this, this);
        this.f34676u4 = new nme(this, this);
        this.f34680v4 = new gya0(this, this);
        this.f34684w4 = new jva0(this, this);
        this.f34688x4 = new b43(this, this);
        this.f34692y4 = false;
        this.f34697z4 = -1;
        this.f34463A4 = false;
        this.f34468B4 = false;
        this.f34473C4 = new lza0(this);
        this.f34478D4 = new C8863h();
        this.f34484E4 = new HashMap<>();
        creates(new y20() { // from class: l.j8a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118765a.m53481nc((Bundle) obj);
            }
        });
        this.f34490F4 = new HashSet();
    }

    /* JADX INFO: renamed from: A9 */
    private void m53014A9() {
        if (this.f34646n3) {
            duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.eaa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f92748a.m53330Pb((User) obj);
                }
            }));
        } else {
            if (zbj.m219194a(this.f34671t3)) {
                duringCreated(C22421c.just(uxj0.f181467a)).subscribe(psd0.m173596G(new y20() { // from class: l.paa0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f151253a.m53338Qb((uxj0) obj);
                    }
                }));
            }
            duringCreated(new pcj() { // from class: l.aba0
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f69218a.m53345Rb();
                }
            }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.lba0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f130795a.m53352Sb((pf60) obj);
                }
            }));
            if (CoreModule.m30932N().mo61451Co()) {
                duringCreated(CoreModule.f18264c.f20420r0.m35153v5()).filter(new qcj() { // from class: l.wba0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f188222a.m53358Tb((pf60) obj);
                    }
                }).map(new qcj() { // from class: l.hca0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ProfileListFrag.m53224y5((pf60) obj);
                    }
                }).subscribe(psd0.m173596G(new y20() { // from class: l.sca0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f167206a.m53375Vb((RelationshipStatus) obj);
                    }
                }));
            }
            if (!m53479na()) {
                m53392Y8();
            }
        }
        duringCreated(CoreModule.m30934Q().mo68440ao(userId())).subscribe(psd0.m173597H(new y20() { // from class: l.dda0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87869a.m53382Wb((Boolean) obj);
            }
        }, new y20() { // from class: l.oda0
            @Override // p153l.y20
            public final void call(Object obj) {
                fhw.m125605a("intl_profile_guild", ((Throwable) obj).toString());
            }
        }));
    }

    /* JADX INFO: renamed from: B5 */
    public static /* synthetic */ void m53015B5() {
        try {
            f34458I4 = CategorySuggestions.JSON_ADAPTER.parse(CoreModule.f18263b.getResources().openRawResource(xfc0.f194022a));
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: Bd */
    private void m53018Bd(List<Media> list) {
        m53248Cd(list, false);
    }

    /* JADX INFO: renamed from: C6 */
    public static /* synthetic */ boolean m53020C6(View view, View view2, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            view.animate().scaleX(0.875f).scaleY(0.875f).setDuration(100L).start();
            return false;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        return false;
    }

    @MainThread
    /* JADX INFO: renamed from: C8 */
    private void m53022C8() {
        if (this.f34610e4) {
            this.f34637l2 = true;
            return;
        }
        this.f34692y4 = true;
        bnl0.m105524M(this.f34496H, this.f34466B2.mo53912l());
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.AFTER_GET_USER_INFO;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        if (!this.f34646n3) {
            m53522td();
        }
        m53227yd();
        if (mo52302m0()) {
            if (NullChecker.m82486a(aw90.m100562F().f73701a) && this.f34489F3) {
                User user = aw90.m100562F().f73701a;
                if (!TEnum.equals(this.f34628j2.profile.zodiac, user.profile.zodiac)) {
                    user.profile.zodiac = this.f34628j2.profile.zodiac;
                }
                aw90.m100562F().f73701a = this.f34628j2.mo225055clone();
                aw90.m100562F().f73701a.description = user.description;
                aw90.m100562F().f73701a.pictures = user.pictures;
                aw90.m100562F().f73701a.profile = user.profile;
                aw90.m100562F().f73701a.voice = user.voice;
                aw90.m100562F().f73701a.profile.extensions.physical.bloodType = this.f34628j2.profile.extensions.physical.bloodType;
                aw90.m100562F().f73701a.profile.extensions.interest.emoji = this.f34628j2.profile.extensions.interest.emoji;
            } else {
                this.f34489F3 = true;
                aw90.m100562F().f73701a = this.f34628j2.mo225055clone();
            }
            m53253Dd(aw90.m100562F().f73701a);
            if (gra.m131756u2()) {
                m53261F8();
            }
            m53267G8();
        } else {
            if (("home_card".equals(this.f34671t3) || "home_moment_theme_card".equals(this.f34671t3) || "liked_users".equals(this.f34671t3) || m53350S9() || m53430ea() || m53400Z9() || m53393Y9() || m53424da() || m53418ca() || m53380W9()) && mo53333Q()) {
                m53332Pd(mo52252K2(), false);
            }
            if ("home_card".equals(this.f34671t3) && fcp.m125033y()) {
                m53304Ld(this.f34628j2);
            }
        }
        this.f34491G.setVisibility(4);
        this.f34566V.setVisibility(0);
        if (!mo52302m0()) {
            this.f34496H.setVisibility(0);
        }
        m53561zd();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        if (this.f34697z4 == -1) {
            this.f34697z4 = CoreModule.f18264c.f20381e0.m116600p9().isVIP() ? 1 : 0;
        }
        if (!this.f34650o3 && this.f34697z4 == 0 && CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
            C8862g c8862g = new C8862g(act());
            c8862g.setTargetPosition(0);
            this.f34466B2.m53970G1();
            this.f34618g4 = 0;
            this.f34571W.setTranslationY(0.0f);
            this.f34566V.getLayoutManager().startSmoothScroll(c8862g);
            m53467l9();
            this.f34697z4 = 1;
        }
    }

    /* JADX INFO: renamed from: D8 */
    public static ProfileListFrag m53026D8(String str, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
        qu90 qu90Var = new qu90();
        qu90Var.f159534a = str;
        qu90Var.f159535b = z;
        qu90Var.f159536c = z2;
        qu90Var.f159538e = str2;
        qu90Var.f159539f = z3;
        qu90Var.f159540g = RelationshipStatus.get("unknown_");
        qu90Var.f159541h = 273;
        qu90Var.f159542i = false;
        qu90Var.f159543j = true;
        qu90Var.f159544k = false;
        qu90Var.f159545l = z4;
        qu90Var.f159546m = -1;
        return m53030E8(qu90Var);
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ Boolean m53027E5() {
        PerformanceLogUtil.logEnd(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        PerformanceLogUtil.instance().endTrance();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: E8 */
    public static ProfileListFrag m53030E8(qu90 qu90Var) {
        ProfileListFrag profileListFrag = new ProfileListFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", qu90Var.f159534a);
        bundle.putBoolean("is_edit", qu90Var.f159536c);
        bundle.putString("input_type", qu90Var.f159537d);
        bundle.putBoolean("show_buttons", qu90Var.f159535b);
        bundle.putBoolean("canShowFollowButton", qu90Var.f159545l);
        bundle.putBoolean("no_showbuttons_infofromlocal", qu90Var.f159543j);
        bundle.putString("from", qu90Var.f159538e);
        bundle.putBoolean("open_media_picker", qu90Var.f159539f);
        bundle.putString("relationship_status", qu90Var.f159540g.toString());
        bundle.putInt("button_flag", qu90Var.f159541h);
        bundle.putBoolean("with_superlike", qu90Var.f159542i);
        bundle.putBoolean("from_gp_live", qu90Var.f159544k);
        bundle.putInt("pic_index", qu90Var.f159546m);
        bundle.putInt("pushReason", qu90Var.f159548o);
        bundle.putString("pushTag", qu90Var.f159549p);
        bundle.putSerializable("city_centre_data", qu90Var.f159550q);
        profileListFrag.setArguments(bundle);
        return profileListFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Ea */
    public /* synthetic */ void m53031Ea() {
        m21580b4().m21503F(this.f34642m3).m21567z0();
    }

    /* JADX INFO: renamed from: F5 */
    public static /* synthetic */ void m53032F5(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Fa */
    public /* synthetic */ void m53035Fa() {
        if (NullChecker.m82486a(mo52252K2())) {
            DebugUtil.m59358Ak(mo52252K2(), act());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Ga */
    public /* synthetic */ void m53039Ga() {
        User user = this.f34628j2;
        if (user == null || user == this.f34633k2) {
            return;
        }
        for (int i = 0; i < 10; i++) {
            Contact contactNew_ = Contact.new_();
            contactNew_.name = "张三 " + i;
            this.f34628j2.profile.contactLookups.lookups.add(contactNew_);
        }
        m53040Gd(this.f34628j2);
    }

    /* JADX INFO: renamed from: Gd */
    private void m53040Gd(User user) {
        aw90.m100562F().f73701a = user;
        m53022C8();
    }

    /* JADX INFO: renamed from: J5 */
    public static /* synthetic */ void m53047J5(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: L9 */
    private boolean m53056L9() {
        if ("from_portrait_like_list".equals(this.f34671t3)) {
            return true;
        }
        if (gra.m131637V1()) {
            return "chat_group".equals(this.f34671t3) || "chat_group_anonymity".equals(this.f34671t3) || "group_notification".equals(this.f34671t3) || "group_notification_anonymity".equals(this.f34671t3);
        }
        return false;
    }

    /* JADX INFO: renamed from: N9 */
    public static boolean m53064N9(User user) {
        return NullChecker.m82486a(user.localFollowship) && TEnum.equals(user.localFollowship.state, "matched");
    }

    /* JADX INFO: renamed from: Nd */
    private void m53065Nd(User user) {
        this.f34633k2 = user;
    }

    /* JADX INFO: renamed from: P5 */
    public static /* synthetic */ Boolean m53071P5(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: R8 */
    private String m53082R8(User user) {
        CharSequence charSequenceM175784P = (CoreModule.f18264c.f20303E0.m141060B3(user) || User.isTeamAccount(user.f56859id) || user.f56859id.equals(CoreModule.m30929H().userId())) ? "" : q8g0.m175784P(user.location, false, null, q8g0.m175813r(user.location, true, false));
        if (!TextUtils.isEmpty(charSequenceM175784P)) {
            return charSequenceM175784P.toString();
        }
        if (user.location.isHideInfo() && user.location.isHideDistance()) {
            return "";
        }
        int i = user.location.distance;
        if (i < 1000) {
            return Constants.DEFAULT_UIN;
        }
        return i < 10000 ? String.valueOf((i / 1000) * 1000) : String.valueOf((i / 10000) * 10000);
    }

    /* JADX INFO: renamed from: Rd */
    private void m53083Rd(User user) {
        User userRiskAuditUser;
        if (user == null) {
            userRiskAuditUser = null;
        } else {
            userRiskAuditUser = user.riskAuditUser(CoreModule.m30930K().getUserById("fake_risk_audit_default_" + this.f34642m3));
        }
        this.f34628j2 = userRiskAuditUser;
    }

    /* JADX INFO: renamed from: V6 */
    public static /* synthetic */ void m53098V6(Throwable th) {
    }

    /* JADX INFO: renamed from: W8 */
    private List<on2<?>> m53104W8(List<on2<?>> list) {
        ArrayList arrayList = new ArrayList();
        if (this.f34650o3) {
            for (on2<?> on2Var : list) {
                if (on2Var.mo53912l()) {
                    arrayList.add(on2Var);
                    if (on2Var.mo53568k()) {
                        arrayList.add(this.f34461A2);
                    }
                }
            }
        } else {
            on2<?> on2Var2 = null;
            int i = 0;
            for (on2<?> on2Var3 : list) {
                if (on2Var3.mo53912l()) {
                    if (on2Var3.mo53568k() && (i = i + 1) > 1) {
                        if (!NullChecker.m82486a(on2Var2)) {
                            arrayList.add(this.f34690y2);
                        } else if (on2Var2 instanceof cza0) {
                            hr90 hr90Var = new hr90(this, this);
                            this.f34695z2 = hr90Var;
                            hr90Var.m168324v(qa00.m175859d(4.0f));
                            arrayList.add(this.f34695z2);
                        } else if (on2Var2 instanceof jz90) {
                            hr90 hr90Var2 = new hr90(this, this);
                            this.f34695z2 = hr90Var2;
                            hr90Var2.m168324v(qa00.m175859d(9.0f));
                            arrayList.add(this.f34695z2);
                        } else if (on2Var2 instanceof fy90) {
                            hr90 hr90Var3 = new hr90(this, this);
                            this.f34695z2 = hr90Var3;
                            hr90Var3.m168324v(qa00.m175859d(16.0f));
                            arrayList.add(this.f34695z2);
                        } else if (on2Var2 instanceof y1b0) {
                            hr90 hr90Var4 = new hr90(this, this);
                            this.f34695z2 = hr90Var4;
                            hr90Var4.m168324v(qa00.m175859d(9.0f));
                            arrayList.add(this.f34695z2);
                        } else if (on2Var2 instanceof oz90) {
                            hr90 hr90Var5 = new hr90(this, this);
                            this.f34695z2 = hr90Var5;
                            hr90Var5.m168324v(qa00.m175859d(24.0f));
                            arrayList.add(this.f34695z2);
                        } else if (on2Var2 instanceof mz90) {
                            hr90 hr90Var6 = new hr90(this, this);
                            this.f34695z2 = hr90Var6;
                            hr90Var6.m168324v(qa00.m175859d(16.0f));
                            arrayList.add(this.f34695z2);
                        } else {
                            arrayList.add(this.f34690y2);
                        }
                    }
                    arrayList.add(on2Var3);
                    on2Var2 = on2Var3;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Z6 */
    public static /* synthetic */ void m53115Z6(Throwable th) {
    }

    /* JADX INFO: renamed from: Z8 */
    private String m53117Z8(String str) {
        String str2 = this.f34626i4;
        if (TextUtils.equals("share_profile", str)) {
            return "journey_new_share";
        }
        return TextUtils.equals("from_find_partner", str) ? "p_find_partner_mainpage" : str2;
    }

    /* JADX INFO: renamed from: a6 */
    public static /* synthetic */ void m53119a6() {
    }

    /* JADX INFO: renamed from: a8 */
    public static /* synthetic */ ProfileEditInfo m53121a8(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: ad */
    private void m53122ad() {
        bnl0.m105546b0(this.f34485F, new pcj() { // from class: l.u6a0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return ProfileListFrag.m53027E5();
            }
        });
    }

    /* JADX INFO: renamed from: bd */
    public static String m53127bd(String str) {
        return m53133cd(str, true);
    }

    /* JADX INFO: renamed from: be */
    private void m53128be() {
        if (CoreModule.f18264c.f20381e0.m116600p9().isJailedOrRestrict()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
        } else {
            if (CoreModule.m30932N().isPostingMoment()) {
                return;
            }
            CoreModule.m30932N().mo61482Nr(act(), jyb.m147507f0(new Media[0]), true, "other", luh.m155932d(), luh.m155933e(), null);
        }
    }

    /* JADX INFO: renamed from: cd */
    public static String m53133cd(String str, boolean z) {
        if (str.matches("[ ]+")) {
            if (z) {
                pza0.m174354f(OMSTemplateModeType.space);
            }
            return OMSTemplateModeType.space;
        }
        if (str.matches("\\d+")) {
            if (z) {
                pza0.m174354f("number");
            }
            return "number";
        }
        if (str.matches("[\\p{P}+`]+")) {
            if (z) {
                pza0.m174354f("symbol");
            }
            return "symbol";
        }
        if (!str.matches("[\\p{P}\\d+`]+")) {
            return "";
        }
        if (z) {
            pza0.m174354f("number_symbol");
        }
        return "number_symbol";
    }

    /* JADX INFO: renamed from: d8 */
    public static /* synthetic */ void m53137d8() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89317r2;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        CoreModule.f18264c.f20381e0.f89310q2.put(bool);
    }

    /* JADX INFO: renamed from: de */
    private void m53138de(int i, String str, MediaReorderCards mediaReorderCards) {
        if (i == 6) {
            mediaReorderCards.m51994h(5).m51855S1(null);
            return;
        }
        mediaReorderCards.m51994h(i).m51855S1(str);
        if (i < 5) {
            mediaReorderCards.m51994h(i + 1).m51855S1(null);
        }
        if (i > 0) {
            mediaReorderCards.m51994h(i - 1).m51855S1(null);
        }
    }

    /* JADX INFO: renamed from: f8 */
    public static /* synthetic */ void m53146f8(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: j5 */
    public static /* synthetic */ void m53159j5(Throwable th) {
    }

    /* JADX INFO: renamed from: la */
    public static boolean m53171la(User user) {
        if (NullChecker.m82486a(user.localRelationship)) {
            return TEnum.equals(user.localRelationship.state, "liked") || TEnum.equals(user.localRelationship.state, "lettered") || TEnum.equals(user.localRelationship.state, "matched");
        }
        return false;
    }

    /* JADX INFO: renamed from: m7 */
    public static /* synthetic */ void m53174m7() {
    }

    /* JADX INFO: renamed from: n7 */
    public static /* synthetic */ void m53178n7(Throwable th) {
        CoreModule.f18264c.f20384f0.f20629P1 = null;
        if (TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            r1j0.m179419f(R$string.f18634L7);
        }
    }

    /* JADX INFO: renamed from: n9 */
    private void m53180n9() {
        if (mo52302m0()) {
            m53461k9();
        } else if (!this.f34646n3 && NullChecker.m82486a(mo52252K2()) && mo52252K2().unilateralBlock()) {
            m53262F9();
        } else {
            m53512s9();
        }
    }

    /* JADX INFO: renamed from: o5 */
    public static /* synthetic */ void m53181o5(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: p9 */
    private void m53189p9() {
        if (!this.f34646n3 || this.f34650o3) {
            return;
        }
        duringCreated(new pcj() { // from class: l.gaa0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f102971a.m53508rb();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.haa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108484a.m53514sb((bkj0) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: rd */
    public void m53198rd() {
        no90 no90Var = this.f34476D2;
        if (no90Var.f142965v == null || !no90Var.m168323u().isAttachedToWindow()) {
            if (this.f34596b2.findFirstCompletelyVisibleItemPosition() > 2) {
                this.f34657q1.m54132g(1.0f);
                return;
            }
            return;
        }
        int[] iArr = new int[2];
        this.f34657q1.getLocationInWindow(iArr);
        float height = iArr[1] + this.f34657q1.getHeight();
        int[] iArr2 = new int[2];
        this.f34476D2.f142965v.getLocationInWindow(iArr2);
        float height2 = (height - iArr2[1]) / this.f34476D2.f142965v.getHeight();
        this.f34657q1.m54132g(height2);
        double d = height2;
        View view = this.f34661r1;
        if (d < 0.1d) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: s5 */
    public static /* synthetic */ void m53199s5(Throwable th) {
    }

    /* JADX INFO: renamed from: v5 */
    public static /* synthetic */ Boolean m53211v5(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: w5 */
    public static /* synthetic */ void m53215w5(Throwable th) {
    }

    /* JADX INFO: renamed from: w9 */
    private void m53219w9() {
        this.f34596b2 = new SmoothScrollLinearLayoutManager(getContext());
        this.f34566V.setItemAnimator(null);
        this.f34566V.setLayoutManager(this.f34596b2);
        this.f34566V.setAdapter(this.f34625i3);
        this.f34566V.addOnScrollListener(this.f34622h4);
        if (m53488oa() && !this.f34650o3) {
            this.f34566V.post(new Runnable() { // from class: l.ada0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69800a.m53539wb();
                }
            });
        }
        if (this.f34650o3) {
            this.f34566V.addItemDecoration(new C8867l());
        }
    }

    /* JADX INFO: renamed from: x9 */
    private void m53223x9() {
        ml70.m158856b().m158859e(Boolean.FALSE);
        boolean z = this.f34650o3;
        VNavigationBar vNavigationBar = this.f34459A;
        if (z) {
            bnl0.m105524M(vNavigationBar, true);
            View viewInflate = act().inflater().inflate(kec0.f125458I9, (ViewGroup) null);
            VButton vButton = (VButton) viewInflate.findViewById(adc0.f70484o4);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.gda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f103640a.m53246Cb(view);
                }
            };
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.hda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f108814a.m53251Db(view);
                }
            };
            bnl0.m105509E0(vButton, onClickListener);
            this.f34459A.setLeftIconOnClick(onClickListener2);
            this.f34459A.m224835z(viewInflate);
            this.f34459A.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ida0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f114496a.m53257Eb(view);
                }
            });
            return;
        }
        bnl0.m105524M(vNavigationBar, false);
        if (m53479na() && m53427dd()) {
            m53518t9();
            this.f34682w2 = true;
            bnl0.m105524M(this.f34542Q0, false);
        } else {
            m53552y9();
        }
        if (TextUtils.equals(this.f34671t3, "impress_signal") || m53380W9() || TextUtils.equals(this.f34671t3, "from_pin_like") || m53387X9()) {
            bnl0.m105524M(this.f34599c1, false);
            bnl0.m105524M(this.f34603d1, false);
            bnl0.m105524M(this.f34619h1, false);
            bnl0.m105524M(this.f34542Q0, false);
            bnl0.m105524M(this.f34562U0, false);
            bnl0.m105524M(this.f34576X, false);
        }
        m53557z9();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y5 */
    public static /* synthetic */ RelationshipStatus m53224y5(pf60 pf60Var) {
        return (RelationshipStatus) pf60Var.f152157b;
    }

    /* JADX INFO: renamed from: yd */
    private void m53227yd() {
        new ArrayList();
        this.f34625i3.m174851M(m53104W8(this.f34630j4));
        m53525u9();
    }

    /* JADX INFO: renamed from: z6 */
    public static /* synthetic */ void m53229z6(Throwable th) {
    }

    /* JADX INFO: renamed from: A8 */
    public void m53231A8(View view) {
        m53238B8(view, view);
    }

    /* JADX INFO: renamed from: Aa */
    public final /* synthetic */ void m53232Aa() {
        ViewGroup.LayoutParams layoutParams = this.f34688x4.m168323u().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = qa00.m175859d(164.0f);
            this.f34688x4.m168323u().setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: Ab */
    public final /* synthetic */ void m53233Ab(Detect detect) {
        if (!NullChecker.m82486a(detect) || jyb.m147479J(detect.text)) {
            mo52306o();
            return;
        }
        j6p j6pVar = new j6p(act());
        j6pVar.m143689K(new y20() { // from class: l.t9a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172619a.m53559zb((uxj0) obj);
            }
        });
        j6pVar.show();
    }

    /* JADX INFO: renamed from: Ac */
    public final /* synthetic */ void m53234Ac() {
        this.f34478D4.call();
    }

    /* JADX INFO: renamed from: Ad */
    public void m53235Ad(boolean z) {
        if (m53281I9() || m53380W9()) {
            return;
        }
        if (s75.m184965m() || wj90.m206622e(mo52252K2())) {
            if (TextUtils.equals("from_city_center_boost_cover", this.f34671t3)) {
                bnl0.m105524M(this.f34562U0, false);
                bnl0.m105524M(this.f34599c1, false);
                return;
            }
            if (TextUtils.equals("from_city_center_conv_banner", this.f34671t3) && !TextUtils.equals(this.f34642m3, CoreModule.m30929H().userId())) {
                bnl0.m105524M(this.f34562U0, false);
                bnl0.m105524M(this.f34599c1, false);
                bnl0.m105524M(this.f34587Z0, true);
                boolean zEquals = TextUtils.equals(CoreModule.f18264c.f20420r0.f20780s0.m222761e(), this.f34642m3);
                TextView textView = this.f34595b1;
                if (zEquals) {
                    textView.setText("招呼已发送");
                    this.f34595b1.setEnabled(false);
                    return;
                } else {
                    textView.setText("发送招呼");
                    this.f34595b1.setEnabled(true);
                    bnl0.m105509E0(this.f34595b1, new View.OnClickListener() { // from class: l.v6a0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f182626a.m53560zc(view);
                        }
                    });
                    return;
                }
            }
        }
        bnl0.m105524M(this.f34619h1, false);
        bnl0.m105524M(this.f34603d1, false);
        if (TextUtils.equals(this.f34671t3, "from_portrait_like_list")) {
            bnl0.m105524M(this.f34636l1, false);
            bnl0.m105524M(this.f34640m1, false);
        }
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(this.f34642m3);
        if (NullChecker.m82486a(conversationM33859Xe) && !TEnum.equals(conversationM33859Xe.status, "dismissed")) {
            if (TextUtils.equals(this.f34671t3, "from_portrait_like_list")) {
                bnl0.m105524M(this.f34603d1, true);
                m53231A8(this.f34603d1);
            }
            bnl0.m105505C0(this.f34576X, bnl0.m105529O0(this.f34599c1) ? qa00.m175859d(164.0f) : qa00.m175859d(126.0f));
            bnl0.m105524M(this.f34576X, true);
        } else if (NullChecker.m82486a(this.f34602c4) && m53456ja()) {
            if (TextUtils.equals(this.f34671t3, "from_portrait_like_list")) {
                bnl0.m105537U(this.f34632k1, qa00.m175859d(10.0f));
                bnl0.m105524M(this.f34636l1, true);
                bnl0.m105524M(this.f34640m1, true);
            } else {
                boolean zM53474ma = m53474ma();
                VLinear vLinear = this.f34677v1;
                if (zM53474ma) {
                    bnl0.m105524M(vLinear, true);
                    m53312Md(true);
                } else {
                    if (NullChecker.m82486a(vLinear)) {
                        bnl0.m105524M(this.f34677v1, false);
                    }
                    bnl0.m105524M(this.f34619h1, true);
                    m53231A8(this.f34619h1);
                    m53312Md(false);
                }
            }
            bnl0.m105505C0(this.f34576X, bnl0.m105529O0(this.f34599c1) ? qa00.m175859d(164.0f) : qa00.m175859d(126.0f));
            bnl0.m105524M(this.f34576X, true);
        }
        if (TextUtils.equals(this.f34671t3, "from_portrait_like_list")) {
            if (z) {
                l51.m152888H(act(), new Runnable() { // from class: l.w6a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f187600a.m53234Ac();
                    }
                }, 850L);
            } else {
                this.f34478D4.call();
            }
        }
        if (!bnl0.m105529O0(this.f34599c1) && !bnl0.m105529O0(this.f34619h1) && !bnl0.m105529O0(this.f34603d1) && !bnl0.m105529O0(this.f34632k1)) {
            bnl0.m105524M(this.f34576X, false);
        }
        this.f34688x4.mo168208a(new x20() { // from class: l.x6a0
            @Override // p153l.x20
            public final void call() {
                this.f192565a.m53242Bc();
            }
        });
        m53487o9();
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: B1 */
    public List<View> mo53236B1() {
        return jyb.m147507f0(this.f34566V);
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: B2 */
    public View mo53237B2() {
        return this.f34567V0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: B8 */
    public void m53238B8(View view, final View view2) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: l.n8a0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                return ProfileListFrag.m53020C6(view2, view3, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: B9 */
    public final void m53239B9() {
        m53556z8();
        m53332Pd(null, false);
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(this.f34642m3);
        if (NullChecker.m82486a(this.f34628j2)) {
            if (lik0.m154376b(this.f34628j2)) {
                l51.m152888H(act(), new Runnable() { // from class: l.wca0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f188401a.m53389Xb();
                    }
                }, 1000L);
            }
            if (User.isMatched(this.f34628j2) || (NullChecker.m82486a(conversationM33859Xe) && TEnum.equals(conversationM33859Xe.status, "default"))) {
                if (NullChecker.m82486a(this.f34581Y)) {
                    bnl0.m105524M(this.f34581Y, false);
                    bnl0.m105524M(this.f34562U0, false);
                }
                if (NullChecker.m82486a(this.f34599c1)) {
                    bnl0.m105524M(this.f34599c1, false);
                }
                if (NullChecker.m82486a(this.f34576X)) {
                    bnl0.m105524M(this.f34576X, false);
                }
            }
        }
        m53546xd();
    }

    /* JADX INFO: renamed from: Ba */
    public final /* synthetic */ void m53240Ba(View view) {
        this.f34480E0.callOnClick();
    }

    /* JADX INFO: renamed from: Bb */
    public final /* synthetic */ void m53241Bb(Throwable th) {
        mo52306o();
    }

    /* JADX INFO: renamed from: Bc */
    public final /* synthetic */ void m53242Bc() {
        ViewGroup.LayoutParams layoutParams = this.f34688x4.m168323u().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = qa00.m175859d(bnl0.m105529O0(this.f34576X) ? 164.0f : 0.0f);
            this.f34688x4.m168323u().setLayoutParams(layoutParams);
        }
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: C2 */
    public CategorySuggestions mo52233C2() {
        return f34458I4;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: C3 */
    public View mo53243C3() {
        return this.f34466B2.m53980M0();
    }

    /* JADX INFO: renamed from: C9 */
    public final void m53244C9() {
        if (!d79.m114706w() || mo52258P1()) {
            return;
        }
        if (NullChecker.m82486a(CoreModule.f18264c.f20428t2.f198578R) && CoreModule.f18264c.f20428t2.f198578R.get().booleanValue()) {
            duringCreated(C22421c.just(uxj0.f181467a)).subscribe(psd0.m173596G(new y20() { // from class: l.z7a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f203230a.m53395Yb((uxj0) obj);
                }
            }));
        } else {
            duringCreated(CoreModule.f18264c.f20428t2.m215197k3(userId(), "profile", "user,description")).subscribe(psd0.m173597H(new y20() { // from class: l.a8a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f68892a.m53402Zb((CoreData) obj);
                }
            }, new y20() { // from class: l.b8a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ProfileListFrag.m53229z6((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Cb */
    public final /* synthetic */ void m53246Cb(View view) {
        pza0.m174356h("button");
        final String strM122525c = eu4.m122523b().m122525c(this.f34628j2, aw90.m100562F().f73701a);
        if (eu4.m122523b().m122531i(strM122525c)) {
            act().duringCreated(CoreModule.f18264c.f20353U1.m125490i3("profile", strM122525c)).subscribe(psd0.m173597H(new y20() { // from class: l.y8a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f197959a.m53544xb(strM122525c, (List) obj);
                }
            }, new y20() { // from class: l.z8a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f203331a.m53554yb((Throwable) obj);
                }
            }));
            return;
        }
        if (d79.m114703t() && NullChecker.m82486a(m189086i2())) {
            String strM147516k = jyb.m147516k(m189086i2().description);
            if (!TextUtils.equals(strM147516k, this.f34633k2.description) && !TextUtils.isEmpty(strM147516k.trim())) {
                DetectRequest detectRequestNew_ = DetectRequest.new_();
                detectRequestNew_.category = DetectCategoryType.get(DetectCategoryType.contact_information);
                ArrayList arrayList = new ArrayList();
                DetectText detectTextNew_ = DetectText.new_();
                detectTextNew_.key = "aboutMe";
                detectTextNew_.value = strM147516k;
                arrayList.add(detectTextNew_);
                detectRequestNew_.text = arrayList;
                act().duringCreated(yb5.m214988Q(detectRequestNew_)).subscribe(psd0.m173597H(new y20() { // from class: l.a9a0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f69007a.m53233Ab((Detect) obj);
                    }
                }, new y20() { // from class: l.b9a0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f75529a.m53241Bb((Throwable) obj);
                    }
                }));
                return;
            }
        }
        mo52306o();
    }

    /* JADX INFO: renamed from: Cc */
    public final /* synthetic */ void m53247Cc(Media media, Boolean bool, Boolean bool2) {
        mo52275Z2();
    }

    /* JADX INFO: renamed from: Cd */
    public final void m53248Cd(final List<Media> list, final boolean z) {
        this.f34635k4.mo168208a(new x20() { // from class: l.kaa0
            @Override // p153l.x20
            public final void call() {
                this.f124645a.m53252Dc(z, list);
            }
        });
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: D2 */
    public boolean mo52236D2() {
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: D9 */
    public final void m53249D9() {
        int i;
        int i2;
        int i3;
        if ("liked_users".equals(this.f34671t3) || "intl_top_picks".equals(this.f34671t3) || m53350S9()) {
            LikeUser likeUserM180098m = CoreModule.f18264c.f20370a1.m180098m(this.f34642m3);
            if (likeUserM180098m == null && NullChecker.m82486a(this.f34495G3)) {
                likeUserM180098m = this.f34500H3;
            }
            if (NullChecker.m82486a(likeUserM180098m) || "intl_top_picks".equals(this.f34671t3) || m53350S9()) {
                if (!this.f34666s2) {
                    this.f34486F0.setBackgroundResource(dbc0.f87637zb);
                    this.f34480E0.setBackgroundResource(dbc0.f87637zb);
                    VImage vImage = this.f34492G0;
                    if (d79.m114662U()) {
                        i = dbc0.f87605yb;
                    } else {
                        i = IntlCountryCodeController.m29125v() ? dbc0.f86020Bb : dbc0.f85988Ab;
                    }
                    vImage.setImageResource(i);
                    this.f34497H0.setTextColor(Color.parseColor("#FFDEA2"));
                    if ("liked_users".equals(this.f34671t3) || m53350S9()) {
                        bnl0.m105524M(this.f34532O0, false);
                        bnl0.m105524M(this.f34586Z, false);
                        return;
                    }
                    return;
                }
                VLinear vLinear = this.f34689y1;
                if (vLinear != null && this.f34694z1 != null) {
                    vLinear.setBackground(act().getResources().getDrawable(dbc0.f87637zb));
                    VImage vImage2 = this.f34694z1;
                    if (d79.m114662U()) {
                        i3 = dbc0.f87605yb;
                    } else {
                        i3 = IntlCountryCodeController.m29125v() ? dbc0.f86020Bb : dbc0.f85988Ab;
                    }
                    vImage2.setImageResource(i3);
                }
                this.f34486F0.setBackgroundResource(dbc0.f87637zb);
                this.f34480E0.setBackgroundResource(dbc0.f87637zb);
                VImage vImage3 = this.f34492G0;
                if (d79.m114662U()) {
                    i2 = dbc0.f87605yb;
                } else {
                    i2 = IntlCountryCodeController.m29125v() ? dbc0.f86020Bb : dbc0.f85988Ab;
                }
                vImage3.setImageResource(i2);
                this.f34497H0.setTextColor(Color.parseColor("#FFDEA2"));
                if ("liked_users".equals(this.f34671t3) || m53350S9()) {
                    m53280I8();
                }
            }
        }
    }

    /* JADX INFO: renamed from: Da */
    public final /* synthetic */ Boolean m53250Da(final String str, final String str2, Boolean bool, Boolean bool2) {
        if (!bool2.booleanValue() || CoreModule.f18264c.f20405m0.f20196u0.get().booleanValue() || !NullChecker.m82486a(CoreModule.f18264c.m32487o3()) || rbb0.m180747t() || !TextUtils.isEmpty(str)) {
            return Boolean.FALSE;
        }
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20196u0;
        Boolean bool3 = Boolean.TRUE;
        jxd0Var.put(bool3);
        hl3.m135664G(act(), true, this.f34602c4.name, CoreModule.f18264c.m32487o3().superLikeLimit.remainToday() + "", TEnum.equals(this.f34602c4.gender, "male"), new Runnable() { // from class: l.p9a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f151123a.m53245Ca(str, str2);
            }
        }, new Runnable() { // from class: l.r9a0
            @Override // java.lang.Runnable
            public final void run() {
                ProfileListFrag.m53174m7();
            }
        });
        return bool3;
    }

    /* JADX INFO: renamed from: Db */
    public final /* synthetic */ void m53251Db(View view) {
        pza0.m174356h("button");
        m52256N6();
    }

    /* JADX INFO: renamed from: Dc */
    public final /* synthetic */ void m53252Dc(boolean z, List list) {
        MediaReorderCards mediaReorderCards = this.f34635k4.f105078v;
        mediaReorderCards.setCurPageId("p_edit_profile_view");
        int i = 0;
        while (true) {
            if (i >= 6) {
                break;
            }
            mediaReorderCards.m51994h(i).setIllegalPicture(z && i < list.size());
            mediaReorderCards.m51994h(i).m51823C1(i < list.size() ? (Media) list.get(i) : null);
            mediaReorderCards.m51994h(i).setChangeAction(new a30() { // from class: l.xca0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    this.f193285a.m53247Cc((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            if (gra.m131756u2()) {
                mediaReorderCards.m51994h(i).m51827E1(i, "p_edit_profile_view");
                if (!this.f34508J1.get().booleanValue() && i == list.size()) {
                    mediaReorderCards.m51994h(i).m51849P1();
                    this.f34508J1.put(Boolean.TRUE);
                }
            }
            mediaReorderCards.m51994h(i).m51834I0(i);
            i++;
        }
        int size = list.size();
        if (size < 6) {
            m53138de(size, null, mediaReorderCards);
        }
    }

    /* JADX INFO: renamed from: Dd */
    public final void m53253Dd(User user) {
        m53259Ed(user, false);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: E */
    public void mo52239E() {
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: E1 */
    public boolean mo53254E1() {
        return this.f34663r3;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: E2 */
    public pf60<Integer, Integer> mo53255E2() {
        return this.f34578X1;
    }

    /* JADX INFO: renamed from: E9 */
    public final void m53256E9() {
        if (m53479na()) {
            if (!m53427dd()) {
                this.f34599c1.setViewLayoutType(3);
            } else {
                this.f34666s2 = true;
                bnl0.m105524M(this.f34599c1, false);
            }
        }
    }

    /* JADX INFO: renamed from: Eb */
    public final /* synthetic */ void m53257Eb(View view) {
        m53482nd();
    }

    /* JADX INFO: renamed from: Ec */
    public final /* synthetic */ void m53258Ec() {
        no90 no90Var = this.f34476D2;
        if (no90Var instanceof ap90) {
            this.f34657q1.m54140o();
            this.f34473C4.m156414f(this.f34659q3, ((ap90) no90Var).f72707X, this.f34657q1.f35005k, this, this.f34642m3, this.f34671t3, m53494pa(this.f34628j2) && NullChecker.m82486a(this.f34466B2.f34861J), this.f34466B2.f34861J);
        }
    }

    /* JADX INFO: renamed from: Ed */
    public final void m53259Ed(User user, boolean z) {
        m53227yd();
        m53248Cd(user.pictures, z);
    }

    @Override // p153l.q3m
    @Nullable
    /* JADX INFO: renamed from: F */
    public View mo53260F() {
        return m53427dd() ? this.f34562U0 : this.f34599c1;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: F1 */
    public User mo52241F1(boolean z) {
        if (!NullChecker.m82486a(aw90.m100562F().f73701a)) {
            CrashHelper.m82479c(new NullPointerException("ProfileListFrag editingUser is null when refresh"));
            aw90.m100562F().f73701a = CoreModule.f18264c.f20381e0.m116600p9().mo225055clone();
        }
        return aw90.m100562F().f73701a;
    }

    /* JADX INFO: renamed from: F8 */
    public final void m53261F8() {
        if ((TextUtils.equals(this.f34671t3, CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) || TextUtils.equals(this.f34671t3, CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO) || TextUtils.equals(this.f34671t3, CoreStaticData.ProfileFromType.FROM_THIN_POPUP)) && !this.f34612f2) {
            byte b = 1;
            this.f34612f2 = true;
            if (!gra.m131756u2()) {
                LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD;
                if (jyb.m147479J(LoopFragmentFactory.m52688z(loopCreateEntryType, null, m189086i2()))) {
                    return;
                }
                LoopFragmentFactory.m52660U(m189086i2(), this, null, loopCreateEntryType, this.f34671t3);
                return;
            }
            LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType2 = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD;
            if (jyb.m147479J(LoopFragmentFactory.m52641B(loopCreateEntryType2, null, m189086i2(), true, true, this.f34671t3))) {
                return;
            }
            String str = this.f34671t3;
            str.getClass();
            switch (str.hashCode()) {
                case -338162810:
                    b = !str.equals(CoreStaticData.ProfileFromType.FROM_THIN_POPUP) ? (byte) -1 : (byte) 0;
                    break;
                case 182867647:
                    if (!str.equals(CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO)) {
                        b = -1;
                    }
                    break;
                case 1120730606:
                    b = !str.equals(CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    break;
                case 1:
                    loopCreateEntryType2 = LoopFragmentFactory.LoopCreateEntryType.ENTRY_PROFILE_UPLOAD_PHOTO;
                    break;
                case 2:
                    loopCreateEntryType2 = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD_UPLOAD_PHOTO;
                    break;
                default:
                    loopCreateEntryType2 = null;
                    break;
            }
            LoopFragmentFactory.m52660U(m189086i2(), this, null, loopCreateEntryType2, this.f34671t3);
        }
    }

    /* JADX INFO: renamed from: F9 */
    public final void m53262F9() {
        this.f34630j4.add(this.f34466B2);
        if (m53488oa()) {
            this.f34630j4.add(this.f34589Z2);
        }
        this.f34630j4.add(this.f34476D2);
        this.f34630j4.add(this.f34617g3);
        this.f34630j4.add(this.f34601c3);
        this.f34630j4.add(this.f34605d3);
        this.f34630j4.add(this.f34613f3);
        this.f34630j4.add(this.f34564U2);
        if (!User.ID_OFFICIAL_CHANNEL.equals(this.f34642m3) && !"from_guess_liker_result".equals(this.f34671t3)) {
            this.f34630j4.add(this.f34579X2);
        }
        if (!TextUtils.isEmpty(this.f34671t3) && (TextUtils.equals("home_card", this.f34671t3) || TextUtils.equals("share_profile", this.f34671t3) || TextUtils.equals("home_moment_theme_card", this.f34671t3))) {
            mo52258P1();
        }
        if (!mo52258P1()) {
            this.f34630j4.add(new b43(this, this));
        }
        this.f34630j4.add(this.f34688x4);
    }

    /* JADX INFO: renamed from: Fb */
    public final /* synthetic */ void m53263Fb() {
        ml70.m158856b().m158858d(act());
        startActivity(ProfileAct.m51922q2(act(), this.f34642m3, "profile_frag_menu", false, true));
    }

    /* JADX INFO: renamed from: Fc */
    public final /* synthetic */ void m53264Fc(int i) {
        this.f34569V2.m168207Y(i);
    }

    /* JADX INFO: renamed from: Fd */
    public final void m53265Fd() {
        creates(new y20() { // from class: l.maa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135494a.m53270Gc((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(this.f34538P1.f56859id)).map(new qcj() { // from class: l.naa0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).verifications;
            }
        }).distinctUntilChanged().filter(new qcj() { // from class: l.oaa0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f145676a.m53277Hc((PicVerification) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.qaa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156368a.m53284Ic((PicVerification) obj);
            }
        }));
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: G */
    public void mo52243G(View... viewArr) {
        for (View view : viewArr) {
            bnl0.m105509E0(view, m53491od(this.f34628j2));
        }
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: G0 */
    public boolean mo53266G0(User user) {
        if (user == null) {
            m53083Rd(CoreModule.m30930K().getUserById(this.f34642m3));
        }
        if (!this.f34646n3 && mo53472m3(user)) {
            return false;
        }
        if (!this.f34646n3 && this.f34679v3) {
            Relationship relationship = user.localRelationship;
            return relationship != null && TEnum.equals(relationship.state, "matched");
        }
        if (this.f34667s3) {
            return !this.f34659q3;
        }
        return false;
    }

    /* JADX INFO: renamed from: G8 */
    public final void m53267G8() {
        if (!TextUtils.equals(this.f34662r2.get("action"), SocialOperation.GAME_SIGNATURE) || this.f34612f2) {
            return;
        }
        this.f34612f2 = true;
        LoopFragmentFactory.m52658S(m189086i2(), mo52249J1(), LoopInputType.SIGNATURE);
    }

    /* JADX INFO: renamed from: G9 */
    public final void m53268G9() {
        this.f34496H.setVisibility(8);
        m53327P8();
        this.f34566V.setBackgroundColor(Color.parseColor("#ffffff"));
        bnl0.m105574p0(this.f34581Y);
        bnl0.m105574p0(this.f34547R0);
        bnl0.m105574p0(this.f34576X);
        this.f34581Y = null;
        this.f34547R0 = null;
        this.f34532O0 = null;
        this.f34480E0 = null;
        this.f34586Z = null;
    }

    /* JADX INFO: renamed from: Gb */
    public final /* synthetic */ void m53269Gb(x20 x20Var) {
        this.f34466B2.m53977K1(x20Var);
    }

    /* JADX INFO: renamed from: Gc */
    public final /* synthetic */ void m53270Gc(Bundle bundle) {
        m53065Nd(this.f34538P1);
        m53083Rd(this.f34538P1);
        this.f34641m2.m137019l(uxj0.f181467a);
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: H0 */
    public void mo53271H0(int i) {
        this.f34553S1 = i;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: H1 */
    public View mo53272H1() {
        return (View) m53438fd(this.f34466B2.f34855G);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: H3 */
    public pf60<List<Literatures>, List<LiteraturesComments>> mo52245H3() {
        return this.f34645n2;
    }

    /* JADX INFO: renamed from: H8 */
    public final void m53273H8() {
        bnl0.m105524M(this.f34581Y, false);
        if (NullChecker.m82486a(this.f34677v1)) {
            bnl0.m105524M(this.f34677v1, false);
        }
        bnl0.m105524M(this.f34619h1, false);
    }

    /* JADX INFO: renamed from: H9 */
    public final void m53274H9() {
        if ("from_intl_visitor".equals(this.f34671t3) || "from_intl_salvage".equals(this.f34671t3)) {
            bnl0.m105524M(this.f34532O0, false);
            bnl0.m105524M(this.f34586Z, false);
            bnl0.m105524M(this.f34480E0, false);
            if (NullChecker.m82486a(this.f34632k1)) {
                bnl0.m105524M(this.f34632k1, false);
            }
            if (NullChecker.m82486a(this.f34562U0)) {
                bnl0.m105524M(this.f34562U0, false);
            }
            duringCreated(CoreModule.f18264c.f20381e0.m116484L7(this.f34642m3)).subscribe(psd0.m173597H(new y20() { // from class: l.tca0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f173224a.m53469lc((List) obj);
                }
            }, new y20() { // from class: l.uca0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ProfileListFrag.m53115Z6((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Ha */
    public final /* synthetic */ void m53275Ha(boolean z, Relationship relationship) {
        if (z) {
            this.f34600c2 = false;
            this.f34604d2 = true;
            if (NullChecker.m82486a(this.f34677v1) && bnl0.m105529O0(this.f34677v1)) {
                bnl0.m105524M(this.f34677v1, false);
                m53312Md(false);
            }
        } else {
            if (CoreModule.m30932N().mo61573so() && (m53328P9(this.f34671t3) || m53321O9())) {
                r1j0.m179420g("喜欢已发送");
            }
            if (NullChecker.m82486a(this.f34677v1) && bnl0.m105529O0(this.f34677v1)) {
                m53312Md(false);
                bnl0.m105524M(this.f34677v1, false);
                bnl0.m105524M(this.f34640m1, true);
            }
            this.f34608e2 = false;
        }
        m53465kd(true);
        if (NullChecker.m82486a(this.f34480E0)) {
            bnl0.m105524M(this.f34480E0, false);
        }
    }

    /* JADX INFO: renamed from: Hb */
    public final /* synthetic */ void m53276Hb(View view) {
        i4g0.m138520r("e_user_profile_more_popup_cancel", "p_user_profile_more_popup");
        this.f34583Y1.m204614b();
    }

    /* JADX INFO: renamed from: Hc */
    public final /* synthetic */ Boolean m53277Hc(PicVerification picVerification) {
        return Boolean.valueOf(!this.f34538P1.verifications.equals(picVerification));
    }

    /* JADX INFO: renamed from: Hd */
    public final void m53278Hd(@NonNull final RiskOtherData riskOtherData) {
        if (TextUtils.isEmpty(riskOtherData.text)) {
            return;
        }
        bnl0.m105524M(this.f34669t1, true);
        this.f34673u1.setText(riskOtherData.text);
        i4g0.m138492A("e_profile_safety_notice", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("user_risk_type", riskOtherData.type), jyb.m147494Y("risk_userid", userId()));
        bnl0.m105509E0(this.f34669t1, new View.OnClickListener() { // from class: l.m8a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135160a.m53291Jc(riskOtherData, view);
            }
        });
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: I1 */
    public boolean mo53279I1() {
        return !this.f34678v2;
    }

    /* JADX INFO: renamed from: I8 */
    public final void m53280I8() {
        bnl0.m105524M(this.f34581Y, false);
        boolean zM53474ma = m53474ma();
        VLinear vLinear = this.f34677v1;
        if (zM53474ma) {
            bnl0.m105524M(vLinear, true);
            m53312Md(true);
        } else {
            if (NullChecker.m82486a(vLinear)) {
                bnl0.m105524M(this.f34677v1, false);
            }
            bnl0.m105524M(this.f34619h1, true);
            m53312Md(false);
        }
        bnl0.m105509E0(this.f34619h1, new View.OnClickListener() { // from class: l.rca0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162081a.m53240Ba(view);
            }
        });
    }

    /* JADX INFO: renamed from: I9 */
    public boolean m53281I9() {
        User user;
        if (mo52302m0() || (user = this.f34628j2) == null || TextUtils.equals(user.f56859id, CoreModule.m30929H().userId())) {
            return false;
        }
        return this.f34628j2.isBannedNew() || this.f34628j2.isAccountCancellation();
    }

    /* JADX INFO: renamed from: Ia */
    public final /* synthetic */ void m53282Ia(boolean z, Throwable th) {
        if (z) {
            this.f34600c2 = false;
        } else {
            this.f34608e2 = false;
        }
        m53465kd(false);
    }

    /* JADX INFO: renamed from: Ib */
    public final /* synthetic */ void m53283Ib() {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(userId())) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(userId()).m61308fp().profileSmall())) {
            CoreModule.f18264c.f20384f0.m33667Gp(act(), false, userId(), CoreModule.f18264c.f20381e0.m116597oa(userId()).m61308fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: Ic */
    public final /* synthetic */ void m53284Ic(PicVerification picVerification) {
        User user = this.f34538P1;
        user.verifications = picVerification;
        m53065Nd(user);
        m53083Rd(this.f34538P1);
        this.f34641m2.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: Id */
    public final void m53285Id(boolean z) {
        act().startActivity(ReportAct.m55814e2(act(), this.f34642m3, "", z, new ResultReceiverC88556(null, z), "profile", TextUtils.equals("home_card", this.f34671t3)));
    }

    @Override // p153l.q3m
    @Nullable
    /* JADX INFO: renamed from: J */
    public View mo53286J() {
        return this.f34586Z;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: J1 */
    public PutongFrag mo52249J1() {
        return this;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: J3 */
    public void mo52250J3() {
        if (this.f34633k2 == null || this.f34628j2 == null) {
            return;
        }
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "reRenderPage!!!");
        this.f34641m2.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: J8 */
    public final void m53287J8() {
        if (m53328P9(this.f34671t3) || m53321O9()) {
            if (!CoreModule.m30932N().mo61516Wm() || m53501qa()) {
                bnl0.m105524M(this.f34619h1, false);
                return;
            }
            this.f34594a4 = false;
            this.f34623i1.setBackground(act().getResources().getDrawable(dbc0.f87418si));
            this.f34627j1.setImageDrawable(act().getResources().getDrawable(dbc0.f87644zi));
            VLinear vLinear = this.f34689y1;
            if (vLinear != null && this.f34694z1 != null) {
                vLinear.setBackground(act().getResources().getDrawable(dbc0.f87418si));
                this.f34694z1.setImageDrawable(act().getResources().getDrawable(dbc0.f87644zi));
            }
            boolean zM53474ma = m53474ma();
            VLinear vLinear2 = this.f34677v1;
            if (zM53474ma) {
                bnl0.m105524M(vLinear2, true);
                m53312Md(true);
            } else {
                if (NullChecker.m82486a(vLinear2)) {
                    bnl0.m105524M(this.f34677v1, false);
                }
                bnl0.m105524M(this.f34619h1, true);
                m53312Md(false);
            }
        }
    }

    /* JADX INFO: renamed from: J9 */
    public boolean m53288J9() {
        if (!NullChecker.m82486a(jyb.m147529r(CoreModule.m30932N().mo61462Gm(), new qcj() { // from class: l.laa0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f130672a.m53476mc((String) obj);
            }
        }))) {
            return this.f34590Z3;
        }
        this.f34590Z3 = false;
        return false;
    }

    /* JADX INFO: renamed from: Ja */
    public final /* synthetic */ void m53289Ja(boolean z) {
        if (z) {
            this.f34600c2 = true;
        } else {
            this.f34608e2 = true;
        }
    }

    /* JADX INFO: renamed from: Jb */
    public final /* synthetic */ void m53290Jb() {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(userId())) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(userId()).m61308fp().profileSmall())) {
            CoreModule.f18264c.f20384f0.m33667Gp(act(), true, userId(), CoreModule.f18264c.f20381e0.m116597oa(userId()).m61308fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: Jc */
    public final /* synthetic */ void m53291Jc(RiskOtherData riskOtherData, View view) {
        cl80.m110426e().m110439q(al80.m98641a(new gyp(act())));
        i4g0.m138523u("e_profile_safety_notice", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("user_risk_type", riskOtherData.type));
    }

    /* JADX INFO: renamed from: Jd */
    public final void m53292Jd() {
        this.f34605d3.m105676V(false);
        this.f34613f3.m105676V(false);
        this.f34601c3.m105676V(false);
        this.f34617g3.m105676V(false);
        this.f34609e3.m105676V(false);
    }

    @Override // p153l.s7m
    /* JADX INFO: renamed from: K2 */
    public User mo52252K2() {
        if (this.f34628j2 == null && !mo53313N2()) {
            m53083Rd(CoreModule.m30930K().getUserById(this.f34642m3));
        }
        if (this.f34628j2 == null && !m53435fa()) {
            CrashHelper.m82480d(new IllegalStateException("profilelist user is null id " + userId() + " from : " + from() + " afterGetUserInfo : " + this.f34692y4), 1000);
        }
        return this.f34628j2;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: K3 */
    public int mo53293K3() {
        return this.f34548R1;
    }

    /* JADX INFO: renamed from: K8 */
    public void m53294K8() {
        bnl0.m105524M(this.f34576X, (NullChecker.m82486a(this.f34603d1) && bnl0.m105529O0(this.f34603d1)) || (NullChecker.m82486a(this.f34619h1) && bnl0.m105529O0(this.f34619h1)) || ((NullChecker.m82486a(this.f34599c1) && bnl0.m105529O0(this.f34599c1)) || (NullChecker.m82486a(this.f34632k1) && bnl0.m105529O0(this.f34632k1))));
    }

    /* JADX INFO: renamed from: K9 */
    public final boolean m53295K9() {
        return (!gra.m131564F1() || this.f34650o3 || TextUtils.isEmpty(this.f34642m3) || !CoreModule.f18264c.f20384f0.m34161vh(this.f34642m3) || m53407aa()) ? false : true;
    }

    /* JADX INFO: renamed from: Ka */
    public final /* synthetic */ void m53296Ka(GreetingPermission greetingPermission) {
        if (TextUtils.equals(this.f34671t3, "impress_signal") || TextUtils.equals(this.f34671t3, "from_pin_like")) {
            return;
        }
        if (!NullChecker.m82486a(greetingPermission) || !greetingPermission.enable || !NullChecker.m82486a(CoreModule.m30930K().getUserById(this.f34642m3))) {
            if (CoreModule.m30932N().mo61451Co()) {
                m53377Vd();
                return;
            } else {
                this.f34599c1.setViewLayoutType(2);
                m53332Pd(mo52252K2(), false);
                return;
            }
        }
        if (CoreModule.m30932N().mo61451Co()) {
            m53377Vd();
            return;
        }
        if (TextUtils.equals(this.f34671t3, "impress_signal")) {
            return;
        }
        bnl0.m105524M(this.f34480E0, false);
        bnl0.m105524M(this.f34599c1, false);
        this.f34599c1.setViewLayoutType(1);
        this.f34599c1.mo57470q(act(), this.f34671t3, CoreModule.m30930K().getUserById(this.f34642m3), new yaa0(this), m53541wd());
        bnl0.m105524M(this.f34599c1, true);
        m53332Pd(mo52252K2(), false);
    }

    /* JADX INFO: renamed from: Kb */
    public final /* synthetic */ void m53297Kb() {
        i4g0.m138523u("e_blacklist", "p_user_profile_more_popup", pf60.m172085a("blacklist_management", "add"));
        CoreModule.m30932N().mo61489Pf(act(), this.f34628j2, CoreModule.m30932N().mo61472Kk(this.f34628j2));
    }

    /* JADX INFO: renamed from: Kc */
    public final /* synthetic */ void m53298Kc(uxj0 uxj0Var) {
        if (TextUtils.equals(this.f34671t3, "home_card")) {
            act().setResult(SwipeDirection.RIGHT.getValue());
            act().m68056e2();
        } else {
            bnl0.m105524M(this.f34572W0, false);
            bnl0.m105524M(this.f34567V0, false);
        }
    }

    /* JADX INFO: renamed from: Kd */
    public final void m53299Kd() {
        if (TextUtils.isEmpty(this.f34577X0.getText().toString().trim())) {
            return;
        }
        i4g0.m138523u("e_new_profile_message_send", pageId(), pf60.m172085a("matched_left_time", m53386X8()));
        Message messageNew_ = Message.new_();
        messageNew_.value = this.f34577X0.getText().toString().trim();
        messageNew_.messageType = MessageType.get("text");
        this.f34577X0.setText("");
        if (TextUtils.equals(this.f34671t3, "home_card")) {
            CoreModule.f18264c.f20384f0.f20629P1 = userId();
        }
        act().hideInput();
        duringCreated((C22421c) CoreModule.f18264c.f20384f0.m33626Dn(userId(), messageNew_, null).flatMap(new qcj() { // from class: l.o8a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20384f0.m33653Fo();
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.p8a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151003a.m53298Kc((uxj0) obj);
            }
        }, new y20() { // from class: l.q8a0
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileListFrag.m53178n7((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L8 */
    public rcj<Boolean, Boolean, Boolean> m53300L8(final String str, final String str2) {
        return new rcj() { // from class: l.k8a0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f124366a.m53250Da(str, str2, (Boolean) obj, (Boolean) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: La */
    public final /* synthetic */ void m53301La() {
        this.f34466B2.f34910x.m224386b0();
    }

    /* JADX INFO: renamed from: Lb */
    public final /* synthetic */ void m53302Lb() {
        i4g0.m138523u("e_blacklist", "p_user_profile_more_popup", pf60.m172085a("blacklist_management", Action.remove));
        CoreModule.m30932N().mo61489Pf(act(), this.f34628j2, CoreModule.m30932N().mo61472Kk(this.f34628j2));
    }

    /* JADX INFO: renamed from: Lc */
    public final /* synthetic */ void m53303Lc(int i, boolean z) {
        this.f34466B2.m53976J1(i, z);
    }

    /* JADX INFO: renamed from: Ld */
    public final void m53304Ld(final User user) {
        bnl0.m105509E0(this.f34517L0, new View.OnClickListener() { // from class: l.bca0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76121a.m53331Pc(user, view);
            }
        });
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: M */
    public boolean mo53305M() {
        if (gra.m131637V1()) {
            return TextUtils.equals(this.f34671t3, "chat_group_anonymity") || TextUtils.equals(this.f34671t3, "chat_group");
        }
        return false;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: M0 */
    public View mo53306M0() {
        return this.f34496H;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: M8, reason: merged with bridge method [inline-methods] */
    public ArrayList<pf60<String, x20>> mo30631C4() {
        ArrayList<pf60<String, x20>> arrayList = new ArrayList<>();
        arrayList.add(jyb.m147494Y("user id", new x20() { // from class: l.raa0
            @Override // p153l.x20
            public final void call() {
                this.f161916a.m53031Ea();
            }
        }));
        arrayList.add(jyb.m147494Y("用户位置信息", new x20() { // from class: l.saa0
            @Override // p153l.x20
            public final void call() {
                this.f167022a.m53035Fa();
            }
        }));
        arrayList.add(jyb.m147494Y("mock 共同联系人", new x20() { // from class: l.taa0
            @Override // p153l.x20
            public final void call() {
                this.f172708a.m53039Ga();
            }
        }));
        arrayList.add(jyb.m147494Y("认证气泡本地数据清理：" + CoreModule.f18264c.f20381e0.f89317r2.get() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f18264c.f20381e0.f89310q2.get(), new x20() { // from class: l.uaa0
            @Override // p153l.x20
            public final void call() {
                ProfileListFrag.m53137d8();
            }
        }));
        arrayList.add(jyb.m147494Y("弹出先发like弹窗", new x20() { // from class: l.vaa0
            @Override // p153l.x20
            public final void call() {
                wgx.m206283A().m206314N(CoreModule.m30930K().me_().f56859id);
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: M9 */
    public final boolean m53308M9() {
        User user;
        if (TextUtils.isEmpty(this.f34642m3) || (user = this.f34628j2) == null || user.isMe()) {
            return false;
        }
        if (this.f34602c4 == null) {
            this.f34602c4 = CoreModule.m30932N().getUserById(this.f34642m3);
        }
        return CoreModule.m30932N().mo61555mn(this.f34628j2) || CoreModule.m30932N().mo61555mn(this.f34602c4);
    }

    /* JADX INFO: renamed from: Ma */
    public final /* synthetic */ void m53309Ma(Boolean bool) {
        m53235Ad(true);
    }

    /* JADX INFO: renamed from: Mb */
    public final /* synthetic */ void m53310Mb(boolean z, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        if (TextUtils.equals(c22660a.f210081a.toString(), "分享给朋友看看")) {
            i4g0.m138520r("e_share_to_third_app", "p_user_profile_more_popup");
            if (lik0.m154377c(userId())) {
                o1j0.m165651y("此用户不可被分享");
            } else {
                qtk.m178001U0(act(), "share_bottom", new x20() { // from class: l.u9a0
                    @Override // p153l.x20
                    public final void call() {
                        this.f178107a.m53283Ib();
                    }
                }, new x20() { // from class: l.v9a0
                    @Override // p153l.x20
                    public final void call() {
                        this.f182978a.m53290Jb();
                    }
                });
            }
        } else if (TextUtils.equals(c22660a.f210081a.toString(), act().getString(R$string.f19600r))) {
            m53285Id(z);
        } else if (TextUtils.equals(c22660a.f210081a.toString(), "取消喜欢")) {
            i4g0.m138523u("e_unlike", "p_user_profile_more_popup", jyb.m147494Y("unlike_from", "profile"), jyb.m147494Y("other_user_id", NullChecker.m82486a(this.f34628j2) ? this.f34628j2.f56859id : ""));
            CoreModule.m30932N().mo61502T7(act(), this.f34628j2, this.f34671t3, null);
        } else if (TextUtils.equals(c22660a.f210081a.toString(), "取消关注")) {
            CoreModule.m30932N().mo61514Vp(act(), this.f34628j2, this.f34671t3);
        } else if (TextUtils.equals(c22660a.f210081a.toString(), act().getString(R$string.f19358j5))) {
            m53354Sd(act(), act().getString(R$string.f18288A2), act().getString(R$string.f19358j5), m53355T8(), new x20() { // from class: l.w9a0
                @Override // p153l.x20
                public final void call() {
                    this.f187990a.m53297Kb();
                }
            });
        } else if (TextUtils.equals(c22660a.f210081a.toString(), act().getString(R$string.f19789x2))) {
            m53354Sd(act(), act().getString(R$string.f18288A2), act().getString(R$string.f19789x2), m53470ld(NullChecker.m82486a(this.f34628j2) && this.f34628j2.isFemale()), new x20() { // from class: l.x9a0
                @Override // p153l.x20
                public final void call() {
                    this.f192925a.m53302Lb();
                }
            });
        }
        this.f34583Y1.m204614b();
    }

    /* JADX INFO: renamed from: Mc */
    public final /* synthetic */ void m53311Mc(int i, boolean z) {
        this.f34466B2.m53976J1(i, z);
    }

    /* JADX INFO: renamed from: Md */
    public void m53312Md(boolean z) {
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: N2 */
    public boolean mo53313N2() {
        return this.f34638l3;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: N3 */
    public View mo53314N3() {
        return this.f34595b1;
    }

    /* JADX INFO: renamed from: N8 */
    public User m53315N8() {
        if (IntlCountryCodeController.m29115l() && !bsj0.m106252J(m189086i2().profile.studies.qualification) && !m189086i2().profile.studies.active) {
            aw90.m100562F().f73701a.profile.studies.school = "";
        }
        if (NullChecker.m82486a(aw90.m100562F().f73701a) && this.f34680v4.m132952V()) {
            aw90.m100562F().f73701a.profile.extensions.momentSwitch.noSyncMoment.clear();
            aw90.m100562F().f73701a.profile.extensions.momentSwitch.noSyncMoment.add(0, this.f34680v4.m132951U() ? "false" : "true");
        }
        User userMo225055clone = aw90.m100562F().f73701a.mo225055clone();
        userMo225055clone.settings = null;
        return userMo225055clone.subtract(this.f34628j2);
    }

    /* JADX INFO: renamed from: Na */
    public final /* synthetic */ void m53316Na(uxj0 uxj0Var) {
        this.f34602c4 = CoreModule.m30932N().getUserById(this.f34642m3);
        m53235Ad(false);
    }

    /* JADX INFO: renamed from: Nb */
    public final /* synthetic */ void m53317Nb() {
        ArrayList arrayList = new ArrayList();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_user_profile_more_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("other_user_id", NullChecker.m82486a(this.f34628j2) ? this.f34628j2.f56859id : ""));
        if (m53446ha()) {
            arrayList.add("分享给朋友看看");
        }
        if (CoreModule.m30932N().mo61573so()) {
            l4g0VarM204399c.m152781p(jyb.m147494Y("share_pop_from_which", "profile"));
            if (m53462ka()) {
                arrayList.add("取消喜欢");
            } else if (m53308M9()) {
                arrayList.add("取消关注");
            }
        }
        arrayList.add(act().getString(R$string.f19600r));
        if (m53328P9(this.f34671t3) || m53336Q9()) {
            if (CoreModule.m30932N().mo61472Kk(this.f34628j2)) {
                l4g0VarM204399c.m152781p(jyb.m147494Y("blacklist_management", Action.remove));
                arrayList.add(act().getString(R$string.f19789x2));
            } else {
                l4g0VarM204399c.m152781p(jyb.m147494Y("blacklist_management", "add"));
                arrayList.add(act().getString(R$string.f19358j5));
            }
        }
        int iIndexOf = arrayList.indexOf(act().getString(R$string.f19600r));
        w1e.m204402f(l4g0VarM204399c);
        w30.C21001b c21001b = new w30.C21001b(getContext());
        final boolean zMo53266G0 = mo53266G0(mo52252K2());
        c21001b.m204668T(new DialogInterface.OnDismissListener() { // from class: l.k9a0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m204657I(act().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.l9a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130580a.m53276Hb(view);
            }
        }).m204665Q(arrayList).m204666R(new int[]{iIndexOf}, new int[]{c9c0.f80351L}).m204670V(new w30.InterfaceC21003d() { // from class: l.m9a0
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f135363a.m53310Mb(zMo53266G0, vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        this.f34583Y1 = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: Nc */
    public final /* synthetic */ void m53318Nc(User user, String str) {
        Intent intent = new Intent();
        intent.putExtra("heart_confession_uid", user.f56859id);
        intent.putExtra("heart_confession_content", str);
        m53551y8(SwipeDirection.UP.getValue(), intent);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: O1 */
    public boolean mo53319O1() {
        return m53343R9();
    }

    /* JADX INFO: renamed from: O8 */
    public final User m53320O8() {
        User userMo225055clone = this.f34628j2.mo225055clone();
        if (this.f34680v4.m132952V()) {
            userMo225055clone.profile.extensions.momentSwitch.noSyncMoment.clear();
            userMo225055clone.profile.extensions.momentSwitch.noSyncMoment.add(0, this.f34680v4.m132951U() ? "false" : "true");
        }
        return userMo225055clone.subtract(this.f34628j2);
    }

    /* JADX INFO: renamed from: O9 */
    public final boolean m53321O9() {
        return TextUtils.equals(this.f34671t3, "from_conversation_search_view");
    }

    /* JADX INFO: renamed from: Oa */
    public final /* synthetic */ void m53322Oa(View view) {
        m53410ae();
    }

    /* JADX INFO: renamed from: Ob */
    public final /* synthetic */ void m53323Ob(x20 x20Var) {
        this.f34466B2.m53979L1(x20Var, null);
    }

    /* JADX INFO: renamed from: Oc */
    public final /* synthetic */ void m53324Oc(final User user, final String str) {
        if (d79.m114685j0()) {
            fcp.m125030t(act(), "intl_letter_profile", new x20() { // from class: l.j9a0
                @Override // p153l.x20
                public final void call() {
                    this.f118860a.m53318Nc(user, str);
                }
            });
            return;
        }
        if (!tmp.m191798d()) {
            a5i0.m96169s1(act(), "intl_letter_profile");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("heart_confession_uid", user.f56859id);
        intent.putExtra("heart_confession_content", str);
        m53551y8(SwipeDirection.UP.getValue(), intent);
    }

    /* JADX INFO: renamed from: Od */
    public void m53325Od() {
        String str;
        this.pageHelper.m152782q(pageId());
        C8992f.m55879b().m55884f(this.f34671t3);
        if (this.f34650o3) {
            return;
        }
        String str2 = this.f34642m3;
        String strRelativeTimeForTrack = "";
        if (TextUtils.equals("home_card", this.f34671t3) || TextUtils.equals("from_city_center_conv_banner", this.f34671t3)) {
            str = "home";
        } else {
            str = (TextUtils.equals("home_menu", this.f34671t3) || this.f34650o3) ? "" : "other";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("moments_user_id", str2);
            jSONObject.put("source", str);
            jSONObject.put("is_myself", this.f34646n3 ? "true" : "false");
            User userById = CoreModule.m30930K().getUserById(this.f34642m3);
            boolean z = false;
            if (NullChecker.m82486a(userById)) {
                if (!userById.location.isHideUpdateTime() && !userById.isMe() && !CoreModule.f18264c.f20303E0.m141089x3(userById) && (userById.isMe() || User.isMatched(this.f34628j2) || pzi0.m174454o() - userById.location.updatedTime <= 1.728E8d)) {
                    strRelativeTimeForTrack = userById.relativeTimeForTrack();
                }
                Relationship relationship = userById.localRelationship;
                if (relationship == null || !TEnum.equals(relationship.state, "matched")) {
                    jSONObject.put("is_match", 0);
                } else {
                    jSONObject.put("is_match", 1);
                }
                jSONObject.put("distance", m53082R8(userById));
                jSONObject.put("lastactivity_time", strRelativeTimeForTrack);
            }
            jSONObject.put("refer_source", m53117Z8(this.f34671t3));
            if (TextUtils.equals("from_city_center_conv_banner", this.f34671t3) || (NullChecker.m82486a(this.f34628j2) && this.f34628j2.isOnCityTop())) {
                z = true;
            }
            jSONObject.put("city_cover", z);
            this.pageHelper.m152780o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: P */
    public boolean mo53326P(String str) {
        return false;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: P1 */
    public boolean mo52258P1() {
        return this.f34646n3;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: P8 */
    public final void m53327P8() {
        if (this.f34650o3) {
            this.f34566V.setFocusableInTouchMode(true);
            this.f34566V.setDescendantFocusability(131072);
            this.f34566V.setFocusable(true);
        }
    }

    /* JADX INFO: renamed from: P9 */
    public final boolean m53328P9(String str) {
        return CoreModule.m30932N().mo61492Qm(str);
    }

    /* JADX INFO: renamed from: Pa */
    public final /* synthetic */ void m53329Pa(View view) {
        m53449hd();
    }

    /* JADX INFO: renamed from: Pb */
    public final /* synthetic */ void m53330Pb(User user) {
        m53065Nd(user);
        m53083Rd(user);
        this.f34641m2.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: Pc */
    public final /* synthetic */ void m53331Pc(final User user, View view) {
        if (user == null) {
            user = this.f34628j2;
        }
        tmp.m191801g(act(), user, new y20() { // from class: l.qca0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156567a.m53324Oc(user, (String) obj);
            }
        }, "intl_letter_profile");
        i4g0.m138523u("liked_users".equals(this.f34671t3) ? "e_iliked_letter" : "e_letter_bar", pageId(), pf60.m172085a("is_privileged", gul0.m132340e(a5i0.m96096G())));
    }

    /* JADX INFO: renamed from: Pd */
    public final void m53332Pd(User user, boolean z) {
        if (user == null) {
            user = this.f34628j2;
        }
        final User user2 = user;
        this.f34599c1.mo57467H(user2, z, z ? new y20() { // from class: l.waa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188102a.m53346Rc(user2, (String) obj);
            }
        } : new y20() { // from class: l.xaa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193002a.m53353Sc(user2, (String) obj);
            }
        }, new yaa0(this), this.f34671t3);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: Q */
    public boolean mo53333Q() {
        if ("from_guess_liker_result".equals(this.f34671t3) || m53380W9() || !CoreModule.m30932N().mo61451Co()) {
            return false;
        }
        return m53384Wd();
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: Q2 */
    public View mo53334Q2() {
        return (View) m53438fd(this.f34466B2.f34911y);
    }

    /* JADX INFO: renamed from: Q8 */
    public final void m53335Q8() {
        th0 th0Var = this.f34598b4;
        if (th0Var == null) {
            return;
        }
        th0Var.m191137c();
        this.f34598b4 = null;
    }

    /* JADX INFO: renamed from: Q9 */
    public boolean m53336Q9() {
        return TextUtils.equals(this.f34671t3, "from_find_partner");
    }

    /* JADX INFO: renamed from: Qa */
    public final /* synthetic */ void m53337Qa(View view) {
        m53459jd();
    }

    /* JADX INFO: renamed from: Qb */
    public final /* synthetic */ void m53338Qb(uxj0 uxj0Var) {
        m53083Rd(mo52252K2());
        m53065Nd(CoreModule.m30930K().me_());
        if (this.f34628j2 == null || this.f34633k2 == null) {
            return;
        }
        this.f34641m2.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: Qc */
    public final /* synthetic */ void m53339Qc(int i) {
        this.f34476D2.f142965v.setVisibility(i);
    }

    /* JADX INFO: renamed from: Qd */
    public final void m53340Qd() {
        if (IntlCountryCodeController.m29125v()) {
            bnl0.m105537U(this.f34492G0, qa00.m175859d(1.0f));
            bnl0.m105539W(this.f34492G0, qa00.m175859d(1.0f));
            this.f34492G0.setImageDrawable(act().getResources().getDrawable(dbc0.f87644zi));
            VImage vImage = this.f34694z1;
            if (vImage != null) {
                bnl0.m105537U(vImage, qa00.m175859d(1.0f));
                bnl0.m105539W(this.f34694z1, qa00.m175859d(1.0f));
                this.f34694z1.setImageDrawable(act().getResources().getDrawable(dbc0.f87644zi));
            }
        }
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: R */
    public boolean mo52261R() {
        return CoreModule.f18264c.f20405m0.f20205x0.get().booleanValue();
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: R0 */
    public boolean mo52262R0() {
        return getActivity() instanceof NewUI1ContainerActivity;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: R1 */
    public void mo53341R1(final int i) {
        this.f34569V2.mo168208a(new x20() { // from class: l.dca0
            @Override // p153l.x20
            public final void call() {
                this.f87764a.m53264Fc(i);
            }
        });
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: R2 */
    public View mo53342R2() {
        return (View) m53438fd(this.f34466B2.f34869N);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: R3, reason: merged with bridge method [inline-methods] */
    public void m53521tc() {
        LiveService liveService;
        if (mo53549y2() && NullChecker.m82486a(this.f34466B2.f34901g1)) {
            ProfileImagesItemHolder profileImagesItemHolder = this.f34466B2;
            profileImagesItemHolder.m53997V0(profileImagesItemHolder.f34901g1, false);
        }
        if (CoreModule.m30932N().mo61469K8()) {
            CoreModule.m30932N().mo61459Fm(userId(), m53288J9());
        }
        act().m68056e2();
        if (tnt.m191966c(this.f34671t3) && !this.f34629j3 && (liveService = uqb0.f180396b0.f170326c) != null) {
            liveService.mo68427Tc(act(), this.f34642m3, true);
        }
        if (m53440ga()) {
            this.f34485F.getViewTreeObserver().removeOnGlobalLayoutListener(this.f34585Y3);
        }
    }

    /* JADX INFO: renamed from: R9 */
    public final boolean m53343R9() {
        return "home_card".equals(this.f34671t3);
    }

    /* JADX INFO: renamed from: Ra */
    public final /* synthetic */ void m53344Ra(View view) {
        if (!this.f34594a4) {
            m53459jd();
        } else {
            i4g0.m138523u(MatchScData.ModuleId.mid_e_likeButton, pageId(), jyb.m147494Y("moments_user_id", this.f34642m3));
            j1a.m143081A(act(), this.f34628j2, true, null, LikeFrom.get("moment"), null, null, false, null);
        }
    }

    /* JADX INFO: renamed from: Rb */
    public final /* synthetic */ C22421c m53345Rb() {
        return psd0.m173625r(CoreModule.f18264c.f20381e0.m116483Ka(this.f34642m3), CoreModule.f18264c.f20381e0.m116596o9(), new kda0());
    }

    /* JADX INFO: renamed from: Rc */
    public final /* synthetic */ void m53346Rc(User user, String str) {
        m53245Ca(str, user.f56859id);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: S */
    public boolean mo52265S() {
        return false;
    }

    @Override // p153l.q3m
    @Nullable
    /* JADX INFO: renamed from: S1 */
    public View mo53347S1() {
        return this.f34480E0;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: S2 */
    public void mo53348S2(boolean z) {
        this.f34563U1 = z;
    }

    /* JADX INFO: renamed from: S8 */
    public void m53349S8(String str, String str2, final boolean z) {
        String str3;
        if (NullChecker.m82486a(this.f34602c4)) {
            LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
            int iMo53415c0 = mo53415c0();
            SwipeExtraScData swipeExtraScData = likeExtraDataNew_.swipeExtraScData;
            swipeExtraScData.picNum = iMo53415c0;
            swipeExtraScData.picUploads = this.f34602c4.pictures.size();
            if (NullChecker.m82486a(this.f34628j2) && this.f34628j2.pictures.size() != this.f34602c4.pictures.size()) {
                CrashHelper.m82479c(new IllegalStateException(" profilelist picture size diff , user  " + this.f34628j2.f56859id + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f34628j2.pictures.size() + " withRelation " + this.f34602c4.f56859id + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f34602c4.pictures.size()));
            }
            int size = this.f34602c4.pictures.size();
            SwipeExtraScData swipeExtraScData2 = likeExtraDataNew_.swipeExtraScData;
            if (iMo53415c0 >= size) {
                swipeExtraScData2.picUrl = "";
            } else {
                swipeExtraScData2.picUrl = this.f34602c4.pictures.get(iMo53415c0).url;
            }
            Act act = act();
            User user = this.f34602c4;
            if (TextUtils.isEmpty(str)) {
                str3 = z ? "p_profile,superlike" : "p_home,likelimit";
            } else {
                str3 = "p_profile,letter";
            }
            if (rgr.m181478o(act, user, true, z, false, str3, m53300L8(str, str2), new y20() { // from class: l.bda0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f76238a.m53275Ha(z, (Relationship) obj);
                }
            }, new y20() { // from class: l.cda0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f81121a.m53282Ia(z, (Throwable) obj);
                }
            }, pageId(), likeExtraDataNew_, str, str2, new x20() { // from class: l.eda0
                @Override // p153l.x20
                public final void call() {
                    this.f93158a.m53289Ja(z);
                }
            })) {
                if (z) {
                    this.f34600c2 = true;
                } else {
                    this.f34608e2 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: S9 */
    public boolean m53350S9() {
        return TextUtils.equals(this.f34671t3, "from_intl_meet");
    }

    /* JADX INFO: renamed from: Sa */
    public final /* synthetic */ void m53351Sa() {
        if (this.f34599c1.m199289x() || this.f34532O0 == null) {
            return;
        }
        z5h0.m218664H(this.f34486F0);
        p6d0.m170847d0().f150817j.add(userId());
        p6d0.m170847d0().m170856l0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Sb */
    public final /* synthetic */ void m53352Sb(pf60 pf60Var) {
        if (!"home_card".equals(this.f34671t3) || this.f34670t2 == null) {
            m53083Rd((User) pf60Var.f152156a);
            m53065Nd((User) pf60Var.f152157b);
            this.f34641m2.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: Sc */
    public final /* synthetic */ void m53353Sc(User user, String str) {
        Intent intent = new Intent();
        intent.putExtra("heart_confession_uid", user.f56859id);
        intent.putExtra("heart_confession_content", str);
        if (m53393Y9() || m53400Z9() || m53418ca() || m53424da() || m53412ba() || m53435fa() || m53356T9() || m53350S9()) {
            intent.putExtra("currentUserId", this.f34628j2.f56859id);
        }
        m53551y8(SwipeDirection.UP.getValue(), intent);
    }

    /* JADX INFO: renamed from: Sd */
    public final void m53354Sd(Act act, String str, String str2, String str3, final x20 x20Var) {
        th0.C20312a c20312a = new th0.C20312a(act);
        th0.C20312a c20312aM191151j = c20312a.m191151j(str3);
        if (TextUtils.isEmpty(str)) {
            str = act.getString(R$string.f18866T);
        }
        c20312aM191151j.m191159r(str).m191156o(new View.OnClickListener() { // from class: l.y9a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198071a.m53359Tc(x20Var, view);
            }
        }).m191146e(R$string.f19138c).m191154m(new DialogInterface.OnDismissListener() { // from class: l.z9a0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ProfileListFrag.m53181o5(dialogInterface);
            }
        }).m191144c(new View.OnClickListener() { // from class: l.aaa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69113a.m53368Uc(view);
            }
        });
        if (!TextUtils.isEmpty(str2)) {
            c20312a.m191160s(str2);
        }
        th0 th0VarM191142a = c20312a.m191142a();
        this.f34598b4 = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    /* JADX INFO: renamed from: T8 */
    public String m53355T8() {
        return CoreModule.m30930K().mo31745a().mo192242F() ? "拉黑后，ta不能对你关注、评论、点赞、打招呼，你可在“设置-隐私和通知-黑名单”内解除拉黑，是否确认要拉黑？" : act().getString(R$string.f19389k5);
    }

    /* JADX INFO: renamed from: T9 */
    public boolean m53356T9() {
        return TextUtils.equals(this.f34671t3, "from_intl_meet_likers");
    }

    /* JADX INFO: renamed from: Ta */
    public final /* synthetic */ void m53357Ta() {
        Act act = act();
        if (act != null) {
            C8618a.m48771w().m48790T(act, this.f34485F, this.f34460A1, 3000);
        }
    }

    /* JADX INFO: renamed from: Tb */
    public final /* synthetic */ Boolean m53358Tb(pf60 pf60Var) {
        return Boolean.valueOf(NullChecker.m82486a(pf60Var) && TextUtils.equals((CharSequence) pf60Var.f152156a, this.f34642m3));
    }

    /* JADX INFO: renamed from: Tc */
    public final /* synthetic */ void m53359Tc(x20 x20Var, View view) {
        m53335Q8();
        x20Var.call();
    }

    /* JADX INFO: renamed from: Td */
    public final void m53360Td() {
        if (NullChecker.m82486a(this.f34483E3) && this.f34483E3.showCountdownSendMsg) {
            this.f34658q2 = CoreModule.f18264c.f20384f0.f20607I0.get().longValue();
            bnl0.m105524M(this.f34572W0, true);
            bnl0.m105524M(this.f34567V0, true);
            bnl0.m105509E0(this.f34582Y0, new View.OnClickListener() { // from class: l.y6a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f197662a.m53376Vc(view);
                }
            });
            bnl0.m105509E0(this.f34577X0, new View.OnClickListener() { // from class: l.z6a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f203134a.m53383Wc(view);
                }
            });
            duringCreated(CoreModule.f18264c.f20384f0.m33740Ne(this.f34642m3)).subscribe(psd0.m173596G(new y20() { // from class: l.a7a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f68804a.m53390Xc((Conversation) obj);
                }
            }));
            gt0.m132170p(this.f34567V0, "alpha", 0L, 250L, null, 0.0f, 1.0f).start();
            i4g0.m138526x("e_new_profile_message_input", pageId());
            i4g0.m138492A("e_new_profile_message_send", pageId(), pf60.m172085a("matched_left_time", m53386X8()));
            bnl0.m105524M(this.f34599c1, false);
            bnl0.m105524M(this.f34603d1, false);
            bnl0.m105524M(this.f34619h1, false);
            bnl0.m105524M(this.f34619h1, false);
            bnl0.m105524M(this.f34542Q0, false);
            bnl0.m105524M(this.f34576X, false);
        }
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: U */
    public bnl0.C16067g mo53361U() {
        int childCount = this.f34566V.getChildCount();
        RecyclerView recyclerView = this.f34566V;
        return childCount > 2 ? bnl0.m105560i0(recyclerView.getChildAt(1)) : bnl0.m105560i0(recyclerView);
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: U0 */
    public PictureView mo53362U0() {
        return this.f34466B2.m53986P0();
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: U2 */
    public void mo53363U2() {
        this.f34610e4 = true;
        m53423d9();
        if (this.f34571W.getVisibility() == 0) {
            this.f34571W.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: U8, reason: merged with bridge method [inline-methods] */
    public void m53245Ca(String str, String str2) {
        m53349S8(str, str2, true);
    }

    /* JADX INFO: renamed from: U9 */
    public boolean m53365U9() {
        return TextUtils.equals(this.f34671t3, "from_intl_visitor");
    }

    /* JADX INFO: renamed from: Ua */
    public final /* synthetic */ void m53366Ua() {
        int iM174849K;
        q1a0 q1a0Var = this.f34625i3;
        if (q1a0Var != null && (iM174849K = q1a0Var.m174849K()) >= 0) {
            this.f34566V.scrollToPosition(iM174849K);
            if (NullChecker.m82486a(this.f34596b2)) {
                this.f34596b2.scrollToPositionWithOffset(iM174849K, 0);
            }
        }
    }

    /* JADX INFO: renamed from: Ub */
    public final /* synthetic */ void m53367Ub(View view) {
        this.f34480E0.callOnClick();
    }

    /* JADX INFO: renamed from: Uc */
    public final /* synthetic */ void m53368Uc(View view) {
        m53335Q8();
    }

    /* JADX INFO: renamed from: Ud */
    public void m53369Ud(final int i) {
        new th0.C20312a(act()).m191160s(m21603x4(R$string.f19380jr)).m191148g(false).m191150i(R$string.f19350ir).m191158q(R$string.f19320hr).m191156o(new View.OnClickListener() { // from class: l.fda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98330a.m53396Yc(i, view);
            }
        }).m191146e(R$string.f19138c).m191142a().m191141g();
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: V0 */
    public void mo53370V0(boolean z) {
        this.f34573W1 = z;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: V2 */
    public RelationshipStatus mo53371V2() {
        return this.f34467B3;
    }

    /* JADX INFO: renamed from: V8 */
    public MediaReorderCard m53372V8(int i) {
        return this.f34635k4.f105078v.m51994h(i);
    }

    /* JADX INFO: renamed from: V9 */
    public boolean m53373V9() {
        return "liked_users".equals(this.f34671t3);
    }

    /* JADX INFO: renamed from: Va */
    public final /* synthetic */ void m53374Va(View view) {
        i4g0.m138520r("e_user_info_greet_to_city_cover", pageId());
        C8523d.m47079e(act(), this.f34555S3.userId);
    }

    /* JADX INFO: renamed from: Vb */
    public final /* synthetic */ void m53375Vb(RelationshipStatus relationshipStatus) {
        if (TEnum.equals(relationshipStatus, RelationshipStatus.get("matched"))) {
            if (NullChecker.m82486a(this.f34581Y)) {
                bnl0.m105524M(this.f34581Y, false);
            }
            bnl0.m105524M(this.f34562U0, false);
            if (NullChecker.m82486a(this.f34599c1)) {
                bnl0.m105524M(this.f34599c1, false);
            }
            if (CoreModule.m30932N().mo61516Wm() && NullChecker.m82486a(this.f34480E0)) {
                bnl0.m105524M(this.f34480E0, false);
            }
            if (NullChecker.m82486a(this.f34576X)) {
                bnl0.m105524M(this.f34576X, false);
                return;
            }
            return;
        }
        if (!TEnum.equals(relationshipStatus, RelationshipStatus.get("liked"))) {
            if (TEnum.equals(relationshipStatus, RelationshipStatus.get("superliked"))) {
                if (this.f34666s2) {
                    bnl0.m105524M(this.f34619h1, false);
                }
                if (NullChecker.m82486a(this.f34532O0)) {
                    bnl0.m105524M(this.f34532O0, false);
                }
                if (NullChecker.m82486a(this.f34586Z)) {
                    bnl0.m105524M(this.f34586Z, false);
                }
                if (NullChecker.m82486a(this.f34480E0)) {
                    bnl0.m105524M(this.f34480E0, false);
                    return;
                }
                return;
            }
            return;
        }
        this.f34624i2 = true;
        if (this.f34666s2 && NullChecker.m82486a(this.f34581Y) && bnl0.m105529O0(this.f34581Y)) {
            bnl0.m105524M(this.f34581Y, false);
            boolean zM53474ma = m53474ma();
            VLinear vLinear = this.f34677v1;
            if (zM53474ma) {
                bnl0.m105524M(vLinear, true);
                m53312Md(true);
            } else {
                if (NullChecker.m82486a(vLinear)) {
                    bnl0.m105524M(this.f34677v1, false);
                }
                bnl0.m105524M(this.f34619h1, true);
                m53312Md(false);
            }
            bnl0.m105509E0(this.f34619h1, new View.OnClickListener() { // from class: l.s6a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f166557a.m53367Ub(view);
                }
            });
        }
        if (NullChecker.m82486a(this.f34532O0)) {
            bnl0.m105524M(this.f34532O0, false);
        }
        if (NullChecker.m82486a(this.f34586Z)) {
            bnl0.m105524M(this.f34586Z, false);
        }
    }

    /* JADX INFO: renamed from: Vc */
    public final /* synthetic */ void m53376Vc(View view) {
        m53299Kd();
    }

    /* JADX INFO: renamed from: Vd */
    public void m53377Vd() {
        if (this.f34628j2 == null && !TextUtils.isEmpty(this.f34642m3)) {
            this.f34628j2 = CoreModule.m30930K().getUserById(this.f34642m3);
        }
        User user = this.f34628j2;
        if (user == null || User.isMatched(user) || this.f34628j2.isTeamAccount() || "liked_users".equals(this.f34671t3) || "likers".equals(this.f34671t3) || "from_boost_refactor".equals(this.f34671t3) || this.f34628j2.isMe() || m53479na() || m53380W9() || TextUtils.equals(this.f34671t3, "impress_signal") || TextUtils.equals(this.f34671t3, "from_pin_like") || TextUtils.equals(this.f34671t3, "messages_thumbnail_left") || TextUtils.equals(this.f34671t3, "messages_title") || TextUtils.equals(this.f34671t3, CoreStaticData.ProfileFromType.MESSAGE_ICE_BREAK_DIALOG) || TextUtils.equals(this.f34671t3, "from_city_center_conv_banner") || TextUtils.equals(this.f34671t3, "conversation_view") || TextUtils.equals(this.f34671t3, "from_city_center_boost_cover") || TextUtils.equals(this.f34671t3, "profile_bubble")) {
            return;
        }
        this.f34599c1.setViewLayoutType(1);
        this.f34599c1.mo57470q(act(), this.f34671t3, this.f34628j2, new yaa0(this), m53541wd());
        bnl0.m105524M(this.f34599c1, true);
        m53332Pd(mo52252K2(), false);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: W */
    public RecyclerView mo53378W() {
        return this.f34566V;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: W2 */
    public View mo53379W2() {
        return this.f34517L0;
    }

    /* JADX INFO: renamed from: W9 */
    public final boolean m53380W9() {
        return tnt.m191965b(this.f34671t3);
    }

    /* JADX INFO: renamed from: Wa */
    public final /* synthetic */ void m53381Wa(View view) {
        mo52296j3(SwipeDirection.LEFT.getValue());
    }

    /* JADX INFO: renamed from: Wb */
    public final /* synthetic */ void m53382Wb(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.f34678v2 = zBooleanValue;
        if (zBooleanValue) {
            this.f34641m2.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: Wc */
    public final /* synthetic */ void m53383Wc(View view) {
        i4g0.m138520r("e_new_profile_message_input", pageId());
    }

    /* JADX INFO: renamed from: Wd */
    public boolean m53384Wd() {
        boolean zEquals;
        if (NullChecker.m82486a(this.f34495G3)) {
            zEquals = TEnum.equals(this.f34495G3.status, "matched");
        } else {
            zEquals = (NullChecker.m82486a(this.f34628j2) && NullChecker.m82486a(this.f34628j2.localRelationship)) ? TEnum.equals(this.f34628j2.localRelationship.state, "matched") : false;
        }
        return ("likers".equals(this.f34671t3) || m53412ba() || zEquals || "from_boost_refactor".equals(this.f34671t3)) ? false : true;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: X1 */
    public boolean mo53385X1() {
        return this.f34568V1;
    }

    /* JADX INFO: renamed from: X8 */
    public final String m53386X8() {
        long jM174454o = this.f34658q2 - pzi0.m174454o();
        if (jM174454o <= 0) {
            return "00.00.00";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH.mm.ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date date = new Date();
        date.setTime(jM174454o);
        return simpleDateFormat.format(date);
    }

    /* JADX INFO: renamed from: X9 */
    public final boolean m53387X9() {
        return TextUtils.equals(this.f34671t3, "home_card") && getArguments().getBoolean("long_time_no_see");
    }

    /* JADX INFO: renamed from: Xa */
    public final /* synthetic */ void m53388Xa(View view) {
        tvn.m192813a(OMSDialogPositon.p_suggest_user_profile_info_view, this.f34628j2);
        CoreModule.m30934Q().startAudienceLive(act(), CoreModule.m30934Q().getUserLiveId(this.f34628j2.f56859id), "suggest-card", null);
        CoreModule.f18264c.f20405m0.m32096d8(this.f34628j2.f56859id);
        mo52296j3(SwipeDirection.RIGHT.getValue());
    }

    /* JADX INFO: renamed from: Xb */
    public final /* synthetic */ void m53389Xb() {
        o1j0.m165651y("对方状态异常");
        act().m68056e2();
    }

    /* JADX INFO: renamed from: Xc */
    public final /* synthetic */ void m53390Xc(Conversation conversation) {
        bnl0.m105524M(this.f34572W0, false);
    }

    /* JADX INFO: renamed from: Xd */
    public final void m53391Xd(boolean z) {
        if (m53328P9(this.f34671t3) || m53321O9()) {
            this.f34602c4 = this.f34628j2;
            if (!CoreModule.m30932N().mo61516Wm() || m53501qa()) {
                return;
            }
            if (m53451ia()) {
                this.f34594a4 = false;
                this.f34623i1.setBackground(act().getResources().getDrawable(dbc0.f87418si));
                this.f34627j1.setImageDrawable(act().getResources().getDrawable(dbc0.f87644zi));
                boolean zM53474ma = m53474ma();
                VLinear vLinear = this.f34677v1;
                if (zM53474ma) {
                    bnl0.m105524M(vLinear, true);
                    m53312Md(true);
                    return;
                } else {
                    if (NullChecker.m82486a(vLinear)) {
                        bnl0.m105524M(this.f34677v1, false);
                    }
                    bnl0.m105524M(this.f34619h1, true);
                    m53312Md(false);
                    return;
                }
            }
            this.f34594a4 = true;
            this.f34623i1.setBackground(act().getResources().getDrawable(dbc0.f87036gu));
            this.f34627j1.setImageDrawable(act().getResources().getDrawable(dbc0.f87201m));
            boolean zM53474ma2 = m53474ma();
            VLinear vLinear2 = this.f34677v1;
            if (zM53474ma2) {
                bnl0.m105524M(vLinear2, true);
                m53312Md(true);
            } else {
                if (NullChecker.m82486a(vLinear2)) {
                    bnl0.m105524M(this.f34677v1, false);
                }
                bnl0.m105524M(this.f34619h1, true);
                m53312Md(false);
            }
        }
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: Y0 */
    public ViewGroup mo52272Y0() {
        return this.f34566V;
    }

    /* JADX INFO: renamed from: Y8 */
    public final void m53392Y8() {
        if (m53479na() || TextUtils.equals(this.f34671t3, "from_portrait_like_list")) {
            return;
        }
        if (!(NullChecker.m82486a(this.f34483E3) && this.f34483E3.showCountdownSendMsg) && CoreModule.m30932N().mo61451Co()) {
            duringCreated(CoreModule.f18264c.f20420r0.m35080C5(this.f34642m3)).subscribe(psd0.m173597H(new y20() { // from class: l.yca0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f198400a.m53296Ka((GreetingPermission) obj);
                }
            }, new y20() { // from class: l.zca0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ProfileListFrag.m53159j5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y9 */
    public boolean m53393Y9() {
        if (TextUtils.equals(this.f34671t3, "from_meet_feed")) {
            return true;
        }
        return CoreModule.m30932N().mo61451Co() && m53400Z9();
    }

    /* JADX INFO: renamed from: Ya */
    public final /* synthetic */ void m53394Ya(View view) {
        if (m53488oa()) {
            i4g0.m138520r("e_push_profile_like", "p_push_profile");
        }
        i4g0.m138523u(MatchScData.ModuleId.mid_e_likeButton, pageId(), jyb.m147494Y("moments_user_id", this.f34642m3));
        boolean zM53488oa = m53488oa();
        VFrame_Shadow vFrame_Shadow = this.f34532O0;
        if (zM53488oa) {
            vFrame_Shadow.setClickable(true);
        } else {
            vFrame_Shadow.setClickable(false);
        }
        mo52296j3(SwipeDirection.RIGHT.getValue());
    }

    /* JADX INFO: renamed from: Yb */
    public final /* synthetic */ void m53395Yb(uxj0 uxj0Var) {
        RiskOtherData riskOtherDataNew_ = RiskOtherData.new_();
        riskOtherDataNew_.limited = false;
        riskOtherDataNew_.type = "test";
        riskOtherDataNew_.text = "近期發佈過疑似廣告信息";
        m53278Hd(riskOtherDataNew_);
        ((fy90) this.f34534O2).m128078k0("为了您的社交体验及财产安全，请先互相了解建立信任后再添加其他平台好友");
    }

    /* JADX INFO: renamed from: Yc */
    public final /* synthetic */ void m53396Yc(int i, View view) {
        if (i == m189086i2().pictures.size()) {
            aw90.m100562F().f73701a.pictures = this.f34628j2.pictures;
        } else {
            aw90.m100562F().f73701a.pictures = jyb.m147522n(m189086i2().pictures, new qcj() { // from class: l.h8a0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Media) obj).status, "normal"));
                }
            });
        }
        m53477md();
    }

    /* JADX INFO: renamed from: Yd */
    public final void m53397Yd() {
        String str;
        Boolean boolValueOf = Boolean.valueOf(!rbb0.m180747t());
        String str2 = this.f34671t3;
        str2.getClass();
        switch (str2) {
            case "home_moment_theme_card":
            case "home_card":
                str = "profile";
                break;
            case "photo_album_feed_from_nearby_falls_feed":
                str = "nearby";
                break;
            case "from_meet_picks_card":
            case "from_meet_picks_feed":
            case "from_new_meet_picks_feed":
            case "from_meet_profile":
            case "from_meet_feed":
                str = "meet";
                break;
            case "liked_users":
                boolValueOf = Boolean.valueOf(!joa.m146386f4());
                str = "ilike";
                break;
            case "photo_album_feed_from_like":
                str = "like";
                break;
            case "photo_album_feed_from_emotion":
                str = Emotion.TYPE;
                break;
            default:
                str = "other";
                break;
        }
        sfj0.m185596c(MatchScData.ModuleId.mid_e_superlikeButton, pageId(), sfj0.C20032a.m185615h("moments_user_id", this.f34642m3), sfj0.C20032a.m185616i("is_privileged", boolValueOf.booleanValue()), sfj0.C20032a.m185615h("showfrom_superlike", str));
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: Z */
    public void mo53398Z(final int i) {
        this.f34476D2.mo168208a(new x20() { // from class: l.cca0
            @Override // p153l.x20
            public final void call() {
                this.f80900a.m53339Qc(i);
            }
        });
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: Z1 */
    public boolean mo53399Z1() {
        if (!this.f34683w3 && (!CoreModule.m30934Q().mo68438a().mo134409a() || !this.f34679v3)) {
            if (CoreModule.m30932N().mo61490Pm()) {
                return false;
            }
            if (!"photo_album_feed_from_nearby_focus".equals(this.f34671t3) && !"photo_album_feed_from_nearby_falls_feed".equals(this.f34671t3) && !"photo_album_feed_from_like".equals(this.f34671t3) && !"from_recommend_like".equals(this.f34671t3) && !"photo_album_feed_from_emotion".equals(this.f34671t3) && !"from_portrait_like_list".equals(this.f34671t3) && !"form_my_pet".equals(this.f34671t3) && !"chat_group".equals(this.f34671t3) && !"chat_group_anonymity".equals(this.f34671t3) && !"group_notification".equals(this.f34671t3) && !"group_notification_anonymity".equals(this.f34671t3) && !"moment_visitor".equals(this.f34671t3) && !"from_mew_tags".equals(this.f34671t3) && !"from_literature_third".equals(this.f34671t3) && !"photo_album_feed_from_discover_discussion".equals(this.f34671t3) && !"photo_album_feed_from_activity".equals(this.f34671t3) && !"photo_album_feed_viewers".equals(this.f34671t3) && !"photo_album_feed_from_discover_dating".equals(this.f34671t3) && !"photo_album_feed_from_activity_tab_one".equals(this.f34671t3) && !"photo_album_feed_from_activity_tab_two".equals(this.f34671t3) && !"photo_album_feed_from_search_result".equals(this.f34671t3) && !"photo_album_feed_from_poi_aggregation".equals(this.f34671t3)) {
                return false;
            }
        }
        return (this.f34646n3 || this.f34650o3) ? false : true;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: Z2 */
    public int mo52275Z2() {
        MediaReorderCards mediaReorderCards = this.f34635k4.f105078v;
        if (!NullChecker.m82486a(mediaReorderCards)) {
            return 0;
        }
        if (mediaReorderCards.m51994h(0).m51977n()) {
            CrashHelper.m82479c(new NullPointerException("The first pic cannot be empty！"));
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 6 && !mediaReorderCards.m51994h(i2).m51977n(); i2++) {
            arrayList.add(mediaReorderCards.m51994h(i2).f33824N);
            if (!TEnum.equals(mediaReorderCards.m51994h(i2).f33824N.status, "normal")) {
                i++;
            }
        }
        int size = arrayList.size();
        if (!NullChecker.m82486a(aw90.m100562F().f73701a)) {
            CrashHelper.m82479c(new NullPointerException("ProfileListFrag editingUser is null when edit pic"));
            aw90.m100562F().f73701a = CoreModule.f18264c.f20381e0.m116600p9().mo225055clone();
        }
        if (size > 0) {
            aw90.m100562F().f73701a.pictures = arrayList;
        } else if (aw90.m100562F().f73701a.pictures.isEmpty()) {
            aw90.m100562F().f73701a.pictures = this.f34628j2.pictures;
        }
        if (size <= 6) {
            m53138de(size, null, mediaReorderCards);
        }
        return i;
    }

    /* JADX INFO: renamed from: Z9 */
    public boolean m53400Z9() {
        return TextUtils.equals(this.f34671t3, "from_meet_picks_feed") || TextUtils.equals(this.f34671t3, "from_meet_picks_card");
    }

    /* JADX INFO: renamed from: Za */
    public final /* synthetic */ void m53401Za(View view) {
        if (m53488oa()) {
            i4g0.m138520r("e_push_profile_dislike", "p_push_profile");
        }
        i4g0.m138523u("e_dislikeButton", pageId(), jyb.m147494Y("moments_user_id", this.f34642m3));
        mo52296j3(SwipeDirection.LEFT.getValue());
    }

    /* JADX INFO: renamed from: Zb */
    public final /* synthetic */ void m53402Zb(CoreData coreData) {
        if (NullChecker.m82486a(coreData)) {
            if (NullChecker.m82486a(coreData.userRisk)) {
                m53278Hd(coreData.userRisk);
            }
            if (!NullChecker.m82486a(coreData.descriptionRisk) || TextUtils.isEmpty(coreData.descriptionRisk.text)) {
                return;
            }
            dy90 dy90Var = this.f34534O2;
            if (dy90Var instanceof fy90) {
                ((fy90) dy90Var).m128078k0(coreData.descriptionRisk.text);
            }
        }
    }

    /* JADX INFO: renamed from: Zc */
    public final /* synthetic */ void m53403Zc(Media media, int i) {
        if (media instanceof Video) {
            m53372V8(i).m51897z1((Video) media);
        } else {
            m53372V8(i).m51891w1((Picture) media);
        }
        mo52275Z2();
        if (gra.m131756u2()) {
            for (int i2 = 0; i2 < 6; i2++) {
                m53372V8(i2).m51827E1(i2, "p_edit_profile_view");
            }
        }
    }

    /* JADX INFO: renamed from: Zd */
    public final void m53404Zd(int i) {
        if (i > 0) {
            m53369Ud(i);
        } else {
            m53477md();
        }
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: a0 */
    public boolean mo53405a0() {
        return this.f34573W1;
    }

    /* JADX INFO: renamed from: a9 */
    public boolean m53406a9() {
        return (TEnum.equals(this.f34467B3, "unknown_") && !this.f34659q3 && this.f34667s3) || TEnum.equals(this.f34467B3, "matched");
    }

    /* JADX INFO: renamed from: aa */
    public final boolean m53407aa() {
        return TextUtils.equals(this.f34671t3, "from_recommend_like") || TextUtils.equals(this.f34671t3, "conversation_view") || TextUtils.equals(this.f34671t3, "messages_title") || TextUtils.equals(this.f34671t3, CoreStaticData.ProfileFromType.MESSAGE_ICE_BREAK_DIALOG) || TextUtils.equals(this.f34671t3, "messages_cover") || TextUtils.equals(this.f34671t3, "messages_friend_comment_toast") || TextUtils.equals(this.f34671t3, "messages_thumbnail_left");
    }

    /* JADX INFO: renamed from: ab */
    public final /* synthetic */ void m53408ab(View view) {
        if (d79.m114662U() && "liked_users".equals(this.f34671t3) && NullChecker.m82486a(CoreModule.f18264c.f20370a1.m180098m(this.f34642m3))) {
            non.m164145g(act(), new non.C18915a(this.f34628j2.f56859id, ""), "");
        } else {
            if (spl0.m187374Z()) {
                bpe0.m105814f().m105816c(this.f34628j2.f56859id, 1, true, OMSDialogPositon.p_suggest_user_profile_info_view);
            }
            m53454id();
        }
    }

    /* JADX INFO: renamed from: ac */
    public final /* synthetic */ void m53409ac(Bundle bundle) {
        if (this.f34646n3) {
            if (this.f34650o3) {
                act().setTitle(m21603x4(R$string.f18826Rj));
            } else {
                act().setTitle(m21603x4(R$string.f19867zi));
            }
        }
        CoreModule.f18264c.f20381e0.f89336u0.put(Boolean.FALSE);
    }

    @Override // p153l.nol
    public /* bridge */ /* synthetic */ Activity act() {
        return super.act();
    }

    /* JADX INFO: renamed from: ae */
    public void m53410ae() {
        sfj0.m185598e("e_send_message", OMSDialogPositon.p_suggest_user_profile_info_view, pf60.m172085a("is_reply", 0), pf60.m172085a("is_match", 1), pf60.m172085a("owner_id", this.f34628j2.f56859id));
        act().startActivity(MessagesAct.m50126k2(act(), this.f34628j2.f56859id, true, false));
    }

    /* JADX INFO: renamed from: b9 */
    public final void m53411b9() {
        View viewM53969G0 = this.f34466B2.m53969G0(this.f34466B2.m53984O0());
        if (NullChecker.m82486a(viewM53969G0) && !(viewM53969G0 instanceof PictureView)) {
            this.f34466B2.m53987P1();
        }
        if (aia0.m97972m().m97980o()) {
            aia0.m97972m().m97976D(false);
            int iM53992S0 = this.f34466B2.m53992S0() - 1;
            if (iM53992S0 <= 0 || !NullChecker.m82486a(this.f34628j2) || this.f34628j2.pictures.size() <= iM53992S0) {
                return;
            }
            aia0.m97972m().m97974B(this.f34628j2.pictures.get(iM53992S0).url);
        }
    }

    /* JADX INFO: renamed from: ba */
    public boolean m53412ba() {
        return TextUtils.equals(this.f34671t3, "from_new_meet_likers");
    }

    /* JADX INFO: renamed from: bb */
    public final /* synthetic */ void m53413bb(Boolean bool) {
        eu4.m122523b().m122532j(bool.booleanValue());
        mo52306o();
    }

    /* JADX INFO: renamed from: bc */
    public final /* synthetic */ void m53414bc(View view) {
        m53410ae();
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: c0 */
    public int mo53415c0() {
        return this.f34466B2.m53981N0();
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: c3 */
    public boolean mo53416c3(User user) {
        if (!d79.m114675e0() || !NullChecker.m82486a(user)) {
            return false;
        }
        p6w p6wVar = p6w.INSTANCE;
        if (p6wVar.m171055C(user.f56859id)) {
            return true;
        }
        if (!user.isLoveBuzz()) {
            return false;
        }
        Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(user.f56859id);
        if (p6wVar.m171068o(conversationM34219zp)) {
            return p6wVar.m171055C(user.f56859id);
        }
        if (p6wVar.m171056D(conversationM34219zp)) {
            return false;
        }
        return p6wVar.m171066m(conversationM34219zp);
    }

    /* JADX INFO: renamed from: c9 */
    public final void m53417c9(String str) {
        str.getClass();
        switch (str) {
            case "school":
                LoopFragmentFactory.m52658S(m189086i2(), mo52249J1(), LoopInputType.SCHOOL);
                break;
            case "photo":
                LoopFragmentFactory.m52658S(m189086i2(), mo52249J1(), LoopInputType.PHOTO);
                break;
            case "industry":
                LoopFragmentFactory.m52658S(m189086i2(), mo52249J1(), LoopInputType.INDUSTRY);
                break;
            case "company":
                LoopFragmentFactory.m52658S(m189086i2(), mo52249J1(), LoopInputType.COMPANY);
                break;
            case "about_me":
                LoopFragmentFactory.m52658S(m189086i2(), mo52249J1(), LoopInputType.ABOUT_ME);
                break;
        }
    }

    /* JADX INFO: renamed from: ca */
    public boolean m53418ca() {
        return TextUtils.equals(this.f34671t3, "from_new_meet_picks_feed");
    }

    /* JADX INFO: renamed from: cb */
    public final /* synthetic */ void m53419cb(uxj0 uxj0Var) {
        m53022C8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: cc */
    public final /* synthetic */ void m53420cc(pf60 pf60Var) {
        User user = (User) pf60Var.f152156a;
        this.f34628j2 = user;
        if (User.isMatched(user) && NullChecker.m82486a(this.f34480E0)) {
            bnl0.m105524M(this.f34480E0, false);
            bnl0.m105524M(this.f34599c1, false);
        }
        bnl0.m105509E0(this.f34603d1, new View.OnClickListener() { // from class: l.u7a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177889a.m53414bc(view);
            }
        });
        m53287J8();
        m53235Ad(false);
    }

    /* JADX INFO: renamed from: ce */
    public void m53421ce() {
        pza0.m174356h("android_back");
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: d1 */
    public int mo53422d1() {
        int i = this.f34553S1;
        this.f34553S1 = -1;
        return i;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        ue60 ue60VarM201037d = ve60.m201037d();
        this.f34626i4 = ue60VarM201037d == null ? "" : ue60VarM201037d.m195739c();
        duringCreated(this.f34641m2).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.hba0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108579a.m53419cb((uxj0) obj);
            }
        }, new y20() { // from class: l.rba0
            @Override // p153l.y20
            public final void call(Object obj) {
                CrashHelper.m82479c((Throwable) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.sba0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f167125a.m53425db();
            }
        }).filter(new qcj() { // from class: l.tba0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ProfileListFrag.m53071P5((Boolean) obj);
            }
        }).flatMap(new qcj() { // from class: l.uba0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.timer(450L, TimeUnit.MILLISECONDS);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.vba0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183218a.m53431eb((Long) obj);
            }
        }, new y20() { // from class: l.xba0
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileListFrag.m53199s5((Throwable) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new C8860e()));
        duringCreated(new pcj() { // from class: l.yba0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f198288a.m53436fb();
            }
        }).filter(new qcj() { // from class: l.zba0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ProfileListFrag.m53211v5((Boolean) obj);
            }
        }).flatMap(new qcj() { // from class: l.aca0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.timer(450L, TimeUnit.MILLISECONDS);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.iba0
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20294B0.m32620p4(CoreModule.m30929H().userId());
            }
        }));
        creates(new y20() { // from class: l.jba0
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileListFrag.m53032F5((Bundle) obj);
            }
        }, new x20() { // from class: l.kba0
            @Override // p153l.x20
            public final void call() {
                ProfileListFrag.m53119a6();
            }
        });
        creates(new y20() { // from class: l.mba0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135637a.m53441gb((Bundle) obj);
            }
        });
        creates(new y20() { // from class: l.nba0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141082a.m53452ib((Bundle) obj);
            }
        });
        creates(new y20() { // from class: l.oba0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145962a.m53463kb((Bundle) obj);
            }
        });
        creates(new y20() { // from class: l.pba0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151364a.m53468lb((Bundle) obj);
            }
        });
        creates(new y20() { // from class: l.qba0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156464a.m53480nb((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d9 */
    public final void m53423d9() {
        if (NullChecker.m82486a(this.f34462A3)) {
            this.f34485F.removeView(this.f34462A3);
            this.f34462A3 = null;
        }
    }

    /* JADX INFO: renamed from: da */
    public boolean m53424da() {
        return TextUtils.equals(this.f34671t3, "from_new_meet_see_feed");
    }

    /* JADX INFO: renamed from: db */
    public final /* synthetic */ C22421c m53425db() {
        return C22421c.just(Boolean.valueOf(!this.f34650o3 && m53406a9()));
    }

    /* JADX INFO: renamed from: dc */
    public final /* synthetic */ void m53426dc(uxj0 uxj0Var) {
        if (m53488oa()) {
            bnl0.m105524M(this.f34603d1, false);
        }
    }

    /* JADX INFO: renamed from: dd */
    public final boolean m53427dd() {
        return d79.m114663V();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        if ((act() instanceof EditProfileAct) || (act() instanceof ProfileAct_CustomTransition)) {
            return false;
        }
        act();
        return false;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: e2 */
    public void mo53428e2() {
        this.f34466B2.mo168208a(new x20() { // from class: l.s9a0
            @Override // p153l.x20
            public final void call() {
                this.f166917a.m53301La();
            }
        });
    }

    /* JADX INFO: renamed from: e9 */
    public final void m53429e9() {
        if ((!m53056L9() && !"liked_users_anchor".equals(this.f34671t3) && !"from_greet_act".equals(this.f34671t3)) || this.f34659q3 || TextUtils.equals(this.f34642m3, CoreModule.m30929H().userId())) {
            return;
        }
        duringCreated(m53443gd()).subscribe(psd0.m173596G(new y20() { // from class: l.d7a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85496a.m53309Ma((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.m30932N().getMomentsPreviousSub()).subscribe(psd0.m173596G(new y20() { // from class: l.e7a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92416a.m53316Na((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ea */
    public boolean m53430ea() {
        return TextUtils.equals(this.f34671t3, "from_picks");
    }

    /* JADX INFO: renamed from: eb */
    public final /* synthetic */ void m53431eb(Long l2) {
        if (mo53326P(this.f34642m3)) {
            return;
        }
        CoreModule.f18264c.f20381e0.m116527W9(this.f34642m3).subscribe(psd0.m173597H(new y20() { // from class: l.v7a0
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileListFrag.m53047J5((uxj0) obj);
            }
        }, new C8859d()));
    }

    /* JADX INFO: renamed from: ec */
    public final /* synthetic */ Boolean m53432ec(String str) {
        return Boolean.valueOf(TextUtils.equals("from_city_center_conv_banner", this.f34671t3));
    }

    /* JADX INFO: renamed from: ed */
    public final boolean m53433ed(String str) {
        if (!d79.m114663V() || TextUtils.equals("likers", str) || TextUtils.equals("from_mew_tags", str) || TextUtils.equals("from_portrait_like_list", str) || TextUtils.equals("from_literature_third", str) || CoreModule.f18264c.f20405m0.m32023L6(this.f34642m3) || CoreModule.f18264c.f20405m0.m32027M6(this.f34642m3) || TextUtils.equals("from_boost_refactor", str) || TextUtils.equals("live_user_card", str) || m53380W9() || m53356T9()) {
            return false;
        }
        return !IntlCountryCodeController.m29118o() || nmp.m163836e();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        creates(new y20() { // from class: l.zaa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203546a.m53409ac((Bundle) obj);
            }
        });
        duringCreated(CoreModule.m30932N().getMomentLikeChangedSub()).subscribe(psd0.m173596G(new y20() { // from class: l.bba0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75780a.m53420cc((pf60) obj);
            }
        }));
        duringCreated(C4901p.f20821f0).subscribe(psd0.m173596G(new y20() { // from class: l.cba0
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileListFrag.m53146f8((uxj0) obj);
            }
        }));
        duringCreated(C4901p.f20822g0).subscribe(psd0.m173596G(new y20() { // from class: l.dba0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85973a.m53426dc((uxj0) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20378d0.m151460j3()).subscribe(psd0.m173591B());
        m53455j9();
        duringCreated(CoreModule.f18264c.f20420r0.f20780s0).filter(new qcj() { // from class: l.eba0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f92840a.m53432ec((String) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.fba0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98056a.m53437fc((String) obj);
            }
        }));
        if (d79.m114663V()) {
            CoreModule.f18264c.f20337P1.f92199R.subscribe(psd0.m173596G(new y20() { // from class: l.gba0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f103070a.m53442gc((uxj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f9 */
    public final void m53434f9() {
        if ((m53056L9() || "liked_users_anchor".equals(this.f34671t3)) && !this.f34659q3 && !TextUtils.equals(this.f34642m3, CoreModule.m30929H().userId())) {
            bnl0.m105509E0(this.f34603d1, new View.OnClickListener() { // from class: l.l7a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f130333a.m53322Oa(view);
                }
            });
            if (TextUtils.equals(this.f34671t3, "from_portrait_like_list")) {
                bnl0.m105509E0(this.f34640m1, new View.OnClickListener() { // from class: l.m7a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f135065a.m53329Pa(view);
                    }
                });
                bnl0.m105509E0(this.f34636l1, new View.OnClickListener() { // from class: l.o7a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f145254a.m53337Qa(view);
                    }
                });
            }
            bnl0.m105509E0(this.f34619h1, new View.OnClickListener() { // from class: l.p7a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f150909a.m53344Ra(view);
                }
            });
        }
        if (spl0.m187375a0() && (("home_card".equals(this.f34671t3) || "home_moment_theme_card".equals(this.f34671t3)) && !CoreModule.f18264c.f20381e0.m116549c8() && !CoreModule.f18264c.f20381e0.m116593na().isJailed() && a5i0.m96175v0() > 0 && !p6d0.m170847d0().f150817j.contains(userId()) && p6d0.m170847d0().m170851f0())) {
            this.f34497H0.setText(String.valueOf(a5i0.m96175v0()));
            l51.m152888H(act(), new Runnable() { // from class: l.q7a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f155942a.m53351Sa();
                }
            }, 1000L);
        }
        VLinear vLinear = this.f34460A1;
        if (vLinear != null && bnl0.m105529O0(vLinear) && C8618a.m48771w().m48785N()) {
            C8618a.m48771w().f31323a = true;
            this.f34460A1.post(new Runnable() { // from class: l.r7a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f161595a.m53357Ta();
                }
            });
        } else if (c8d0.m108356f0()) {
            if (("home_card".equals(this.f34671t3) || "home_moment_theme_card".equals(this.f34671t3)) && z5h0.m218675j().m218696q(this.f34642m3)) {
                z5h0.m218675j().m218684D(this, this.f34628j2, this.f34486F0, 2000);
            }
        }
    }

    /* JADX INFO: renamed from: fa */
    public boolean m53435fa() {
        return TextUtils.equals(this.f34671t3, "push_like");
    }

    /* JADX INFO: renamed from: fb */
    public final /* synthetic */ C22421c m53436fb() {
        return C22421c.just(Boolean.valueOf(this.f34646n3));
    }

    /* JADX INFO: renamed from: fc */
    public final /* synthetic */ void m53437fc(String str) {
        if (TextUtils.equals(str, this.f34642m3)) {
            m53235Ad(false);
        }
    }

    /* JADX INFO: renamed from: fd */
    public <T> T m53438fd(T t) {
        if (t != null) {
            return t;
        }
        olk0.m168132a();
        return null;
    }

    @Override // p153l.t3m
    public String from() {
        return this.f34671t3;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: g3 */
    public boolean mo52289g3() {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INIT_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        super.mo21585g4(bundle);
        m53529ud();
        m53223x9();
        m53122ad();
        if (NullChecker.m82486a(act().getSupportActionBar())) {
            act().getSupportActionBar().mo102186m();
        }
        if (mo52302m0()) {
            m53268G9();
        } else {
            m53473m9();
        }
        m53450i9();
        m53434f9();
        m53429e9();
        m53249D9();
        m53532v9();
        m53294K8();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        m53360Td();
        m53391Xd(true);
        m53506r9();
        m53219w9();
        if (m53488oa()) {
            m53239B9();
        }
        if (CoreModule.m30932N().mo61469K8()) {
            CoreModule.m30932N().mo61452Cr(act(), userId(), new y20() { // from class: l.c7a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f80100a.m53448hc((Boolean) obj);
                }
            });
        }
        m53487o9();
        m53274H9();
        if (m53380W9()) {
            m53500q9();
        }
        if (s75.m184965m() && TextUtils.equals("from_greet_act", this.f34671t3)) {
            m53235Ad(false);
        }
        m53244C9();
    }

    /* JADX INFO: renamed from: g9 */
    public void m53439g9() {
        this.f34683w3 = getArguments().getBoolean("canShowFollowButton");
        this.f34510J3 = getArguments().getInt("pic_index", -1);
        this.f34642m3 = getArguments().getString("user_id");
        this.f34671t3 = getArguments().getString("from");
        if (TextUtils.isEmpty(this.f34642m3)) {
            CrashHelper.m82480d(new NullPointerException("profilelistFrag_initArguments_userid_null,from:" + this.f34671t3), 1000);
            act().m68056e2();
            return;
        }
        this.f34646n3 = this.f34642m3.equals(CoreModule.m30929H().userId());
        this.f34650o3 = getArguments().getBoolean("is_edit");
        this.f34655p3 = getArguments().getString("input_type");
        this.f34659q3 = getArguments().getBoolean("show_buttons");
        this.f34667s3 = getArguments().getBoolean("no_showbuttons_infofromlocal", true);
        this.f34472C3 = getArguments().getInt("button_flag", 273);
        this.f34477D3 = getArguments().getBoolean("with_superlike", false) && this.f34659q3;
        this.f34467B3 = RelationshipStatus.get(getArguments().getString("relationship_status"));
        this.f34540P3 = getArguments().getString("gift_msg_id");
        this.f34483E3 = (ProfileCreateData) getArguments().getSerializable("profile_create_data");
        this.f34555S3 = (CityCData) getArguments().getSerializable("city_centre_data");
        if ("live_profile_voice_mask_mode".equals(this.f34671t3)) {
            this.f34663r3 = false;
        } else {
            this.f34663r3 = !this.f34650o3;
        }
        if (TextUtils.equals(this.f34671t3, "liked_users") || m53350S9() || m53430ea() || m53393Y9() || m53400Z9()) {
            if (NullChecker.m82486a(CoreModule.f18264c.f20367Z0.m210760C3(this.f34642m3))) {
                this.f34495G3 = CoreModule.f18264c.f20367Z0.m210760C3(this.f34642m3);
                getArguments().putSerializable("liked_user", this.f34495G3);
            } else if (NullChecker.m82486a(getArguments().getSerializable("liked_user"))) {
                this.f34495G3 = (LikedUser) getArguments().getSerializable("liked_user");
            }
        }
        if (d79.m114685j0() && fcp.m125029p(this.f34642m3)) {
            this.f34472C3 = 257;
        }
        if (NullChecker.m82486a(CoreModule.m30930K().getUserById(this.f34642m3))) {
            this.f34505I3 = CoreModule.m30930K().getUserById(this.f34642m3);
            getArguments().putSerializable("saved_user", this.f34505I3);
        } else if (NullChecker.m82486a(getArguments().getSerializable("saved_user"))) {
            this.f34505I3 = (User) getArguments().getSerializable("saved_user");
        }
        if (mo53319O1()) {
            CoreBusinessModule.f18256g.m191629b().f169296b = this.f34642m3;
        }
        CoreBusinessModule.f18256g.m191629b().f169297c = this.f34505I3;
        CoreBusinessModule.f18256g.m191629b().f169298d = this.f34505I3;
        CoreBusinessModule.f18256g.m191629b().f169299e = this.f34505I3;
        this.f34675u3 = getArguments().getBoolean("open_media_picker");
        this.f34679v3 = getArguments().getBoolean("from_gp_live");
        if (m189087s() && TextUtils.equals(this.f34671t3, "preview_card")) {
            this.f34638l3 = true;
            this.f34538P1 = (User) getArguments().getSerializable("preview_user_info");
        }
        Serializable serializable = getArguments().getSerializable("params_extra_map_data");
        if (serializable instanceof HashMap) {
            this.f34662r2 = (HashMap) serializable;
        }
        this.f34687x3 = getArguments().getInt("pushReason");
        this.f34691y3 = getArguments().getString("pushTag");
        if (this.f34646n3 && m53488oa()) {
            act().m68056e2();
        }
    }

    /* JADX INFO: renamed from: ga */
    public final boolean m53440ga() {
        return tnt.m191964a(this.f34671t3);
    }

    /* JADX INFO: renamed from: gb */
    public final /* synthetic */ void m53441gb(Bundle bundle) {
        if (this.f34646n3) {
            if (this.f34650o3) {
                act().setTitle(m21603x4(R$string.f18826Rj));
            } else {
                act().setTitle(m21603x4(R$string.f19867zi));
            }
        }
        CoreModule.f18264c.f20381e0.f89336u0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: gc */
    public final /* synthetic */ void m53442gc(uxj0 uxj0Var) {
        if (act() == null || act().isFinishing()) {
            return;
        }
        m52256N6();
    }

    /* JADX INFO: renamed from: gd */
    public final C22421c<Boolean> m53443gd() {
        return CoreModule.f18264c.f20384f0.m33823Ue(this.f34642m3).map(new qcj() { // from class: l.i8a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Conversation) obj) != null);
            }
        });
    }

    @Override // p153l.q3m
    @Nullable
    /* JADX INFO: renamed from: h2 */
    public View mo53444h2() {
        return this.f34652p0;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: h3 */
    public void mo52291h3() {
        duringCreated(CoreModule.f18264c.f20381e0.m116527W9(userId()).flatMap(new qcj() { // from class: l.f7a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20424s1.m35372s3();
            }
        }).map(new qcj() { // from class: l.g7a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f102522a.m53545xc((List) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.h7a0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108104a.m53555yc((pf60) obj);
            }
        }, new y20() { // from class: l.i7a0
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileListFrag.m53215w5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h9 */
    public final void m53445h9() {
        if (TextUtils.equals(this.f34671t3, "from_auto_scroll_to_question")) {
            l51.m152889I(this, new Runnable() { // from class: l.jaa0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f118966a.m53366Ua();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: ha */
    public final boolean m53446ha() {
        User user;
        if (this.f34642m3 != null && (user = this.f34628j2) != null && !user.isMe() && !this.f34628j2.isTeamAccount()) {
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(this.f34642m3);
            if ((NullChecker.m82486a(conversationM33859Xe) && !TEnum.equals(conversationM33859Xe.status, "dismissed")) || User.isMatched(mo52252K2())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: hb */
    public final /* synthetic */ Boolean m53447hb() {
        if (this.f34650o3 && this.f34675u3) {
            ((ProfileAct) act()).m51948Z2(0);
            this.f34675u3 = false;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: hc */
    public final /* synthetic */ void m53448hc(Boolean bool) {
        this.f34590Z3 = bool.booleanValue();
    }

    /* JADX INFO: renamed from: hd */
    public void m53449hd() {
        if (this.f34608e2) {
            o1j0.m165636j("网络不给力，稍后再试吧");
        } else {
            m53349S8(null, null, false);
            i4g0.m138523u(MatchScData.ModuleId.mid_e_likeButton, pageId(), jyb.m147494Y("moments_user_id", this.f34642m3));
        }
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: i3 */
    public int mo52294i3() {
        return this.f34618g4;
    }

    /* JADX INFO: renamed from: i9 */
    public final void m53450i9() {
        m53256E9();
        if (TextUtils.equals("from_city_center_boost_cover", this.f34671t3)) {
            bnl0.m105524M(this.f34562U0, false);
            bnl0.m105524M(this.f34587Z0, false);
            return;
        }
        if (TextUtils.equals("from_city_center_conv_banner", this.f34671t3) && !TextUtils.equals(this.f34642m3, CoreModule.m30929H().userId())) {
            bnl0.m105524M(this.f34562U0, false);
            bnl0.m105524M(this.f34587Z0, true);
            i4g0.m138526x("e_user_info_greet_to_city_cover", pageId());
            bnl0.m105509E0(this.f34595b1, new View.OnClickListener() { // from class: l.eca0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f93025a.m53374Va(view);
                }
            });
            return;
        }
        if (this.f34659q3) {
            if (NullChecker.m82486a(this.f34628j2) && CoreModule.f18264c.f20405m0.m32023L6(this.f34628j2.f56859id)) {
                bnl0.m105509E0(this.f34552S0, new View.OnClickListener() { // from class: l.fca0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f98207a.m53381Wa(view);
                    }
                });
                bnl0.m105509E0(this.f34557T0, new View.OnClickListener() { // from class: l.gca0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f103553a.m53388Xa(view);
                    }
                });
                return;
            }
            if (("home_card".equals(this.f34671t3) || "home_moment_theme_card".equals(this.f34671t3) || "liked_users".equals(this.f34671t3) || "from_guess_liker_result".equals(this.f34671t3) || m53393Y9() || m53430ea() || m53400Z9() || m53424da() || m53418ca() || m53380W9()) && mo53333Q() && NullChecker.m82486a(this.f34581Y)) {
                m53556z8();
            }
            if (fcp.m125033y() && "home_card".equals(this.f34671t3) && NullChecker.m82486a(this.f34581Y)) {
                this.f34480E0.setVisibility(4);
                this.f34502I0.setVisibility(0);
                this.f34486F0 = this.f34507J0;
                this.f34492G0 = this.f34512K0;
                if (d79.m114685j0()) {
                    this.f34522M0.setButtonColorStart(Color.parseColor("#ffa067"));
                    this.f34522M0.setButtonColorEnd(Color.parseColor("#ff3f45"));
                }
            }
            this.f34532O0.setOnClickListener(new View.OnClickListener() { // from class: l.ica0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f114292a.m53394Ya(view);
                }
            });
            this.f34586Z.setOnClickListener(new View.OnClickListener() { // from class: l.jca0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f120035a.m53401Za(view);
                }
            });
            if ((pgj.m172246c() || nmp.m163836e() || !IntlCountryCodeController.m29118o()) && !"from_guess_liker_result".equals(this.f34671t3)) {
                boolean zM53380W9 = m53380W9();
                VFrame_Shadow vFrame_Shadow = this.f34480E0;
                if (zM53380W9) {
                    vFrame_Shadow.setVisibility(4);
                } else {
                    vFrame_Shadow.setVisibility(0);
                    this.f34480E0.setOnClickListener(new View.OnClickListener() { // from class: l.kca0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f125034a.m53408ab(view);
                        }
                    });
                    if (spl0.m187374Z() && mo53319O1()) {
                        this.f34480E0.setOnLongPressListener(new C8856a());
                    }
                }
            } else {
                this.f34480E0.setVisibility(4);
            }
            if (this.f34480E0.getVisibility() == 4) {
                this.f34502I0.setVisibility(8);
            }
            m53231A8(this.f34480E0);
            m53231A8(this.f34586Z);
            m53231A8(this.f34532O0);
        }
    }

    /* JADX INFO: renamed from: ia */
    public boolean m53451ia() {
        if (NullChecker.m82486a(this.f34602c4)) {
            return m53171la(this.f34602c4) || m53064N9(this.f34602c4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ib */
    public final /* synthetic */ void m53452ib(Bundle bundle) {
        m53504qd();
        if (this.f34650o3 && NullChecker.m82486a(bundle)) {
            m53083Rd(CoreModule.m30930K().me_());
            if (NullChecker.m82486a(aw90.m100562F().f73701a)) {
                m53253Dd(aw90.m100562F().f73701a);
                mo52250J3();
            }
        }
        bnl0.m105546b0(act().findViewById(R.id.content), new pcj() { // from class: l.t6a0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f172322a.m53447hb();
            }
        });
    }

    /* JADX INFO: renamed from: ic */
    public final /* synthetic */ void m53453ic(View view) {
        m53410ae();
    }

    /* JADX INFO: renamed from: id */
    public void m53454id() {
        if (m53488oa()) {
            i4g0.m138520r("e_push_profile_superlike", "p_push_profile");
        }
        if (!CoreModule.m30932N().mo61451Co() || !this.f34624i2 || !m53343R9()) {
            m53397Yd();
            mo52296j3(SwipeDirection.UP.getValue());
        } else {
            if (!NullChecker.m82486a(this.f34602c4)) {
                this.f34602c4 = this.f34628j2;
            }
            m53459jd();
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INFLATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        View viewM53542x8 = m53542x8(layoutInflater, viewGroup);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        return viewM53542x8;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: j3 */
    public void mo52296j3(final int i) {
        SwipeDirection swipeDirection = SwipeDirection.UP;
        if (i == swipeDirection.getValue() && h7d0.m133774m0() && !h7d0.m133773i0().getAllowUpSwipe() && a5i0.m96178w0(CoreModule.f18264c.m32487o3().superLikeLimit.remainToday()) == 0 && !qj90.m176830b(PurchaseType.TYPE_SUPERLIKE_PKG)) {
            C8927c.m54595M1(act(), "p_profile,superlike", Privilege.vip_super_like, null, null, false, this.f34628j2);
            return;
        }
        if (mo53549y2() && NullChecker.m82486a(this.f34466B2.f34901g1)) {
            ProfileImagesItemHolder profileImagesItemHolder = this.f34466B2;
            profileImagesItemHolder.m53997V0(profileImagesItemHolder.f34901g1, false);
        }
        final Intent intent = new Intent();
        intent.putExtra("currentImageIndex", this.f34466B2.m53981N0());
        if (!NullChecker.m82486a(this.f34628j2)) {
            act().m68056e2();
            return;
        }
        int iM53981N0 = this.f34466B2.m53981N0();
        int size = this.f34628j2.pictures.size();
        User user = this.f34628j2;
        if (iM53981N0 < size) {
            intent.putExtra("currentImageUrl", user.pictures.get(this.f34466B2.m53981N0()).url);
        } else {
            intent.putExtra("currentImageUrl", user.hasPic() ? this.f34628j2.m61308fp().url : "");
            CrashHelper.m82479c(new Exception("ProfileListFrag user pictures get index crash"));
        }
        if (m53393Y9() || m53400Z9() || m53418ca() || m53424da() || m53412ba() || m53365U9() || m53356T9() || m53350S9()) {
            intent.putExtra("currentUserId", this.f34628j2.f56859id);
        }
        if (m53488oa()) {
            if (NullChecker.m82486a(this.f34628j2)) {
                rgr.m181477n(act(), this.f34628j2, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), false, "home", null, new y20() { // from class: l.u8a0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f177998a.m53507ra(i, intent, (Relationship) obj);
                    }
                }, new y20() { // from class: l.f9a0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f97849a.m53513sa(i, intent, (Throwable) obj);
                    }
                }, pageId(), null, null, null);
                return;
            }
            return;
        }
        if (m53380W9()) {
            if (NullChecker.m82486a(this.f34628j2)) {
                rgr.m181477n(act(), this.f34628j2, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), false, this.f34671t3, null, new y20() { // from class: l.q9a0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f156207a.m53519ta(i, intent, (Relationship) obj);
                    }
                }, new y20() { // from class: l.baa0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f75659a.m53526ua(i, intent, (Throwable) obj);
                    }
                }, pageId(), null, null, null);
            }
        } else if (TextUtils.equals(this.f34671t3, "from_boost_refactor")) {
            if (NullChecker.m82486a(this.f34628j2)) {
                rgr.m181481r(act(), this.f34628j2, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), pageId(), new z20() { // from class: l.caa0
                    @Override // p153l.z20
                    public final void call(Object obj, Object obj2) {
                        this.f80564a.m53543xa((User) obj, (Relationship) obj2);
                    }
                });
            }
        } else if (!TextUtils.equals(this.f34671t3, "from_find_partner")) {
            act().setResult(i, intent);
            act().m68056e2();
        } else if (NullChecker.m82486a(this.f34628j2)) {
            rgr.m181477n(act(), this.f34628j2, i == SwipeDirection.RIGHT.getValue() || i == swipeDirection.getValue(), i == swipeDirection.getValue(), false, "from_find_partner", null, new y20() { // from class: l.daa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f85856a.m53553ya(i, intent, (Relationship) obj);
                }
            }, new y20() { // from class: l.faa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f97969a.m53558za(i, intent, (Throwable) obj);
                }
            }, pageId(), null, null, null);
        }
    }

    /* JADX INFO: renamed from: j9 */
    public void m53455j9() {
        if (eu4.m122523b().m122529g()) {
            act().duringCreated(CoreModule.f18264c.f20353U1.f98891S).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.lda0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f131431a.m53413bb((Boolean) obj);
                }
            }, new y20() { // from class: l.mda0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ProfileListFrag.m53098V6((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: ja */
    public boolean m53456ja() {
        Relationship relationship = this.f34602c4.localRelationship;
        return relationship == null || TEnum.equals(relationship.state, "unknown_") || TEnum.equals(this.f34602c4.localRelationship.state, "default") || TEnum.equals(this.f34602c4.localRelationship.state, RelationshipStatus.disliked);
    }

    /* JADX INFO: renamed from: jb */
    public final /* synthetic */ Boolean m53457jb() {
        if (this.f34650o3 && !TextUtils.isEmpty(this.f34655p3)) {
            m53417c9(this.f34655p3);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: jc */
    public final /* synthetic */ void m53458jc(Relationship relationship) {
        if (CoreModule.m30930K().mo31822sg(this.f34628j2.f56859id) || User.isMatched(this.f34628j2)) {
            bnl0.m105524M(this.f34603d1, true);
            bnl0.m105509E0(this.f34603d1, new View.OnClickListener() { // from class: l.n9a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f140754a.m53453ic(view);
                }
            });
            return;
        }
        if (TEnum.equals(relationship.state, "liked")) {
            if (NullChecker.m82486a(relationship.relationshipExtensions) && TEnum.equals(relationship.relationshipExtensions.relationType, RelationshipStatus.SUPERLIKED)) {
                if (this.f34666s2) {
                    bnl0.m105524M(this.f34562U0, true);
                    m53273H8();
                    return;
                }
                return;
            }
            if (!this.f34666s2) {
                bnl0.m105524M(this.f34480E0, true);
                return;
            } else {
                bnl0.m105524M(this.f34562U0, true);
                m53280I8();
                return;
            }
        }
        if (TEnum.equals(relationship.state, "superliked")) {
            if (this.f34666s2) {
                bnl0.m105524M(this.f34562U0, true);
                m53273H8();
                return;
            }
            return;
        }
        if (TEnum.equals(relationship.state, RelationshipStatus.disliked) || TEnum.equals(relationship.state, "blocked")) {
            return;
        }
        bnl0.m105524M(this.f34562U0, this.f34666s2);
        bnl0.m105524M(this.f34532O0, true);
        bnl0.m105524M(this.f34586Z, true);
        bnl0.m105524M(this.f34480E0, true);
    }

    /* JADX INFO: renamed from: jd */
    public void m53459jd() {
        if (this.f34600c2) {
            o1j0.m165636j("网络不给力，稍后再试吧");
        } else {
            m53245Ca(null, null);
            m53397Yd();
        }
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: k3 */
    public void mo53460k3() {
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "preEnterAnimStart");
        this.f34610e4 = true;
        this.f34466B2.mo168208a(new x20() { // from class: l.i9a0
            @Override // p153l.x20
            public final void call() {
                this.f113456a.m53503qc();
            }
        });
    }

    /* JADX INFO: renamed from: k9 */
    public final void m53461k9() {
        this.f34630j4.add(this.f34635k4);
        this.f34630j4.add(this.f34639l4);
        this.f34630j4.add(this.f34476D2);
        this.f34630j4.add(this.f34651o4);
        this.f34630j4.add(this.f34643m4);
        this.f34630j4.add(this.f34647n4);
        this.f34630j4.add(this.f34656p4);
        this.f34630j4.add(this.f34660q4);
        this.f34630j4.add(this.f34664r4);
        this.f34630j4.add(this.f34668s4);
        this.f34630j4.add(this.f34672t4);
        this.f34630j4.add(this.f34688x4);
    }

    /* JADX INFO: renamed from: ka */
    public final boolean m53462ka() {
        User user;
        if (TextUtils.isEmpty(this.f34642m3) || (user = this.f34628j2) == null || user.isMe()) {
            return false;
        }
        if (this.f34602c4 == null) {
            this.f34602c4 = CoreModule.m30932N().getUserById(this.f34642m3);
        }
        return CoreModule.m30932N().mo61458Ek(this.f34628j2) || CoreModule.m30932N().mo61458Ek(this.f34602c4);
    }

    /* JADX INFO: renamed from: kb */
    public final /* synthetic */ void m53463kb(Bundle bundle) {
        bnl0.m105546b0(act().findViewById(R.id.content), new pcj() { // from class: l.j7a0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f118658a.m53457jb();
            }
        });
    }

    /* JADX INFO: renamed from: kc */
    public final /* synthetic */ void m53464kc(View view) {
        m53410ae();
    }

    /* JADX INFO: renamed from: kd */
    public void m53465kd(boolean z) {
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: l2 */
    public void mo53466l2(boolean z) {
        this.f34568V1 = z;
    }

    /* JADX INFO: renamed from: l9 */
    public final void m53467l9() {
        bnl0.m105525M0(this.f34571W, true);
        int measuredHeight = this.f34466B2.f34907u.getMeasuredHeight() - qa00.m175859d(32.0f);
        this.f34620h2 = measuredHeight;
        this.f34571W.setY(measuredHeight);
        bnl0.m105509E0(this.f34571W, new View.OnClickListener() { // from class: l.r6a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161461a.m53489ob(view);
            }
        });
    }

    /* JADX INFO: renamed from: lb */
    public final /* synthetic */ void m53468lb(Bundle bundle) {
        int i = this.f34510J3;
        if (i >= 0) {
            mo53471m2(i, false);
        }
    }

    /* JADX INFO: renamed from: lc */
    public final /* synthetic */ void m53469lc(List list) {
        if (!jyb.m147479J(list)) {
            jyb.m147537z(list, new y20() { // from class: l.v8a0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f182865a.m53458jc((Relationship) obj);
                }
            });
            return;
        }
        if (CoreModule.m30930K().mo31822sg(this.f34628j2.f56859id) || User.isMatched(this.f34628j2)) {
            bnl0.m105524M(this.f34603d1, true);
            bnl0.m105509E0(this.f34603d1, new View.OnClickListener() { // from class: l.w8a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f187840a.m53464kc(view);
                }
            });
        } else {
            bnl0.m105524M(this.f34562U0, this.f34666s2);
            bnl0.m105524M(this.f34532O0, true);
            bnl0.m105524M(this.f34586Z, true);
            bnl0.m105524M(this.f34480E0, true);
        }
    }

    /* JADX INFO: renamed from: ld */
    public String m53470ld(boolean z) {
        return z ? act().getString(R$string.f19820y2) : act().getString(R$string.f19851z2);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: m0 */
    public boolean mo52302m0() {
        return this.f34650o3;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: m2 */
    public void mo53471m2(final int i, final boolean z) {
        this.f34466B2.m168312b(new x20() { // from class: l.s7a0
            @Override // p153l.x20
            public final void call() {
                this.f166654a.m53303Lc(i, z);
            }
        });
        this.f34466B2.mo168208a(new x20() { // from class: l.t7a0
            @Override // p153l.x20
            public final void call() {
                this.f172409a.m53311Mc(i, z);
            }
        });
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: m3 */
    public boolean mo53472m3(User user) {
        return false;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m53473m9() {
        m53083Rd(CoreModule.m30930K().getUserById(this.f34642m3));
        this.f34566V.addOnScrollListener(new C8857b());
        if (!this.f34659q3) {
            bnl0.m105574p0(this.f34581Y);
            bnl0.m105574p0(this.f34547R0);
            bnl0.m105524M(this.f34576X, false);
            this.f34547R0 = null;
            this.f34581Y = null;
            this.f34532O0 = null;
            this.f34480E0 = null;
            this.f34586Z = null;
            return;
        }
        if ((this.f34472C3 & 1) != 1) {
            bnl0.m105525M0(this.f34532O0, false);
        }
        if ((this.f34472C3 & 256) != 256) {
            bnl0.m105525M0(this.f34586Z, false);
        }
        if ((this.f34472C3 & 16) != 16) {
            bnl0.m105525M0(this.f34480E0, false);
        }
        if (this.f34480E0.getVisibility() == 4) {
            this.f34502I0.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ma */
    public final boolean m53474ma() {
        if (CoreModule.m30932N().mo61573so()) {
            return (m53328P9(this.f34671t3) || m53321O9()) && d79.m114663V() && !m53451ia() && this.f34677v1 != null;
        }
        return false;
    }

    /* JADX INFO: renamed from: mb */
    public final /* synthetic */ void m53475mb(C4470c c4470c) {
        if (c4470c != C4470c.f16273o || this.f34650o3) {
            return;
        }
        m53411b9();
    }

    /* JADX INFO: renamed from: mc */
    public final /* synthetic */ Boolean m53476mc(String str) {
        return Boolean.valueOf(TextUtils.equals(str, userId()));
    }

    /* JADX INFO: renamed from: md */
    public final void m53477md() {
        if (jyb.m147479J(aw90.m100562F().f73701a.pictures)) {
            m21580b4().m21503F("你的个人资料页需要至少一张照片").m21555t0(R$string.f18776Q, new Runnable() { // from class: l.lca0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f131295a.m52256N6();
                }
            }).m21540k0(R$string.f19138c).m21567z0();
            return;
        }
        final User userM53315N8 = m53315N8();
        User userM53320O8 = m53320O8();
        boolean z = true;
        if (NullChecker.m82486a(userM53315N8) && NullChecker.m82486a(userM53320O8) && userM53315N8.equals(userM53320O8)) {
            this.f34468B4 = true;
        }
        final User userMo225055clone = aw90.m100562F().f73701a.mo225055clone();
        final User userMo225055clone2 = this.f34628j2.mo225055clone();
        if (h9n.m134081c()) {
            ArrayList<String> arrayList = new ArrayList();
            if (NullChecker.m82486a(userM53315N8) && NullChecker.m82486a(userM53315N8.profile) && NullChecker.m82486a(userM53315N8.profile.extensions) && NullChecker.m82486a(userM53315N8.profile.extensions.basic) && !TextUtils.isEmpty(userM53315N8.description)) {
                arrayList.add("about_me");
            }
            StringBuilder sb = new StringBuilder();
            for (String str : arrayList) {
                if (!z) {
                    sb.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
                }
                sb.append(str);
                z = false;
            }
            sfj0.m185596c("e_profile_save_button", pageId(), sfj0.C20032a.m185615h("edit_profile_content_modified", sb.toString()));
        }
        if (!NullChecker.m82486a(userM53315N8)) {
            m52256N6();
            return;
        }
        m21594o4(R$string.f18632L5);
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = userMo225055clone;
        if (NullChecker.m82486a(userM53315N8.profile) && NullChecker.m82486a(userM53315N8.profile.extensions)) {
            userM53315N8.profile.extensions.voiceSignature = null;
        }
        final boolean zEquals = (gra.m131676e2() && NullChecker.m82486a(userM53315N8) && NullChecker.m82486a(userM53315N8.profile) && NullChecker.m82486a(userM53315N8.profile.extensions) && NullChecker.m82486a(userM53315N8.profile.extensions.basic) && !jyb.m147479J(userM53315N8.profile.extensions.basic.friendPurpose)) ? TEnum.equals(userM53315N8.profile.extensions.basic.friendPurpose.get(0), "marriage") : false;
        duringCreated((C22421c) CoreModule.f18264c.f20294B0.m32624t4(profileEditInfoNew_).onErrorReturn(new qcj() { // from class: l.mca0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ProfileListFrag.m53121a8((Throwable) obj);
            }
        }).flatMap(new qcj() { // from class: l.nca0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f141331a.m53509rc(userM53315N8, (ProfileEditInfo) obj);
            }
        })).subscribe(psd0.m173600K(new y20() { // from class: l.oca0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f146669a.m53515sc(zEquals, userMo225055clone, userMo225055clone2, userM53315N8, (uxj0) obj);
            }
        }, new y20() { // from class: l.pca0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151543a.m53528uc(userMo225055clone2, userM53315N8, (Throwable) obj);
            }
        }, false));
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: me */
    public User mo53478me() {
        if (this.f34633k2 == null) {
            m53065Nd(CoreModule.m30930K().me_());
        }
        return this.f34633k2;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.PRE_CREATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        setHasOptionsMenu(true);
        m53439g9();
        m53180n9();
        m53536vd();
        if ("my_tab_profile_like".equals(this.f34671t3)) {
            this.pageHelper.m152782q(pageId());
        } else {
            m53325Od();
        }
        if (this.f34638l3) {
            if (this.f34538P1 == null) {
                act().m68056e2();
                return;
            } else {
                m53265Fd();
                return;
            }
        }
        if (!mo53326P(this.f34642m3) && vq8.m202358b()) {
            if ("home_card".equals(this.f34671t3) && ix60.INSTANCE.m142486q(CoreModule.m30930K().getUserById(this.f34642m3))) {
                this.f34641m2.m137019l(uxj0.f181467a);
                return;
            }
            CoreModule.f18264c.f20381e0.m116527W9(this.f34642m3);
        }
        m53014A9();
        xc20.m210108t(act());
        m53189p9();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        m53445h9();
    }

    /* JADX INFO: renamed from: na */
    public final boolean m53479na() {
        if (!NullChecker.m82486a(this.f34628j2) || this.f34628j2.isMe() || User.isMatched(this.f34628j2)) {
            return false;
        }
        return (!CoreModule.m30930K().mo31822sg(this.f34628j2.f56859id) || this.f34659q3) && m53433ed(this.f34671t3);
    }

    /* JADX INFO: renamed from: nb */
    public final /* synthetic */ void m53480nb(Bundle bundle) {
        act().lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.vca0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183352a.m53475mb((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: nc */
    public final /* synthetic */ void m53481nc(Bundle bundle) {
        if (this.f34646n3 && f34458I4 == null) {
            l51.m152919y(new Runnable() { // from class: l.b7a0
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileListFrag.m53015B5();
                }
            });
        }
        CoreModule.f18264c.f20378d0.f128826R.m159274k().first().subscribe(psd0.m173591B());
    }

    /* JADX INFO: renamed from: nd */
    public void m53482nd() {
        if ("from_see_blind_box".equals(this.f34671t3)) {
            mo52296j3(0);
        }
        m52256N6();
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: o */
    public void mo52306o() {
        if (!this.f34650o3) {
            if (m53488oa()) {
                i4g0.m138520r("e_push_profile_quit", "p_push_profile");
            }
            if (NullChecker.m82486a(this.f34588Z1) && this.f34588Z1.m224147f()) {
                this.f34588Z1.m224146d();
                this.f34588Z1 = null;
                return;
            } else if (!NullChecker.m82486a(this.f34592a2) || !this.f34592a2.m224138d()) {
                m52256N6();
                return;
            } else {
                this.f34592a2.m224137c();
                this.f34592a2 = null;
                return;
            }
        }
        if (NullChecker.m82486a(aw90.m100562F().f73701a)) {
            boolean zEquals = TextUtils.equals(m189086i2().description, this.f34633k2.description);
            String str = "about_me_pop_ups";
            if (!TextUtils.equals(this.f34671t3, "about_me_pop_ups")) {
                str = "about_me_banner";
                if (!TextUtils.equals(this.f34671t3, "about_me_banner")) {
                    str = "edit_data_button";
                    if (!TextUtils.equals(this.f34671t3, "edit_data_button")) {
                        str = "edit_home_page";
                        if (!TextUtils.equals(this.f34671t3, "edit_home_page")) {
                            str = "other";
                        }
                    }
                }
            }
            sfj0.m185596c("e_edit_personal_profile_finish", "p_edit_profile_view", sfj0.C20032a.m185615h("about_me_is_modified", zEquals ? "no" : "yes"), sfj0.C20032a.m185615h("previous_page", str));
        }
        if (!NullChecker.m82486a(aw90.m100562F().f73701a) || !NullChecker.m82486a(this.f34628j2)) {
            m52256N6();
            return;
        }
        if (this.f34680v4.m132952V()) {
            m189086i2().profile.extensions.momentSwitch.noSyncMoment.clear();
            m189086i2().profile.extensions.momentSwitch.noSyncMoment.add(0, this.f34680v4.m132951U() ? "false" : "true");
        }
        int iMo52275Z2 = mo52275Z2();
        if (m189086i2().equals(this.f34628j2)) {
            m52256N6();
        } else {
            m53404Zd(iMo52275Z2);
        }
    }

    @Override // p153l.q3m
    @Nullable
    /* JADX INFO: renamed from: o0 */
    public View mo53483o0() {
        return this.f34532O0;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: o1 */
    public boolean mo53484o1() {
        return this.f34563U1;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: o2 */
    public void mo53485o2() {
        this.f34610e4 = false;
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "onEnterAnimEnd");
        C22507a<uxj0> c22507a = this.f34606d4;
        uxj0 uxj0Var = uxj0.f181467a;
        c22507a.m137019l(uxj0Var);
        this.f34466B2.mo168208a(new x20() { // from class: l.o9a0
            @Override // p153l.x20
            public final void call() {
                this.f145515a.m53496pc();
            }
        });
        if (this.f34637l2) {
            this.f34641m2.m137019l(uxj0Var);
        }
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: o3 */
    public View mo53486o3() {
        return this.f34466B2.f34852E0;
    }

    /* JADX INFO: renamed from: o9 */
    public final void m53487o9() {
        Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(this.f34642m3);
        if (NullChecker.m82486a(conversationM34219zp) && TEnum.equals(conversationM34219zp.status, "default")) {
            if (NullChecker.m82486a(this.f34562U0)) {
                bnl0.m105524M(this.f34562U0, false);
            }
            if (NullChecker.m82486a(this.f34632k1)) {
                bnl0.m105524M(this.f34632k1, false);
            }
        }
        if (m53295K9()) {
            this.f34602c4 = CoreModule.m30932N().getUserById(this.f34642m3);
            if (NullChecker.m82486a(this.f34619h1)) {
                bnl0.m105524M(this.f34619h1, false);
            }
            if (NullChecker.m82486a(this.f34599c1)) {
                bnl0.m105524M(this.f34599c1, false);
            }
            if (m53479na() && m53427dd()) {
                if (NullChecker.m82486a(this.f34562U0)) {
                    bnl0.m105524M(this.f34562U0, true);
                }
                if (NullChecker.m82486a(this.f34631k0)) {
                    bnl0.m105524M(this.f34631k0, false);
                }
                if (NullChecker.m82486a(this.f34677v1)) {
                    bnl0.m105524M(this.f34677v1, true);
                }
                if (NullChecker.m82486a(this.f34460A1)) {
                    bnl0.m105524M(this.f34460A1, false);
                    return;
                }
                return;
            }
            if (NullChecker.m82486a(this.f34581Y)) {
                bnl0.m105524M(this.f34581Y, false);
            }
            if (NullChecker.m82486a(this.f34632k1)) {
                bnl0.m105524M(this.f34632k1, true);
            }
            if (NullChecker.m82486a(this.f34636l1)) {
                bnl0.m105524M(this.f34636l1, true);
                bnl0.m105509E0(this.f34636l1, new View.OnClickListener() { // from class: l.w7a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f187729a.m53495pb(view);
                    }
                });
            }
            if (NullChecker.m82486a(this.f34640m1)) {
                bnl0.m105524M(this.f34640m1, true);
                bnl0.m105509E0(this.f34640m1, new View.OnClickListener() { // from class: l.x7a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f192682a.m53502qb(view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: oa */
    public boolean m53488oa() {
        return false;
    }

    /* JADX INFO: renamed from: ob */
    public final /* synthetic */ void m53489ob(View view) {
        pza0.m174356h("button");
        mo52306o();
    }

    /* JADX INFO: renamed from: oc */
    public final /* synthetic */ void m53490oc(MenuItem menuItem, View view) {
        startActivity(ProfileAct.m51922q2(act() == null ? menuItem.getActionView().getContext() : act(), this.f34642m3, "profile_frag_menu", false, true));
    }

    /* JADX INFO: renamed from: od */
    public View.OnClickListener m53491od(User user) {
        return new View.OnClickListener() { // from class: l.k7a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124255a.m53535vc(view);
            }
        };
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 786) {
            if (i2 == -1) {
                qtk.m177983L0(act(), (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h));
                return;
            }
            return;
        }
        if (1 == i && NullChecker.m82486a(intent)) {
            String stringExtra = intent.getStringExtra("about_me");
            aw90.m100562F().f73701a.description = jyb.m147516k(stringExtra).trim();
            mo52239E();
            m53040Gd(aw90.m100562F().f73701a);
            return;
        }
        if (2 == i && NullChecker.m82486a(intent)) {
            String stringExtra2 = intent.getStringExtra("intl_friend_purpose");
            ArrayList arrayList = new ArrayList();
            arrayList.add(stringExtra2);
            aw90.m100562F().f73701a.profile.extensions.basic.intlFriendPurpose = arrayList;
            aw90.m100562F().f73701a.profile.extensions.basic.intlFriendPurposeV2 = arrayList;
            mo52239E();
            m53040Gd(aw90.m100562F().f73701a);
            return;
        }
        if (NullChecker.m82486a(intent) && i2 == -1 && LoopFragmentFactory.m52653N(i, aw90.m100562F().f73701a, intent)) {
            mo52239E();
            m53040Gd(aw90.m100562F().f73701a);
            if (i == LoopInputType.HIDDEN_SCHOOL.requestCode) {
                this.f34656p4.m212180R0();
                return;
            }
            return;
        }
        if (i == 3500 && i2 == -1 && NullChecker.m82486a(intent)) {
            if (NullChecker.m82486a(aw90.m100562F().f73701a)) {
                LoopFragmentFactory.m52672j(act());
                if (gra.m131756u2()) {
                    m53018Bd(aw90.m100562F().f73701a.pictures);
                }
                mo52239E();
                m53040Gd(aw90.m100562F().f73701a);
                return;
            }
            return;
        }
        if (i == 3001) {
            mo52239E();
            m53040Gd(aw90.m100562F().f73701a);
        } else if (i == 3003) {
            mo52250J3();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (getActivity() instanceof NewUI1ContainerActivity) {
            menuInflater.inflate(lfc0.f131843f, menu);
            final MenuItem menuItemFindItem = menu.findItem(adc0.f70420k8);
            menuItemFindItem.getActionView().setOnClickListener(new View.OnClickListener() { // from class: l.iaa0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f113570a.m53490oc(menuItemFindItem, view);
                }
            });
            CoreBusinessModule.m30906m0().mo122545e(menuItemFindItem);
            if (this.f34638l3) {
                menuItemFindItem.setVisible(false);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.app.AutoReleaseVideoFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        PerformanceLogUtil.instance().endTrance();
        Animator animator = this.f34649o2;
        if (animator != null && animator.isRunning()) {
            this.f34649o2.end();
            this.f34649o2 = null;
        }
        C8618a.m48771w().f31323a = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (NullChecker.m82486a(aw90.m100562F().f73701a)) {
            mo52275Z2();
            bundle.putBoolean("saveInstanceKey", true);
        }
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: p1 */
    public void mo53492p1(boolean z) {
        this.f34558T1 = z;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: p2 */
    public boolean mo53493p2() {
        return this.f34477D3;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: p3 */
    public void mo52308p3(final int i, final Media media) {
        this.f34635k4.mo168208a(new x20() { // from class: l.n7a0
            @Override // p153l.x20
            public final void call() {
                this.f140586a.m53403Zc(media, i);
            }
        });
    }

    /* JADX INFO: renamed from: pa */
    public boolean m53494pa(User user) {
        Settings settings;
        List<SettingGroups> list;
        if (vq8.m202358b() && user != null && (settings = user.settings) != null && (list = settings.settingGroups) != null && !list.isEmpty() && user.settings.settingGroups.get(0) != null && user.settings.settingGroups.get(0).live != null && !user.settings.settingGroups.get(0).live.hideProfileWealthTag.booleanValue()) {
            UserWealthGradeConfig userWealthGradeConfigMo68402Gj = CoreModule.m30934Q().mo68402Gj(user.settings.settingGroups.get(0).live.wealthGrade, false);
            if (userWealthGradeConfigMo68402Gj.openNewIcon && !TextUtils.isEmpty(userWealthGradeConfigMo68402Gj.wealthIconUrl)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        if ("my_tab_profile_like".equals(this.f34671t3)) {
            return "p_my_profile_comment";
        }
        if ("from_guess_liker_result".equals(this.f34671t3)) {
            return "p_guess_who_likes_me_profile";
        }
        if ("from_christmas".equals(this.f34671t3)) {
            return "p_christmas_profile";
        }
        if (NullChecker.m82486a(this.f34483E3) && this.f34483E3.showCountdownSendMsg) {
            return "p_new_profile";
        }
        if (TextUtils.isEmpty(this.f34642m3) || !mo53326P(this.f34642m3)) {
            return getArguments().getBoolean("is_edit") ? "p_edit_profile_view" : OMSDialogPositon.p_suggest_user_profile_info_view;
        }
        return "p_unmatch_profile";
    }

    /* JADX INFO: renamed from: pb */
    public final /* synthetic */ void m53495pb(View view) {
        m53459jd();
    }

    /* JADX INFO: renamed from: pc */
    public final /* synthetic */ void m53496pc() {
        this.f34466B2.m54023y1();
    }

    /* JADX INFO: renamed from: pd */
    public void m53497pd(User user) {
        if (this.f34633k2.isPicVerificationVerified()) {
            CoreDlg.m46280r1(act());
            return;
        }
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending")) {
            CoreDlg.m46170G1(act(), act().string(R$string.f18924Ur), act().string(R$string.f19567ps), dbc0.f87506v8, act().string(R$string.f19536os), null, false, null, null, null, null, true, false, null, null, !this.f34646n3);
            return;
        }
        hxf.m137593n();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_avatarVerification_icon_explain_guide_Unverified", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        CoreDlg.m46170G1(act(), act().string(R$string.f18924Ur), act().string(R$string.f19567ps), dbc0.f87506v8, act().string(R$string.f19505ns), new x20() { // from class: l.r8a0
            @Override // p153l.x20
            public final void call() {
                this.f161682a.m53540wc();
            }
        }, true, act().string(R$string.f19474ms), new x20() { // from class: l.s8a0
            @Override // p153l.x20
            public final void call() {
                i4g0.m138520r("e_avatarVerification_explain_cancle_click", "p_avatarVerification_icon_explain_guide_Unverified");
            }
        }, new x20() { // from class: l.t8a0
            @Override // p153l.x20
            public final void call() {
                w1e.m204401e(l4g0VarM204399c);
            }
        }, null, true, false, null, null, !this.f34646n3);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: q */
    public ViewGroup mo52310q() {
        return this.f34485F;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: q2 */
    public View mo53498q2() {
        return this.f34576X;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: q3 */
    public boolean mo53499q3() {
        return this.f34465B1;
    }

    /* JADX INFO: renamed from: q9 */
    public final void m53500q9() {
        if (NullChecker.m82486a(this.f34581Y)) {
            bnl0.m105524M(this.f34581Y, false);
        }
        if (NullChecker.m82486a(this.f34562U0)) {
            bnl0.m105524M(this.f34562U0, false);
        }
        if (NullChecker.m82486a(this.f34532O0)) {
            bnl0.m105524M(this.f34532O0, false);
        }
        if (NullChecker.m82486a(this.f34586Z)) {
            bnl0.m105524M(this.f34586Z, false);
        }
        if (NullChecker.m82486a(this.f34677v1)) {
            bnl0.m105524M(this.f34677v1, false);
        }
        if (NullChecker.m82486a(this.f34619h1)) {
            bnl0.m105524M(this.f34619h1, false);
        }
        if (NullChecker.m82486a(this.f34599c1)) {
            bnl0.m105524M(this.f34599c1, false);
        }
    }

    /* JADX INFO: renamed from: qa */
    public boolean m53501qa() {
        if (this.f34600c2 || this.f34604d2) {
            return true;
        }
        if (!NullChecker.m82486a(this.f34602c4.localRelationship)) {
            return false;
        }
        if (jyb.m147479J(this.f34602c4.localRelationship.status) || !this.f34602c4.localRelationship.status.contains(MatchFrom.get(MatchFrom.superLiked))) {
            return NullChecker.m82486a(this.f34602c4.localRelationship.relationshipExtensions) && TEnum.equals(this.f34602c4.localRelationship.relationshipExtensions.relationType, RelationshipStatus.SUPERLIKED);
        }
        return true;
    }

    /* JADX INFO: renamed from: qb */
    public final /* synthetic */ void m53502qb(View view) {
        m53449hd();
    }

    /* JADX INFO: renamed from: qc */
    public final /* synthetic */ void m53503qc() {
        this.f34466B2.m54024z1();
    }

    /* JADX INFO: renamed from: qd */
    public final void m53504qd() {
        if (this.f34646n3 || !m53406a9()) {
            return;
        }
        User userById = CoreModule.m30930K().getUserById(this.f34642m3);
        if (!NullChecker.m82486a(userById) || userById.unilateralBlock() || mo53326P(this.f34642m3) || mo53416c3(userById)) {
            return;
        }
        CoreModule.m30932N().coreMomentPrevious(this.f34642m3);
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: r3 */
    public PictureView mo53505r3(int i) {
        View viewM53969G0 = this.f34466B2.m53969G0(i);
        if (viewM53969G0 instanceof PictureView) {
            return (PictureView) viewM53969G0;
        }
        if (this.f34466B2.m53969G0(0) instanceof PictureView) {
            return (PictureView) this.f34466B2.m53969G0(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: r9 */
    public final void m53506r9() {
        if (m53418ca() || m53424da()) {
            bnl0.m105524M(this.f34532O0, false);
            bnl0.m105524M(this.f34586Z, false);
            if (this.f34666s2) {
                m53280I8();
            }
        }
    }

    /* JADX INFO: renamed from: ra */
    public final /* synthetic */ void m53507ra(int i, Intent intent, Relationship relationship) {
        act().setResult(i, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: rb */
    public final /* synthetic */ C22421c m53508rb() {
        return psd0.m173626s(this.f34646n3 ? CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged() : C22421c.just(null), CoreModule.f18264c.f20381e0.m116483Ka(this.f34642m3), CoreModule.f18264c.f20381e0.m116596o9(), new jda0());
    }

    /* JADX INFO: renamed from: rc */
    public final /* synthetic */ C22421c m53509rc(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.f18264c.f20381e0.m116458E9(user);
        }
        aw90.m100562F().f73701a.description = profileEditInfo.user.description;
        aw90.m100562F().f73701a.profile = profileEditInfo.user.profile;
        User user2 = aw90.m100562F().f73701a;
        User user3 = profileEditInfo.user;
        user2.name = user3.name;
        if (TextUtils.isEmpty(user3.pictures.get(0).url)) {
            m53259Ed(aw90.m100562F().f73701a, true);
            bnl0.m105524M(this.f34635k4.f105079w, false);
        } else {
            bnl0.m105524M(this.f34635k4.f105079w, true);
            aw90.m100562F().f73701a.pictures = profileEditInfo.user.pictures;
            m53259Ed(aw90.m100562F().f73701a, false);
        }
        throw new ProfileEditInfoException();
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: s1 */
    public boolean mo53510s1() {
        return this.f34659q3;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: s2 */
    public LikedUser mo53511s2() {
        return this.f34495G3;
    }

    /* JADX INFO: renamed from: s9 */
    public final void m53512s9() {
        this.f34630j4.add(this.f34466B2);
        if (TextUtils.equals(this.f34642m3, CoreModule.m30929H().userId())) {
            this.f34630j4.add(this.f34471C2);
        }
        if (m53488oa()) {
            this.f34630j4.add(this.f34589Z2);
        }
        this.f34630j4.add(this.f34593a3);
        this.f34630j4.add(this.f34476D2);
        this.f34630j4.add(this.f34617g3);
        this.f34630j4.add(this.f34601c3);
        this.f34630j4.add(this.f34605d3);
        this.f34630j4.add(this.f34609e3);
        this.f34630j4.add(this.f34482E2);
        if (uqb0.f180396b0.f170326c.mo68416Om()) {
            this.f34630j4.add(this.f34569V2);
        }
        this.f34630j4.add(this.f34613f3);
        if (!m53380W9()) {
            this.f34630j4.add(this.f34488F2);
            this.f34488F2.m122925u0(this.f34671t3);
        }
        this.f34630j4.add(this.f34597b3);
        this.f34630j4.add(this.f34494G2);
        this.f34630j4.add(this.f34621h3);
        this.f34630j4.add(this.f34499H2);
        this.f34630j4.add(this.f34509J2);
        this.f34630j4.add(this.f34504I2);
        this.f34630j4.add(this.f34534O2);
        this.f34630j4.add(this.f34539P2);
        this.f34630j4.add(this.f34544Q2);
        this.f34630j4.add(this.f34549R2);
        this.f34630j4.add(this.f34554S2);
        this.f34630j4.add(this.f34559T2);
        this.f34630j4.add(this.f34564U2);
        if (!TextUtils.isEmpty(this.f34671t3) && (TextUtils.equals("home_card", this.f34671t3) || TextUtils.equals("share_profile", this.f34671t3) || TextUtils.equals("home_moment_theme_card", this.f34671t3))) {
            mo52258P1();
        }
        if (!User.ID_OFFICIAL_CHANNEL.equals(this.f34642m3) && !"from_guess_liker_result".equals(this.f34671t3)) {
            this.f34630j4.add(this.f34579X2);
        }
        if (!mo52258P1()) {
            this.f34630j4.add(new b43(this, this));
        }
        this.f34630j4.add(this.f34688x4);
        this.f34630j4.add(this.f34688x4);
    }

    /* JADX INFO: renamed from: sa */
    public final /* synthetic */ void m53513sa(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().m68056e2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: sb */
    public final /* synthetic */ void m53514sb(bkj0 bkj0Var) {
        m53083Rd((User) bkj0Var.f77082b);
        m53065Nd((User) bkj0Var.f77083c);
        m53522td();
        mo52250J3();
    }

    /* JADX INFO: renamed from: sc */
    public final /* synthetic */ void m53515sc(boolean z, User user, User user2, User user3, uxj0 uxj0Var) {
        if (z) {
            CoreModule.f18264c.f20381e0.f89234g4.m137019l("");
        }
        if (user.pictures.size() - user2.pictures.size() > 0) {
            i4g0.m138495D("e_upload_photos_success", pageId(), jyb.m147494Y("upload_page_name", "edit_profile_page"), jyb.m147494Y("upload_photos_count", Integer.valueOf(user.pictures.size() - user2.pictures.size())));
        }
        if (this.f34463A4) {
            m53128be();
            this.f34463A4 = false;
        }
        m52256N6();
        if (NullChecker.m82486a(user3.pictures) && user3.pictures.size() > 0) {
            CoreModule.f18264c.f20381e0.m116468H7();
            HashMap map = new HashMap();
            map.put("Number of photos changed", Integer.valueOf(user3.pictures.size() - user2.pictures.size()));
            x95.INSTANCE.m209793m("Edited Profile", map);
        }
        if (this.f34468B4) {
            return;
        }
        aw90.m100562F().f73704d.m137019l(Integer.valueOf((NullChecker.m82486a(this.f34628j2) && this.f34628j2.status.contains(UserStatus.get(UserStatus.audit))) ? ml70.f137370d : ml70.f137371e));
    }

    /* JADX INFO: renamed from: sd */
    public final void m53516sd(boolean z) {
        if (NullChecker.m82486a(this.f34466B2.f34857H) && NullChecker.m82486a(this.f34466B2.f34863K) && NullChecker.m82486a(this.f34466B2.f34865L) && this.f34466B2.m168323u().isAttachedToWindow()) {
            if (!m53494pa(this.f34628j2) || NullChecker.m82486a(this.f34466B2.f34861J)) {
                this.f34466B2.m54022x1(z);
            }
        }
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: t1 */
    public void mo53517t1() {
        if (mo53399Z1()) {
            this.f34476D2.mo168208a(new x20() { // from class: l.x8a0
                @Override // p153l.x20
                public final void call() {
                    this.f192804a.m53258Ec();
                }
            });
        }
    }

    /* JADX INFO: renamed from: t9 */
    public final void m53518t9() {
        ixa0 ixa0Var = new ixa0();
        int visibility = m53336Q9() & (this.f34659q3 ^ true) ? 8 : this.f34581Y.getVisibility();
        bnl0.m105574p0(this.f34581Y);
        bnl0.m105574p0(this.f34619h1);
        ixa0Var.m142502e(this.f34562U0);
        this.f34581Y = ixa0Var.f117355c;
        this.f34631k0 = ixa0Var.f117359g;
        this.f34586Z = ixa0Var.f117358f;
        this.f34532O0 = ixa0Var.f117364l;
        this.f34537P0 = ixa0Var.f117365m;
        this.f34486F0 = ixa0Var.f117361i;
        this.f34480E0 = ixa0Var.f117360h;
        this.f34652p0 = ixa0Var.f117356d;
        this.f34492G0 = ixa0Var.f117362j;
        this.f34497H0 = ixa0Var.f117363k;
        this.f34562U0.setVisibility(visibility);
        this.f34581Y.setVisibility(visibility);
        this.f34576X.setVisibility(visibility);
        this.f34619h1 = ixa0Var.f117369q;
        this.f34677v1 = ixa0Var.f117366n;
        this.f34681w1 = ixa0Var.f117367o;
        VLinear vLinear = ixa0Var.f117368p;
        this.f34685x1 = vLinear;
        this.f34689y1 = ixa0Var.f117370r;
        this.f34694z1 = ixa0Var.f117371s;
        this.f34460A1 = ixa0Var.f117373u;
        bnl0.m105509E0(vLinear, new View.OnClickListener() { // from class: l.e8a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92529a.m53520tb(view);
            }
        });
        bnl0.m105509E0(this.f34681w1, new View.OnClickListener() { // from class: l.f8a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97708a.m53527ub(view);
            }
        });
        ixa0Var.m142503f(act(), this.f34628j2, this.f34671t3, new x20() { // from class: l.g8a0
            @Override // p153l.x20
            public final void call() {
                this.f102652a.m53534vb();
            }
        });
        if (TextUtils.equals("home_card", this.f34671t3) && NullChecker.m82486a(this.f34628j2) && CoreModule.f18264c.f20405m0.m32023L6(this.f34628j2.f56859id)) {
            bnl0.m105524M(this.f34581Y, false);
            bnl0.m105524M(this.f34547R0, true);
        }
        m53340Qd();
    }

    /* JADX INFO: renamed from: ta */
    public final /* synthetic */ void m53519ta(int i, Intent intent, Relationship relationship) {
        if (!TEnum.equals(relationship.state, "liked") && !TEnum.equals(relationship.state, "matched") && !TEnum.equals(relationship.state, "superliked")) {
            act().setResult(i, intent);
            act().m68056e2();
            return;
        }
        if (NullChecker.m82486a(this.f34586Z)) {
            bnl0.m105524M(this.f34586Z, false);
        }
        if (NullChecker.m82486a(this.f34532O0)) {
            bnl0.m105524M(this.f34532O0, false);
        }
        if (!TEnum.equals(relationship.state, "superliked") && !relationship.status.contains(MatchFrom.get(MatchFrom.superLiked)) && i != SwipeDirection.UP.getValue()) {
            o1j0.m165651y("喜欢已发送");
        } else if (NullChecker.m82486a(this.f34480E0)) {
            bnl0.m105524M(this.f34480E0, false);
        }
    }

    /* JADX INFO: renamed from: tb */
    public final /* synthetic */ void m53520tb(View view) {
        m53449hd();
    }

    /* JADX INFO: renamed from: td */
    public final void m53522td() {
        m53292Jd();
        if (mo52236D2()) {
            return;
        }
        if (this.f34613f3.mo105673S()) {
            this.f34613f3.m105676V(true);
            return;
        }
        if (this.f34605d3.mo105673S()) {
            this.f34605d3.m105676V(true);
            return;
        }
        if (this.f34601c3.mo105673S()) {
            this.f34601c3.m105676V(true);
        } else if (this.f34617g3.mo105673S()) {
            this.f34617g3.m105676V(true);
        } else if (this.f34609e3.mo105673S()) {
            this.f34609e3.m105676V(true);
        }
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: u2 */
    public VPager_SquaredRefactor mo53523u2() {
        return this.f34466B2.f34910x;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: u3 */
    public void mo53524u3(int i) {
        this.f34548R1 = i;
    }

    /* JADX INFO: renamed from: u9 */
    public final void m53525u9() {
        if (!CoreModule.f18264c.f20381e0.m116593na().status.contains(UserStatus.get(UserStatus.audit)) && !CertificationUtil.m59336l() && nrb0.m164466b()) {
            bnl0.m105524M(this.f34506J, false);
            return;
        }
        PicCertGuideView picCertGuideView = this.f34686x2;
        if (picCertGuideView != null) {
            bnl0.m105524M(picCertGuideView, false);
        }
    }

    /* JADX INFO: renamed from: ua */
    public final /* synthetic */ void m53526ua(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: ub */
    public final /* synthetic */ void m53527ub(View view) {
        m53459jd();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX INFO: renamed from: uc */
    public final /* synthetic */ void m53528uc(User user, User user2, Throwable th) {
        boolean z;
        if (bsj0.m106250H(th)) {
            m21598s4();
            return;
        }
        if (th instanceof ProfileEditInfoException) {
            m21598s4();
            r1j0.m179419f(R$string.f18664M7);
            return;
        }
        if (NullChecker.m82486a(act())) {
            m21598s4();
            if (th instanceof TantanException.Client.TantanForbidden) {
                TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
                if (!tantanForbidden.isCannotModify() || TextUtils.isEmpty(tantanForbidden.message)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            CrashHelper.m82479c(new Throwable("from:" + this.f34671t3 + th.toString()));
            if (z) {
                String string = act().getString(R$string.f19129bl);
                double dDoubleValue = (NullChecker.m82486a(user.settings) && NullChecker.m82486a(user.settings.birthdate)) ? user.settings.birthdate.doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                if (NullChecker.m82486a(user2.settings) && NullChecker.m82486a(user2.settings.birthdate)) {
                    dDoubleValue = user2.settings.birthdate.doubleValue();
                }
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis((long) dDoubleValue);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(uqb0.f180376H.guessedCurrentServerTime());
                int iM214863T = yab.m214863T(calendar, calendar2);
                if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name) && iM214863T > 120) {
                    string = act().getString(R$string.f18930V3);
                } else if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name)) {
                    string = act().getString(R$string.f18960W3);
                } else if (iM214863T > 120) {
                    string = act().getString(R$string.f18990X3);
                }
                m21580b4().m21503F(string).m21555t0(R$string.f18776Q, new Runnable() { // from class: l.l8a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f130430a.m53521tc();
                    }
                }).m21540k0(R$string.f19138c).m21567z0();
            }
        }
    }

    /* JADX INFO: renamed from: ud */
    public final void m53529ud() {
        if (m53440ga()) {
            this.f34485F.getViewTreeObserver().addOnGlobalLayoutListener(this.f34585Y3);
        }
    }

    @Override // p153l.s7m
    public String userId() {
        return this.f34642m3;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: v1 */
    public boolean mo53530v1() {
        return this.f34558T1;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: v2 */
    public boolean mo53531v2() {
        if (gra.m131637V1()) {
            return TextUtils.equals(this.f34671t3, "chat_group_anonymity") || TextUtils.equals(this.f34671t3, "group_notification_anonymity");
        }
        return false;
    }

    /* JADX INFO: renamed from: v9 */
    public final void m53532v9() {
        if (this.f34666s2 && m53430ea() && CoreModule.m30930K().mo31822sg(this.f34628j2.f56859id)) {
            m53280I8();
        }
    }

    /* JADX INFO: renamed from: va */
    public final /* synthetic */ void m53533va() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: vb */
    public final /* synthetic */ void m53534vb() {
        if (d79.m114663V()) {
            if (m53373V9()) {
                act().setResult(SwipeDirection.REMOVE.getValue());
            }
            m52256N6();
        } else if (TextUtils.equals("home_card", this.f34671t3) || m53430ea() || m53336Q9() || TextUtils.equals("home_moment_theme_card", this.f34671t3)) {
            m53280I8();
        }
    }

    /* JADX INFO: renamed from: vc */
    public final /* synthetic */ void m53535vc(View view) {
        m53497pd(this.f34628j2);
    }

    /* JADX INFO: renamed from: vd */
    public final void m53536vd() {
        if ("home_card".equals(this.f34671t3) || "home_moment_theme_card".equals(this.f34671t3)) {
            this.f34465B1 = false;
            this.f34696z3 = "swipe";
            return;
        }
        if ("conversation_view".equals(this.f34671t3)) {
            this.f34696z3 = "conversationlist";
            return;
        }
        if ("messages_thumbnail_right".equals(this.f34671t3) || "messages_thumbnail_left".equals(this.f34671t3) || "messages_title".equals(this.f34671t3) || CoreStaticData.ProfileFromType.MESSAGE_ICE_BREAK_DIALOG.equals(this.f34671t3) || "messages_friend_comment_toast".equals(this.f34671t3) || "profile_bubble".equals(this.f34671t3)) {
            this.f34696z3 = "conversation";
        } else if ("moments_in_profile".equals(this.f34671t3)) {
            this.f34696z3 = "personal_album";
        } else if ("home_menu".equals(this.f34671t3)) {
            this.f34696z3 = "main_menu";
        }
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: w3 */
    public View mo53537w3() {
        return this.f34466B2.f34849C;
    }

    /* JADX INFO: renamed from: wa */
    public final /* synthetic */ void m53538wa(final User user, Relationship relationship) {
        User userM116506Q9 = CoreModule.f18264c.f20381e0.m116506Q9(user.f56859id);
        if (userM116506Q9 != null) {
            user = userM116506Q9;
        }
        if (NullChecker.m82486a(relationship) && !relationship.equals(user.localRelationship)) {
            user.localRelationship = relationship;
            CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.c8a0
                @Override // p153l.x20
                public final void call() {
                    uqb0.f180405k0.f184355d.upsert(user);
                }
            });
        }
        l51.m152888H(act(), new Runnable() { // from class: l.d8a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f85591a.m53533va();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: wb */
    public final /* synthetic */ void m53539wb() {
        this.f34566V.scrollBy(0, ProfileImagesItemHolder.f34845k1);
    }

    /* JADX INFO: renamed from: wc */
    public final /* synthetic */ void m53540wc() {
        i4g0.m138520r("e_avatarVerification_explain_click", "p_avatarVerification_icon_explain_guide_Unverified");
        if (TEnum.equals(CoreModule.f18264c.f20294B0.m32623s4(), "pending")) {
            CoreDlg.m46170G1(act(), act().string(R$string.f19259fs), act().string(R$string.f19228es), dbc0.f87123jk, act().string(R$string.f18894Tr), null, false, null, null, null, null, true, false, null, null, !this.f34646n3);
        } else {
            hxf.m137587h(act(), OMSTemplateType.dialog);
        }
    }

    /* JADX INFO: renamed from: wd */
    public String m53541wd() {
        return m53488oa() ? wtk.m207894b(this.f34687x3) : "";
    }

    /* JADX INFO: renamed from: x8 */
    public View m53542x8(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pha0.m172322b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: xa */
    public final /* synthetic */ void m53543xa(final User user, final Relationship relationship) {
        l51.m152919y(new Runnable() { // from class: l.nda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f141472a.m53538wa(user, relationship);
            }
        });
    }

    /* JADX INFO: renamed from: xb */
    public final /* synthetic */ void m53544xb(String str, List list) {
        if (jyb.m147479J(list)) {
            mo52306o();
        } else {
            eu4.m122523b().m122533k(act(), str);
        }
    }

    /* JADX INFO: renamed from: xc */
    public final /* synthetic */ pf60 m53545xc(List list) {
        return jyb.m147494Y(list, BookMoviesDramasHelper.m60629l(userId()));
    }

    /* JADX INFO: renamed from: xd */
    public final void m53546xd() {
        if (NullChecker.m82486a(this.f34599c1) && this.f34599c1.getVisibility() == 0) {
            i4g0.m138526x("e_push_profile_hello", "p_push_profile");
        }
        if (NullChecker.m82486a(this.f34581Y) && this.f34581Y.getVisibility() == 0) {
            if (NullChecker.m82486a(this.f34586Z) && this.f34586Z.getVisibility() == 0) {
                i4g0.m138526x("e_push_profile_dislike", "p_push_profile");
            }
            if (NullChecker.m82486a(this.f34480E0) && this.f34480E0.getVisibility() == 0) {
                i4g0.m138526x("e_push_profile_superlike", "p_push_profile");
            }
            if (NullChecker.m82486a(this.f34532O0) && this.f34532O0.getVisibility() == 0) {
                i4g0.m138526x("e_push_profile_like", "p_push_profile");
            }
        }
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: y0 */
    public String mo53547y0() {
        return m53488oa() ? wtk.m207893a(this.f34687x3, this.f34691y3) : "";
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: y1 */
    public View mo53548y1() {
        return (View) m53438fd(this.f34466B2.f34912z);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: y2 */
    public boolean mo53549y2() {
        if (!m189087s() || this.f34650o3) {
            return wkh0.m206820f() && !this.f34650o3 && TextUtils.equals(this.f34671t3, "home_card");
        }
        return true;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: y3 */
    public void mo53550y3(pf60<Integer, Integer> pf60Var) {
        this.f34578X1 = pf60Var;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
        ValueAnimator valueAnimator = this.f34634k3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.mo21604y4();
    }

    /* JADX INFO: renamed from: y8 */
    public void m53551y8(int i, Intent intent) {
        if (NullChecker.m82486a(intent)) {
            intent.putExtra("currentImageIndex", mo53415c0());
            int iMo53415c0 = mo53415c0();
            int size = this.f34628j2.pictures.size();
            User user = this.f34628j2;
            if (iMo53415c0 < size) {
                intent.putExtra("currentImageUrl", user.pictures.get(mo53415c0()).url);
            } else {
                intent.putExtra("currentImageUrl", user.hasPic() ? this.f34628j2.m61308fp().url : "");
                CrashHelper.m82479c(new Exception("ProfileListFrag user pictures get index crash on acfFinish"));
            }
        }
        act().setResult(i, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: y9 */
    public final void m53552y9() {
        mp90 mp90Var = new mp90();
        int visibility = this.f34581Y.getVisibility();
        bnl0.m105574p0(this.f34581Y);
        mp90Var.m159350a(this.f34542Q0);
        mp90Var.m159351b();
        RelativeLayout relativeLayout = mp90Var.f137887a;
        this.f34581Y = relativeLayout;
        this.f34631k0 = mp90Var.f137889c;
        this.f34586Z = mp90Var.f137888b;
        this.f34532O0 = mp90Var.f137895i;
        this.f34537P0 = mp90Var.f137896j;
        this.f34486F0 = mp90Var.f137892f;
        this.f34480E0 = mp90Var.f137891e;
        this.f34652p0 = mp90Var.f137890d;
        this.f34492G0 = mp90Var.f137893g;
        this.f34497H0 = mp90Var.f137894h;
        relativeLayout.setVisibility(visibility);
        this.f34576X.setVisibility(visibility);
        if (TextUtils.equals("home_card", this.f34671t3) && NullChecker.m82486a(this.f34628j2) && CoreModule.f18264c.f20405m0.m32023L6(this.f34628j2.f56859id)) {
            bnl0.m105524M(this.f34581Y, false);
            bnl0.m105524M(this.f34547R0, true);
        }
        m53340Qd();
    }

    /* JADX INFO: renamed from: ya */
    public final /* synthetic */ void m53553ya(int i, Intent intent, Relationship relationship) {
        if (i != SwipeDirection.LEFT.getValue()) {
            o1j0.m165651y(String.format("喜欢已发送，%s将收到你的喜欢", this.f34628j2.isFemale() ? "她" : "他"));
        }
        act().setResult(i, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: yb */
    public final /* synthetic */ void m53554yb(Throwable th) {
        mo52306o();
    }

    /* JADX INFO: renamed from: yc */
    public final /* synthetic */ void m53555yc(pf60 pf60Var) {
        this.f34645n2 = pf60Var;
        mo52250J3();
    }

    /* JADX INFO: renamed from: z8 */
    public final void m53556z8() {
        if (TextUtils.equals(this.f34671t3, "from_portrait_like_list") || TextUtils.equals(this.f34671t3, "from_city_center_conv_banner") || TextUtils.equals(this.f34671t3, "from_city_center_boost_cover") || TextUtils.equals(this.f34671t3, "impress_signal") || TextUtils.equals(this.f34671t3, "from_pin_like") || this.f34666s2) {
            return;
        }
        if (NullChecker.m82486a(this.f34581Y) && (this.f34581Y.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f34581Y.getLayoutParams();
            layoutParams.bottomMargin = qa00.m175859d(72.0f);
            this.f34581Y.setLayoutParams(layoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f34619h1.getLayoutParams();
            marginLayoutParams.bottomMargin = qa00.m175859d(72.0f);
            this.f34619h1.setLayoutParams(marginLayoutParams);
        }
        boolean zEquals = false;
        this.f34599c1.setVisibility(0);
        if ("liked_users".equals(this.f34671t3) || m53393Y9() || m53400Z9() || m53350S9()) {
            LikedUser likedUserM210760C3 = CoreModule.f18264c.f20367Z0.m210760C3(this.f34642m3);
            if (likedUserM210760C3 == null && NullChecker.m82486a(this.f34495G3)) {
                likedUserM210760C3 = this.f34495G3;
            }
            if (NullChecker.m82486a(likedUserM210760C3)) {
                zEquals = TEnum.equals(likedUserM210760C3.status, "superliked");
            }
        }
        this.f34599c1.mo57475I(zEquals);
        if (CoreModule.m30930K().getUserById(this.f34642m3) == null) {
            NullChecker.m82486a(this.f34505I3);
        }
        this.f34599c1.m57474C(act(), this.f34671t3, this.f34642m3, new yaa0(this), m53541wd());
        this.f34688x4.mo168208a(new x20() { // from class: l.h9a0
            @Override // p153l.x20
            public final void call() {
                this.f108328a.m53232Aa();
            }
        });
    }

    /* JADX INFO: renamed from: z9 */
    public final void m53557z9() {
        CoreBusinessModule.m30906m0().mo122548h(this.f34657q1);
        bnl0.m105524M(this.f34657q1.f34998d, false);
        final x20 x20Var = new x20() { // from class: l.c9a0
            @Override // p153l.x20
            public final void call() {
                this.f80316a.m53263Fb();
            }
        };
        this.f34657q1.setEditCallBack(x20Var);
        this.f34466B2.mo168208a(new x20() { // from class: l.d9a0
            @Override // p153l.x20
            public final void call() {
                this.f85724a.m53269Gb(x20Var);
            }
        });
        if (this.f34646n3) {
            return;
        }
        final x20 x20Var2 = new x20() { // from class: l.e9a0
            @Override // p153l.x20
            public final void call() {
                this.f92611a.m53317Nb();
            }
        };
        this.f34466B2.mo168208a(new x20() { // from class: l.g9a0
            @Override // p153l.x20
            public final void call() {
                this.f102777a.m53323Ob(x20Var2);
            }
        });
        this.f34657q1.setMoreCallBack(x20Var2);
        mo53517t1();
    }

    /* JADX INFO: renamed from: za */
    public final /* synthetic */ void m53558za(int i, Intent intent, Throwable th) {
        act().setResult(i, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: zb */
    public final /* synthetic */ void m53559zb(uxj0 uxj0Var) {
        mo52306o();
    }

    /* JADX INFO: renamed from: zc */
    public final /* synthetic */ void m53560zc(View view) {
        i4g0.m138520r("e_user_info_greet_to_city_cover", pageId());
        C8523d.m47079e(act(), this.f34555S3.userId);
    }

    /* JADX INFO: renamed from: zd */
    public final void m53561zd() {
        this.f34657q1.setVisibility(0);
        if (!this.f34650o3) {
            this.f34657q1.m54136k(this.f34628j2, this.f34671t3, this.f34638l3, mo52262R0());
            return;
        }
        boolean z = this.f34638l3;
        if (z) {
            this.f34657q1.m54136k(this.f34628j2, this.f34671t3, z, mo52262R0());
        }
    }
}
