package com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons;

import com.p046p1.mobile.putong.live.base.data.BLiveChatJailedType;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class LayoutDesc {

    /* JADX INFO: renamed from: d */
    public static final LayoutDesc f33864d = ComboType.Like_SuperLike_Match.getLayoutDesc();

    /* JADX INFO: renamed from: b */
    public ComboType f33866b;

    /* JADX INFO: renamed from: a */
    public String f33865a = "unknown";

    /* JADX INFO: renamed from: c */
    public final HashMap<ProfileButton.ProfileButtonType, Boolean> f33867c = new HashMap<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class ComboType {
        private static final /* synthetic */ ComboType[] $VALUES = $values();
        public static final ComboType Chat_Single;
        public static final ComboType Chat_VideoChat;
        public static final ComboType CityC;
        public static final ComboType Dislike_Like_SuperLike;
        public static final ComboType Dislike_Like_SuperLike_Match;
        public static final ComboType Explore_Single;
        public static final ComboType Like_Single;
        public static final ComboType Like_SuperLike_Match;
        public static final ComboType Match;
        public static final ComboType None;
        public static final ComboType Recovery_Single;
        public static final ComboType SuperLike;
        public static final ComboType SuperLike_Match;
        public static final ComboType SuperLike_VideoChat;
        public static final ComboType VideoChat;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$1 */
        public final enum C87071 extends ComboType {
            private C87071(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.Like;
                Boolean bool = Boolean.TRUE;
                layoutDesc.m52391c(profileButtonType, bool);
                layoutDesc.m52391c(ProfileButton.ProfileButtonType.Dislike, bool);
                layoutDesc.m52391c(ProfileButton.ProfileButtonType.SuperLike, bool);
                layoutDesc.m52391c(ProfileButton.ProfileButtonType.OneKeyMatch, bool);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$10 */
        public final enum C870810 extends ComboType {
            private C870810(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                layoutDesc.m52391c(ProfileButton.ProfileButtonType.CityGreet, Boolean.TRUE);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$11 */
        public final enum C870911 extends ComboType {
            private C870911(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                layoutDesc.m52391c(ProfileButton.ProfileButtonType.Chat, Boolean.TRUE);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$12 */
        public final enum C871012 extends ComboType {
            private C871012(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                layoutDesc.m52391c(ProfileButton.ProfileButtonType.Recovery, Boolean.TRUE);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$13 */
        public final enum C871113 extends ComboType {
            private C871113(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = super.getLayoutDesc();
                layoutDesc.m52391c(ProfileButton.ProfileButtonType.Like, Boolean.TRUE);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$14 */
        public final enum C871214 extends ComboType {
            private C871214(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                return super.getLayoutDesc();
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$15 */
        public final enum C871315 extends ComboType {
            private C871315(String str, int i) {
                super(str, i);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$2 */
        public final enum C87142 extends ComboType {
            private C87142(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.Like;
                Boolean bool = Boolean.TRUE;
                layoutDesc.m52391c(profileButtonType, bool);
                layoutDesc.m52391c(ProfileButton.ProfileButtonType.SuperLike, bool);
                layoutDesc.m52391c(ProfileButton.ProfileButtonType.OneKeyMatch, bool);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$3 */
        public final enum C87153 extends ComboType {
            private C87153(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.SuperLike;
                Boolean bool = Boolean.TRUE;
                layoutDesc.m52391c(profileButtonType, bool);
                layoutDesc.m52391c(ProfileButton.ProfileButtonType.OneKeyMatch, bool);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$4 */
        public final enum C87164 extends ComboType {
            private C87164(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                layoutDesc.m52391c(ProfileButton.ProfileButtonType.SuperLike, Boolean.TRUE);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$5 */
        public final enum C87175 extends ComboType {
            private C87175(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                layoutDesc.m52391c(ProfileButton.ProfileButtonType.OneKeyMatch, Boolean.TRUE);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$6 */
        public final enum C87186 extends ComboType {
            private C87186(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.Like;
                Boolean bool = Boolean.TRUE;
                layoutDesc.m52391c(profileButtonType, bool);
                layoutDesc.m52391c(ProfileButton.ProfileButtonType.Dislike, bool);
                layoutDesc.m52391c(ProfileButton.ProfileButtonType.SuperLike, bool);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$7 */
        public final enum C87197 extends ComboType {
            private C87197(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.SuperLike;
                Boolean bool = Boolean.TRUE;
                layoutDesc.m52391c(profileButtonType, bool);
                layoutDesc.m52391c(ProfileButton.ProfileButtonType.VideoChat, bool);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$8 */
        public final enum C87208 extends ComboType {
            private C87208(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.Chat;
                Boolean bool = Boolean.TRUE;
                layoutDesc.m52391c(profileButtonType, bool);
                layoutDesc.m52391c(ProfileButton.ProfileButtonType.VideoChat, bool);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$9 */
        public final enum C87219 extends ComboType {
            private C87219(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                layoutDesc.m52391c(ProfileButton.ProfileButtonType.VideoChat, Boolean.TRUE);
                return layoutDesc;
            }
        }

        private static /* synthetic */ ComboType[] $values() {
            return new ComboType[]{Dislike_Like_SuperLike_Match, Like_SuperLike_Match, SuperLike_Match, SuperLike, Match, Dislike_Like_SuperLike, SuperLike_VideoChat, Chat_VideoChat, VideoChat, CityC, Chat_Single, Recovery_Single, Like_Single, Explore_Single, None};
        }

        static {
            Dislike_Like_SuperLike_Match = new C87071("Dislike_Like_SuperLike_Match", 0);
            Like_SuperLike_Match = new C87142("Like_SuperLike_Match", 1);
            SuperLike_Match = new C87153("SuperLike_Match", 2);
            SuperLike = new C87164("SuperLike", 3);
            Match = new C87175("Match", 4);
            Dislike_Like_SuperLike = new C87186("Dislike_Like_SuperLike", 5);
            SuperLike_VideoChat = new C87197("SuperLike_VideoChat", 6);
            Chat_VideoChat = new C87208("Chat_VideoChat", 7);
            VideoChat = new C87219("VideoChat", 8);
            CityC = new C870810("CityC", 9);
            Chat_Single = new C870911("Chat_Single", 10);
            Recovery_Single = new C871012("Recovery_Single", 11);
            Like_Single = new C871113("Like_Single", 12);
            Explore_Single = new C871214("Explore_Single", 13);
            None = new C871315(BLiveChatJailedType.None, 14);
        }

        public static ComboType valueOf(String str) {
            return (ComboType) Enum.valueOf(ComboType.class, str);
        }

        public static ComboType[] values() {
            return (ComboType[]) $VALUES.clone();
        }

        public LayoutDesc getLayoutDesc() {
            return new LayoutDesc(this);
        }

        private ComboType(String str, int i) {
            super(str, i);
        }
    }

    public LayoutDesc(ComboType comboType) {
        this.f33866b = comboType;
    }

    /* JADX INFO: renamed from: a */
    public ComboType m52389a() {
        return this.f33866b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m52390b(ProfileButton.ProfileButtonType profileButtonType) {
        return this.f33867c.containsKey(profileButtonType) && Boolean.TRUE.equals(this.f33867c.get(profileButtonType));
    }

    /* JADX INFO: renamed from: c */
    public void m52391c(ProfileButton.ProfileButtonType profileButtonType, Boolean bool) {
        this.f33867c.put(profileButtonType, bool);
    }

    public String toString() {
        return "LayoutDesc{source='" + this.f33865a + "', comboType=" + this.f33866b + ", layoutDesc=" + this.f33867c + '}';
    }
}
