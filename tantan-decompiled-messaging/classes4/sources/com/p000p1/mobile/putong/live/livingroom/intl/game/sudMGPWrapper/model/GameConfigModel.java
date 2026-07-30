package com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GameConfigModel implements Serializable {
    public int gameMode = 1;
    public int gameCPU = 0;
    public int gameSoundControl = 0;
    public int gameSoundVolume = 100;

    /* JADX INFO: renamed from: ui */
    public GameUi f7041ui = new GameUi();

    public static class BlockChangeSeat implements Serializable {
        public boolean custom = false;
    }

    public static class BulletScreensBtn implements Serializable {
        public boolean hide = true;
    }

    public static class GameBg implements Serializable {
        public boolean hide = false;
    }

    public static class GameCancelJoinBtn implements Serializable {
        public boolean custom = false;
        public boolean hide = false;
    }

    public static class GameCancelReadyBtn implements Serializable {
        public boolean custom = false;
        public boolean hide = false;
    }

    public static class GameCountdownTime implements Serializable {
        public boolean hide = false;
    }

    public static class GameHelpBtn implements Serializable {
        public boolean hide = false;
    }

    public static class GameJoinBtn implements Serializable {
        public boolean custom = false;
        public boolean hide = false;
    }

    public static class GameLevel implements Serializable {
        public boolean hide = false;
    }

    public static class GameLobbyGameSetting implements Serializable {
        public boolean hide = false;
    }

    public static class GameLobbyHelpBtn implements Serializable {
        public boolean hide = false;
    }

    public static class GameLobbyPlayerCaptainIcon implements Serializable {
        public boolean hide = false;
    }

    public static class GameLobbyPlayerKickoutIcon implements Serializable {
        public boolean hide = false;
    }

    public static class GameLobbyPlayers implements Serializable {
        public boolean custom = false;
        public boolean hide = false;
    }

    public static class GameLobbyRule implements Serializable {
        public boolean hide = false;
    }

    public static class GameLobbySettingBtn implements Serializable {
        public boolean hide = false;
    }

    public static class GameManagedImage implements Serializable {
        public boolean hide = false;
    }

    public static class GameMvp implements Serializable {
        public boolean hide = true;
    }

    public static class GameOpening implements Serializable {
        public boolean hide = true;
    }

    public static class GameOverTip implements Serializable {
        public boolean hide = false;
    }

    public static class GamePing implements Serializable {
        public boolean hide = false;
    }

    public static class GamePlayers implements Serializable {
        public boolean hide = false;
    }

    public static class GameReadyBtn implements Serializable {
        public boolean custom = false;
        public boolean hide = false;
    }

    public static class GameSelectedTips implements Serializable {
        public boolean hide = false;
    }

    public static class GameSettingSelectPnl implements Serializable {
        public boolean hide = false;
    }

    public static class GameSettle implements Serializable {
        public boolean hide = false;
    }

    public static class GameSettleAgainBtn implements Serializable {
        public boolean custom = false;
        public boolean hide = false;
    }

    public static class GameSettleCloseBtn implements Serializable {
        public boolean custom = false;
        public boolean hide = false;
    }

    public static class GameShareBtn implements Serializable {
        public boolean custom = false;
        public boolean hide = true;
    }

    public static class GameStartBtn implements Serializable {
        public boolean custom = false;
        public boolean hide = false;
    }

    public static class GameSttingBtn implements Serializable {
        public boolean hide = false;
    }

    public static class GameTableImage implements Serializable {
        public boolean hide = false;
    }

    public static class GameUi implements Serializable {
        public GameSettle gameSettle = new GameSettle();
        public GamePing ping = new GamePing();
        public GameVersion version = new GameVersion();
        public GameLevel level = new GameLevel();
        public GameLobbySettingBtn lobby_setting_btn = new GameLobbySettingBtn();
        public GameLobbyHelpBtn lobby_help_btn = new GameLobbyHelpBtn();
        public GameLobbyPlayers lobby_players = new GameLobbyPlayers();
        public GameLobbyPlayerCaptainIcon lobby_player_captain_icon = new GameLobbyPlayerCaptainIcon();
        public GameLobbyPlayerKickoutIcon lobby_player_kickout_icon = new GameLobbyPlayerKickoutIcon();
        public GameLobbyRule lobby_rule = new GameLobbyRule();
        public GameLobbyGameSetting lobby_game_setting = new GameLobbyGameSetting();
        public GameJoinBtn join_btn = new GameJoinBtn();
        public GameCancelJoinBtn cancel_join_btn = new GameCancelJoinBtn();
        public GameReadyBtn ready_btn = new GameReadyBtn();
        public GameCancelReadyBtn cancel_ready_btn = new GameCancelReadyBtn();
        public GameStartBtn start_btn = new GameStartBtn();
        public GameShareBtn share_btn = new GameShareBtn();
        public GameSttingBtn game_setting_btn = new GameSttingBtn();
        public GameHelpBtn game_help_btn = new GameHelpBtn();
        public GameSettleCloseBtn game_settle_close_btn = new GameSettleCloseBtn();
        public GameSettleAgainBtn game_settle_again_btn = new GameSettleAgainBtn();
        public GameBg game_bg = new GameBg();
        public BlockChangeSeat block_change_seat = new BlockChangeSeat();
        public GameSettingSelectPnl game_setting_select_pnl = new GameSettingSelectPnl();
        public GameManagedImage game_managed_image = new GameManagedImage();
        public GameTableImage game_table_image = new GameTableImage();
        public GameCountdownTime game_countdown_time = new GameCountdownTime();
        public GameSelectedTips game_selected_tips = new GameSelectedTips();
        public NFTAvatar nft_avatar = new NFTAvatar();
        public GameOpening game_opening = new GameOpening();
        public GameMvp game_mvp = new GameMvp();
        public UmoIcon umo_icon = new UmoIcon();
        public Logo logo = new Logo();
        public GamePlayers game_players = new GamePlayers();
        public BulletScreensBtn bullet_screens_btn = new BulletScreensBtn();
        public RoundOverPoopBtn round_over_poop_btn = new RoundOverPoopBtn();
        public RoundOverGoodBtn round_over_good_btn = new RoundOverGoodBtn();
        public Mask mask = new Mask();
        public WorstTeammateTip worst_teammate_tip = new WorstTeammateTip();
        public GameOverTip game_over_tip = new GameOverTip();
        public LobbyAnimation lobby_animation = new LobbyAnimation();
    }

    public static class GameVersion implements Serializable {
        public boolean hide = false;
    }

    public static class LobbyAnimation implements Serializable {
        public boolean hide = false;
    }

    public static class Logo implements Serializable {
        public boolean hide = false;
    }

    public static class Mask implements Serializable {
        public boolean transparent = false;
    }

    public static class NFTAvatar implements Serializable {
        public boolean hide = true;
    }

    public static class RoundOverGoodBtn implements Serializable {
        public boolean custom = false;
    }

    public static class RoundOverPoopBtn implements Serializable {
        public boolean custom = false;
    }

    public static class UmoIcon implements Serializable {
        public boolean hide = false;
    }

    public static class WorstTeammateTip implements Serializable {
        public boolean hide = false;
    }
}
