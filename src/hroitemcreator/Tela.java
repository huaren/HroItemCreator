package hroitemcreator;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * @author hauren
 */
public class Tela extends javax.swing.JFrame {

    public Tela() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField11 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tab_Panel = new javax.swing.JTabbedPane();
        pan_Item = new javax.swing.JPanel();
        txf_AegisName = new javax.swing.JTextField();
        txf_ID = new javax.swing.JTextField();
        txf_Sell = new javax.swing.JTextField();
        txf_Buy = new javax.swing.JTextField();
        txf_Attack = new javax.swing.JTextField();
        txf_Defense = new javax.swing.JTextField();
        txf_Range = new javax.swing.JTextField();
        txf_Weight = new javax.swing.JTextField();
        txf_ViwerID = new javax.swing.JTextField();
        txf_WeaponLVL = new javax.swing.JTextField();
        txf_Name = new javax.swing.JTextField();
        cbx_ItemType = new javax.swing.JComboBox<>();
        cbx_Refinable = new javax.swing.JComboBox<>();
        cbx_Gender = new javax.swing.JComboBox<>();
        cbx_WeaponType = new javax.swing.JComboBox<>();
        cbx_ShieldType = new javax.swing.JComboBox<>();
        cbx_AmmoType = new javax.swing.JComboBox<>();
        cbx_Slot = new javax.swing.JComboBox<>();
        cbx_WeaponLVL = new javax.swing.JComboBox<>();
        lbl_AegisName = new javax.swing.JLabel();
        lbl_ID = new javax.swing.JLabel();
        lbl_Sell = new javax.swing.JLabel();
        lbl_Buy = new javax.swing.JLabel();
        lbl_Attack = new javax.swing.JLabel();
        lbl_Defense = new javax.swing.JLabel();
        lbl_Range = new javax.swing.JLabel();
        lbl_Weight = new javax.swing.JLabel();
        lbl_ViwerID = new javax.swing.JLabel();
        lbl_EquipLevel = new javax.swing.JLabel();
        lbl_Name = new javax.swing.JLabel();
        lbl_ItemType = new javax.swing.JLabel();
        lbl_Refinable = new javax.swing.JLabel();
        lbl_Gender = new javax.swing.JLabel();
        lbl_WeaponType = new javax.swing.JLabel();
        lbl_ShieldType = new javax.swing.JLabel();
        lbl_AmmoType = new javax.swing.JLabel();
        lbl_Slot = new javax.swing.JLabel();
        lbl_WeaponLVL = new javax.swing.JLabel();
        pan_EquipedBy = new javax.swing.JPanel();
        ckb_NormalJobs = new javax.swing.JCheckBox();
        ckb_UpperJobs = new javax.swing.JCheckBox();
        ckb_BabyJobs = new javax.swing.JCheckBox();
        ckb_3rdJobs = new javax.swing.JCheckBox();
        ckb_Upper3rdJobs = new javax.swing.JCheckBox();
        ckb_Baby3rdJobs = new javax.swing.JCheckBox();
        ckb_EveryJob = new javax.swing.JCheckBox();
        ckb_Novice = new javax.swing.JCheckBox();
        ckb_Swordman = new javax.swing.JCheckBox();
        ckb_Mage = new javax.swing.JCheckBox();
        ckb_Archer = new javax.swing.JCheckBox();
        ckb_Acolyte = new javax.swing.JCheckBox();
        ckb_Merchant = new javax.swing.JCheckBox();
        ckb_Thief = new javax.swing.JCheckBox();
        ckb_Knight = new javax.swing.JCheckBox();
        ckb_Priest = new javax.swing.JCheckBox();
        ckb_Wizard = new javax.swing.JCheckBox();
        ckb_BlackSmith = new javax.swing.JCheckBox();
        ckb_Assassin = new javax.swing.JCheckBox();
        ckb_Hunter = new javax.swing.JCheckBox();
        ckb_Crusader = new javax.swing.JCheckBox();
        ckb_Monk = new javax.swing.JCheckBox();
        ckb_Sage = new javax.swing.JCheckBox();
        ckb_Rogue = new javax.swing.JCheckBox();
        ckb_Alchemist = new javax.swing.JCheckBox();
        ckb_BardDancer = new javax.swing.JCheckBox();
        ckb_Taekwon = new javax.swing.JCheckBox();
        ckb_StarGladiator = new javax.swing.JCheckBox();
        ckb_SoulLinker = new javax.swing.JCheckBox();
        ckb_Gunslinger = new javax.swing.JCheckBox();
        ckb_Ninja = new javax.swing.JCheckBox();
        ckb_KagerouOboro = new javax.swing.JCheckBox();
        ckb_Rebelion = new javax.swing.JCheckBox();
        ckb_LowerHeadGear = new javax.swing.JCheckBox();
        ckb_MiddleHeadGear = new javax.swing.JCheckBox();
        ckb_UpperHeadGear = new javax.swing.JCheckBox();
        ckb_RightHand = new javax.swing.JCheckBox();
        ckb_LeftHand = new javax.swing.JCheckBox();
        ckb_Armor = new javax.swing.JCheckBox();
        ckb_Mantle = new javax.swing.JCheckBox();
        ckb_Shoes = new javax.swing.JCheckBox();
        ckb_Accessory1 = new javax.swing.JCheckBox();
        ckb_Accessory2 = new javax.swing.JCheckBox();
        ckb_CostumeLower = new javax.swing.JCheckBox();
        ckb_CostumeMiddle = new javax.swing.JCheckBox();
        ckb_CostumeUpper = new javax.swing.JCheckBox();
        ckb_ShadowMantle = new javax.swing.JCheckBox();
        ckb_ShadowArmor = new javax.swing.JCheckBox();
        ckb_ShadowWeapon = new javax.swing.JCheckBox();
        ckb_ShadowShield = new javax.swing.JCheckBox();
        ckb_ShadowShoes = new javax.swing.JCheckBox();
        ckb_ShadowAccessory1 = new javax.swing.JCheckBox();
        ckb_ShadowAccessory2 = new javax.swing.JCheckBox();
        pan_Script = new javax.swing.JPanel();
        txf_Script = new javax.swing.JTextField();
        txf_OnEquip = new javax.swing.JTextField();
        txf_OnUnequip = new javax.swing.JTextField();
        lbl_Normal = new javax.swing.JLabel();
        lbl_OnEquip = new javax.swing.JLabel();
        lbl_OnUnequip = new javax.swing.JLabel();
        pan_Data = new javax.swing.JPanel();
        txf_IdentifiedName = new javax.swing.JTextField();
        txf_UnidentifiedName = new javax.swing.JTextField();
        txf_FemaleSpr = new javax.swing.JTextField();
        txf_FemaleAct = new javax.swing.JTextField();
        txf_MaleSpr = new javax.swing.JTextField();
        txf_MaleAct = new javax.swing.JTextField();
        txf_DropSpr = new javax.swing.JTextField();
        txf_ImageItem = new javax.swing.JTextField();
        txf_Collection = new javax.swing.JTextField();
        slp_IdenfifiedDesc = new javax.swing.JScrollPane();
        txa_IdenfifiedDesc = new javax.swing.JTextArea();
        slp_UnidenfifiedDesc = new javax.swing.JScrollPane();
        txa_UnidenfifiedDesc = new javax.swing.JTextArea();
        btn_Collection = new javax.swing.JButton();
        btn_ImageItem = new javax.swing.JButton();
        btn_DropSPR = new javax.swing.JButton();
        btn_MaleACT = new javax.swing.JButton();
        btn_MaleSPR = new javax.swing.JButton();
        btn_FemaleACT = new javax.swing.JButton();
        btn_FemaleSPR = new javax.swing.JButton();
        lbl_IdentifiedName = new javax.swing.JLabel();
        lbl_UnidentifiedName = new javax.swing.JLabel();
        lbl_IdentifiedDesc = new javax.swing.JLabel();
        lbl_UnidentifiedDesc = new javax.swing.JLabel();
        lbl_FemaleSpr = new javax.swing.JLabel();
        lbl_FemaleAct = new javax.swing.JLabel();
        lbl_Male_Spr = new javax.swing.JLabel();
        lbl_Male_Act = new javax.swing.JLabel();
        lbl_DropSpr = new javax.swing.JLabel();
        lbl_ImageItem = new javax.swing.JLabel();
        lbl_Collection = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        men_File = new javax.swing.JMenu();
        mei_New = new javax.swing.JMenuItem();
        mei_Save = new javax.swing.JMenuItem();
        mei_Exit = new javax.swing.JMenuItem();
        men_Language = new javax.swing.JMenu();
        mei_English = new javax.swing.JMenuItem();
        mei_portugues = new javax.swing.JMenuItem();

        jLabel11.setText("ID");

        jLabel16.setText("ID");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tab_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_PanelMouseClicked(evt);
            }
        });

        cbx_ItemType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Healing", "Usable", "Misc", "Weapon", "Armor", "Card", "Pet Egg", "Pet Equipment", "Arrow/Ammunition", "Other" }));
        cbx_ItemType.setSelectedIndex(-1);

        cbx_Refinable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        cbx_Refinable.setSelectedIndex(-1);

        cbx_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Both", "Male", "Female" }));
        cbx_Gender.setSelectedIndex(-1);

        cbx_WeaponType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daggers", "1-Handed Swords", "2-Handed Swords", "1-Handed Spears", "2-Handed Spears", "1-Handed Axes", "2-Handed Axes", "Maces", "Wand/Staff", "Bows/Crossbows", "Knuckle Weapons", "Musicas instrument", "Whips", "Books", "Katars", "Revolvers", "Rifles", "Shotguns", "Gatling guns", "Grenade launcher", "Fuuma shuriken" }));
        cbx_WeaponType.setSelectedIndex(-1);

        cbx_ShieldType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novice Guard", "Buckler", "Shield", "Holy Guard", "Mirror Shield" }));
        cbx_ShieldType.setSelectedIndex(-1);

        cbx_AmmoType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arrows", "Daggers", "Bullets", "Shells", "Grenades", "Shuriken", "Kunai", "Cannonballs", "Sling Item" }));
        cbx_AmmoType.setSelectedIndex(-1);

        cbx_Slot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        cbx_Slot.setSelectedIndex(-1);

        cbx_WeaponLVL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        cbx_WeaponLVL.setSelectedIndex(-1);

        lbl_AegisName.setText("Aegis Name");

        lbl_ID.setText("ID");

        lbl_Sell.setText("Sell");

        lbl_Buy.setText("Buy");

        lbl_Attack.setText("Attack");

        lbl_Defense.setText("Defense");

        lbl_Range.setText("Range");

        lbl_Weight.setText("Weight");

        lbl_ViwerID.setText("Viwer ID");

        lbl_EquipLevel.setText("Equip lvl");

        lbl_Name.setText("Name");

        lbl_ItemType.setText("Item type");

        lbl_Refinable.setText("Refinable");

        lbl_Gender.setText("Gender");

        lbl_WeaponType.setText("Weapon type");

        lbl_ShieldType.setText("Shield type");

        lbl_AmmoType.setText("Ammo type");

        lbl_Slot.setText("Slot");

        lbl_WeaponLVL.setText("Weapon lvl");

        javax.swing.GroupLayout pan_ItemLayout = new javax.swing.GroupLayout(pan_Item);
        pan_Item.setLayout(pan_ItemLayout);
        pan_ItemLayout.setHorizontalGroup(
            pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_ItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txf_AegisName)
                    .addGroup(pan_ItemLayout.createSequentialGroup()
                        .addComponent(txf_Sell, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_ItemType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pan_ItemLayout.createSequentialGroup()
                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Buy, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_Buy, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_Refinable, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Refinable, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pan_ItemLayout.createSequentialGroup()
                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Attack, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_Attack, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_Gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pan_ItemLayout.createSequentialGroup()
                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Defense, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_Defense, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_WeaponType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_WeaponType, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pan_ItemLayout.createSequentialGroup()
                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Range, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_Range, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_ShieldType, 0, 666, Short.MAX_VALUE)
                            .addComponent(lbl_ShieldType, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pan_ItemLayout.createSequentialGroup()
                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_Weight, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Weight, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_AmmoType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_AmmoType, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pan_ItemLayout.createSequentialGroup()
                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Sell, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_Name)
                            .addGroup(pan_ItemLayout.createSequentialGroup()
                                .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_ItemType, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pan_ItemLayout.createSequentialGroup()
                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ViwerID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_ViwerID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pan_ItemLayout.createSequentialGroup()
                                .addComponent(lbl_Slot, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbx_Slot, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pan_ItemLayout.createSequentialGroup()
                        .addComponent(txf_WeaponLVL, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_WeaponLVL, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pan_ItemLayout.createSequentialGroup()
                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_AegisName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pan_ItemLayout.createSequentialGroup()
                                .addComponent(lbl_EquipLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_WeaponLVL, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pan_ItemLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbl_AegisName, lbl_Attack, lbl_Buy, lbl_Defense, lbl_EquipLevel, lbl_ID, lbl_Range, lbl_Sell, lbl_ViwerID, lbl_Weight});

        pan_ItemLayout.setVerticalGroup(
            pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_ItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pan_ItemLayout.createSequentialGroup()
                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pan_ItemLayout.createSequentialGroup()
                                .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pan_ItemLayout.createSequentialGroup()
                                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(pan_ItemLayout.createSequentialGroup()
                                                .addComponent(lbl_AegisName)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txf_AegisName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_ItemLayout.createSequentialGroup()
                                                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_ItemLayout.createSequentialGroup()
                                                                .addComponent(lbl_ID)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(pan_ItemLayout.createSequentialGroup()
                                                                .addComponent(lbl_Name)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txf_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(lbl_Sell)
                                                            .addComponent(lbl_ItemType))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(txf_Sell, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(cbx_ItemType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_Buy)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txf_Buy, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_ItemLayout.createSequentialGroup()
                                                        .addComponent(lbl_Refinable)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cbx_Refinable, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_Attack)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txf_Attack, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pan_ItemLayout.createSequentialGroup()
                                                .addComponent(lbl_Gender)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbx_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_Defense)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txf_Defense, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pan_ItemLayout.createSequentialGroup()
                                        .addComponent(lbl_WeaponType)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbx_WeaponType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_Range)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txf_Range, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pan_ItemLayout.createSequentialGroup()
                                .addComponent(lbl_ShieldType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx_ShieldType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Weight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_Weight, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pan_ItemLayout.createSequentialGroup()
                        .addComponent(lbl_AmmoType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_AmmoType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ViwerID)
                    .addComponent(lbl_Slot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_ViwerID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_Slot, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_EquipLevel)
                    .addComponent(lbl_WeaponLVL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_WeaponLVL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_WeaponLVL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_AegisName.getAccessibleContext().setAccessibleName("");
        lbl_ID.getAccessibleContext().setAccessibleName("");
        lbl_Sell.getAccessibleContext().setAccessibleName("");
        lbl_Buy.getAccessibleContext().setAccessibleName("");
        lbl_Attack.getAccessibleContext().setAccessibleName("");
        lbl_Defense.getAccessibleContext().setAccessibleName("");
        lbl_Range.getAccessibleContext().setAccessibleName("");
        lbl_Weight.getAccessibleContext().setAccessibleName("");
        lbl_ViwerID.getAccessibleContext().setAccessibleName("");
        lbl_EquipLevel.getAccessibleContext().setAccessibleName("");
        lbl_Name.getAccessibleContext().setAccessibleName("");
        lbl_ItemType.getAccessibleContext().setAccessibleName("");
        lbl_Refinable.getAccessibleContext().setAccessibleName("");
        lbl_Gender.getAccessibleContext().setAccessibleName("");
        lbl_WeaponType.getAccessibleContext().setAccessibleName("");
        lbl_ShieldType.getAccessibleContext().setAccessibleName("");
        lbl_AmmoType.getAccessibleContext().setAccessibleName("");
        lbl_Slot.getAccessibleContext().setAccessibleName("");
        lbl_WeaponLVL.getAccessibleContext().setAccessibleName("");

        tab_Panel.addTab("Item", pan_Item);

        ckb_NormalJobs.setText("Normal jobs");

        ckb_UpperJobs.setText("Upper jobs");

        ckb_BabyJobs.setText("Baby jobs");

        ckb_3rdJobs.setText("Third jobs");

        ckb_Upper3rdJobs.setText("Upper third jobs");

        ckb_Baby3rdJobs.setText("Baby third jobs");

        ckb_EveryJob.setText("Every job except Novice");

        ckb_Novice.setText("Novice");

        ckb_Swordman.setText("Swordman");

        ckb_Mage.setText("Mage");

        ckb_Archer.setText("Archer");

        ckb_Acolyte.setText("Acolyte");

        ckb_Merchant.setText("Merchant");

        ckb_Thief.setText("Thief");

        ckb_Knight.setText("Knight");

        ckb_Priest.setText("Priest");

        ckb_Wizard.setText("Wizard");

        ckb_BlackSmith.setText("Blacksmith");

        ckb_Assassin.setText("Assassin");

        ckb_Hunter.setText("Hunter");

        ckb_Crusader.setText("Crusader");

        ckb_Monk.setText("Monk");

        ckb_Sage.setText("Sage");

        ckb_Rogue.setText("Rogue");

        ckb_Alchemist.setText("Alchemist");

        ckb_BardDancer.setText("Bard/Dancer");

        ckb_Taekwon.setText("Taekwon");

        ckb_StarGladiator.setText("StarGladiator");

        ckb_SoulLinker.setText("Soul linker");

        ckb_Gunslinger.setText("Gunslinger");

        ckb_Ninja.setText("Ninja");

        ckb_KagerouOboro.setText("Kagerou/Oboro");

        ckb_Rebelion.setText("Rebelion");

        ckb_LowerHeadGear.setText("Lower headgear");

        ckb_MiddleHeadGear.setText("Middle headgear");

        ckb_UpperHeadGear.setText("Upper headgear");

        ckb_RightHand.setText("Right hand");

        ckb_LeftHand.setText("Left hand");

        ckb_Armor.setText("Armor");

        ckb_Mantle.setText("Mantle");

        ckb_Shoes.setText("Shoes");

        ckb_Accessory1.setText("Accessory 1");

        ckb_Accessory2.setText("Accessory 2");

        ckb_CostumeLower.setText("[Costume] Lower headgear");

        ckb_CostumeMiddle.setText("[Costume] Middle headgear");

        ckb_CostumeUpper.setText("[Costume] Upper headgear");

        ckb_ShadowMantle.setText("[Costume] Mantle");

        ckb_ShadowArmor.setText("[Shadow] Armor");

        ckb_ShadowWeapon.setText("[Shadow] Weapon");

        ckb_ShadowShield.setText("[Shadow] Shield");

        ckb_ShadowShoes.setText("[Shadow] Shoes");

        ckb_ShadowAccessory1.setText("[Shadow] Accessory 1");

        ckb_ShadowAccessory2.setText("[Shadow] Accessory 2");

        javax.swing.GroupLayout pan_EquipedByLayout = new javax.swing.GroupLayout(pan_EquipedBy);
        pan_EquipedBy.setLayout(pan_EquipedByLayout);
        pan_EquipedByLayout.setHorizontalGroup(
            pan_EquipedByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_EquipedByLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_EquipedByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckb_StarGladiator, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Rogue, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Priest, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Thief, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Knight, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Wizard, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_BlackSmith, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Hunter, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Crusader, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Assassin, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Monk, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Sage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Alchemist, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Taekwon, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_BardDancer, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_SoulLinker, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_KagerouOboro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Gunslinger, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Ninja, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Rebelion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Archer, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Acolyte, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Mage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Swordman, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Novice, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_EveryJob, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Merchant, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pan_EquipedByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckb_Upper3rdJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Baby3rdJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_3rdJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_BabyJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_UpperJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_NormalJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pan_EquipedByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ckb_CostumeMiddle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ckb_CostumeUpper, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ckb_Accessory2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_MiddleHeadGear, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_UpperHeadGear, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_RightHand, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_LeftHand, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Armor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Mantle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Shoes, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Accessory1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_CostumeLower, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_LowerHeadGear, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_ShadowMantle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_ShadowAccessory2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_ShadowAccessory1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_ShadowArmor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_ShadowWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_ShadowShield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_ShadowShoes, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        pan_EquipedByLayout.setVerticalGroup(
            pan_EquipedByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_EquipedByLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_EquipedByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan_EquipedByLayout.createSequentialGroup()
                        .addComponent(ckb_EveryJob, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Novice, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Swordman, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Mage, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Archer, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Acolyte, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pan_EquipedByLayout.createSequentialGroup()
                        .addComponent(ckb_NormalJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_UpperJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_BabyJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_3rdJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Upper3rdJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Baby3rdJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckb_Merchant, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_EquipedByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan_EquipedByLayout.createSequentialGroup()
                        .addComponent(ckb_LowerHeadGear, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_MiddleHeadGear, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_UpperHeadGear, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_RightHand, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(pan_EquipedByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ckb_LeftHand, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckb_BlackSmith, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Armor, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Mantle, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Shoes, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Accessory1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Accessory2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ckb_CostumeLower, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(pan_EquipedByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ckb_CostumeMiddle, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckb_Alchemist, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pan_EquipedByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ckb_CostumeUpper, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckb_BardDancer, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pan_EquipedByLayout.createSequentialGroup()
                        .addComponent(ckb_Thief, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Knight, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Priest, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Wizard, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ckb_Hunter, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Assassin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Crusader, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Monk, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Sage, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ckb_Rogue, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_EquipedByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckb_ShadowMantle, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckb_Taekwon, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_EquipedByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan_EquipedByLayout.createSequentialGroup()
                        .addComponent(ckb_ShadowArmor, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_ShadowWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_ShadowShield, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_ShadowShoes, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pan_EquipedByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ckb_ShadowAccessory2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckb_Rebelion, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pan_EquipedByLayout.createSequentialGroup()
                        .addComponent(ckb_StarGladiator, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_SoulLinker, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Gunslinger, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckb_Ninja, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pan_EquipedByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ckb_KagerouOboro, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckb_ShadowAccessory1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab_Panel.addTab("Equiped by", pan_EquipedBy);

        lbl_Normal.setText("Normal");

        lbl_OnEquip.setText("OnEquip");

        lbl_OnUnequip.setText("OnUnequip");

        javax.swing.GroupLayout pan_ScriptLayout = new javax.swing.GroupLayout(pan_Script);
        pan_Script.setLayout(pan_ScriptLayout);
        pan_ScriptLayout.setHorizontalGroup(
            pan_ScriptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_ScriptLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_ScriptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan_ScriptLayout.createSequentialGroup()
                        .addComponent(lbl_Normal)
                        .addGap(327, 327, 327))
                    .addGroup(pan_ScriptLayout.createSequentialGroup()
                        .addGroup(pan_ScriptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_Script)
                            .addGroup(pan_ScriptLayout.createSequentialGroup()
                                .addGroup(pan_ScriptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txf_OnEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_OnEquip))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pan_ScriptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txf_OnUnequip, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_OnUnequip))))
                        .addContainerGap())))
        );

        pan_ScriptLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbl_OnEquip, lbl_OnUnequip});

        pan_ScriptLayout.setVerticalGroup(
            pan_ScriptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_ScriptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Normal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txf_Script, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_ScriptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_OnEquip)
                    .addComponent(lbl_OnUnequip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_ScriptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_OnEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_OnUnequip, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tab_Panel.addTab("Script", pan_Script);

        txa_IdenfifiedDesc.setColumns(20);
        txa_IdenfifiedDesc.setLineWrap(true);
        txa_IdenfifiedDesc.setRows(5);
        txa_IdenfifiedDesc.setToolTipText("");
        slp_IdenfifiedDesc.setViewportView(txa_IdenfifiedDesc);

        txa_UnidenfifiedDesc.setColumns(20);
        txa_UnidenfifiedDesc.setLineWrap(true);
        txa_UnidenfifiedDesc.setRows(5);
        slp_UnidenfifiedDesc.setViewportView(txa_UnidenfifiedDesc);

        btn_Collection.setText("...");

        btn_ImageItem.setText("...");

        btn_DropSPR.setText("...");

        btn_MaleACT.setText("...");

        btn_MaleSPR.setText("...");

        btn_FemaleACT.setText("...");

        btn_FemaleSPR.setText("...");

        lbl_IdentifiedName.setText("Identified name");

        lbl_UnidentifiedName.setText("Unidentified name");

        lbl_IdentifiedDesc.setText("Identified Description");

        lbl_UnidentifiedDesc.setText("Unidentified description");

        lbl_FemaleSpr.setText("Female equip SPR");

        lbl_FemaleAct.setText("Female equip ACT");

        lbl_Male_Spr.setText("Male equip SPR ");

        lbl_Male_Act.setText("Male equip ACT");

        lbl_DropSpr.setText("Drop SPR");

        lbl_ImageItem.setText("Image Item");

        lbl_Collection.setText("Collection folder");

        javax.swing.GroupLayout pan_DataLayout = new javax.swing.GroupLayout(pan_Data);
        pan_Data.setLayout(pan_DataLayout);
        pan_DataLayout.setHorizontalGroup(
            pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_DataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan_DataLayout.createSequentialGroup()
                        .addComponent(lbl_FemaleAct, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_FemaleAct, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_FemaleACT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pan_DataLayout.createSequentialGroup()
                        .addGroup(pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Collection, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(lbl_Male_Spr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_DropSpr, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(lbl_Male_Act, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(lbl_ImageItem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_DropSpr, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                            .addComponent(txf_ImageItem, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                            .addComponent(txf_Collection, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                            .addComponent(txf_MaleAct, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                            .addComponent(txf_MaleSpr, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_MaleACT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_MaleSPR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_DropSPR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ImageItem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Collection, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pan_DataLayout.createSequentialGroup()
                        .addGroup(pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_IdentifiedName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_IdentifiedDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slp_IdenfifiedDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(txf_IdentifiedName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_UnidentifiedDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_UnidentifiedName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slp_UnidenfifiedDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(txf_UnidentifiedName)))
                    .addGroup(pan_DataLayout.createSequentialGroup()
                        .addComponent(lbl_FemaleSpr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_FemaleSpr, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_FemaleSPR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pan_DataLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbl_Collection, lbl_DropSpr, lbl_Male_Act, lbl_Male_Spr});

        pan_DataLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txf_Collection, txf_DropSpr, txf_FemaleAct, txf_FemaleSpr, txf_ImageItem, txf_MaleAct, txf_MaleSpr});

        pan_DataLayout.setVerticalGroup(
            pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_DataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_IdentifiedName)
                    .addComponent(lbl_UnidentifiedName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_IdentifiedName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_UnidentifiedName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_IdentifiedDesc)
                    .addComponent(lbl_UnidentifiedDesc))
                .addGroup(pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pan_DataLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slp_IdenfifiedDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pan_DataLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(slp_UnidenfifiedDesc)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_FemaleSpr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_FemaleSpr)
                    .addComponent(btn_FemaleSPR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_FemaleAct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_FemaleAct)
                    .addComponent(btn_FemaleACT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_MaleSpr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Male_Spr)
                    .addComponent(btn_MaleSPR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_MaleAct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Male_Act)
                    .addComponent(btn_MaleACT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_DropSpr)
                    .addComponent(txf_DropSpr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_DropSPR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_ImageItem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ImageItem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ImageItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_Collection, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Collection, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Collection))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab_Panel.addTab("Data", pan_Data);

        men_File.setText("File");

        mei_New.setText("New");
        mei_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mei_NewActionPerformed(evt);
            }
        });
        men_File.add(mei_New);

        mei_Save.setText("Save");
        mei_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mei_SaveActionPerformed(evt);
            }
        });
        men_File.add(mei_Save);

        mei_Exit.setText("Exit");
        mei_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mei_ExitActionPerformed(evt);
            }
        });
        men_File.add(mei_Exit);

        jMenuBar1.add(men_File);

        men_Language.setText("Language");

        mei_English.setText("English");
        mei_English.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mei_EnglishActionPerformed(evt);
            }
        });
        men_Language.add(mei_English);

        mei_portugues.setText("Portuguese");
        mei_portugues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mei_portuguesActionPerformed(evt);
            }
        });
        men_Language.add(mei_portugues);

        jMenuBar1.add(men_Language);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tab_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tab_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mei_portuguesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mei_portuguesActionPerformed
        setLangPT();
    }//GEN-LAST:event_mei_portuguesActionPerformed

    private void mei_EnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mei_EnglishActionPerformed
        setLangEn();
    }//GEN-LAST:event_mei_EnglishActionPerformed

    private void mei_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mei_NewActionPerformed
        if(lang.equals("EN")){
            int reply = JOptionPane.showConfirmDialog(null, "Are you sure?","Mew item?", JOptionPane.YES_NO_OPTION);
            if(reply == JOptionPane.YES_OPTION){
                newItem();
            }
        }
        else if(lang.equals("PT")){
            int reply = JOptionPane.showConfirmDialog(null, "Você tem certeza?","Novo item?", JOptionPane.YES_NO_OPTION);
            if(reply == JOptionPane.YES_OPTION){
                newItem();
            }
        }
    }//GEN-LAST:event_mei_NewActionPerformed

    private void mei_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mei_ExitActionPerformed
        if(lang.equals("EN")){
            int reply = JOptionPane.showConfirmDialog(null, "Are you sure?","Exit?",JOptionPane.YES_NO_OPTION);
            if(reply == JOptionPane.YES_OPTION){
                System.exit(1);
            }
        }
        else if (lang.equals("PT")){
            int reply = JOptionPane.showConfirmDialog(null, "Você tem certeza?","Sair?",JOptionPane.YES_NO_OPTION);
            if(reply == JOptionPane.YES_OPTION){
                System.exit(1);
            }
        }
    }//GEN-LAST:event_mei_ExitActionPerformed

    private void mei_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mei_SaveActionPerformed
        makeFile();
    }//GEN-LAST:event_mei_SaveActionPerformed

    private void tab_PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_PanelMouseClicked
        switch (cbx_Gender.getSelectedIndex()) {
            case 0:
                txf_FemaleAct.setEnabled(true);
                txf_FemaleSpr.setEnabled(true);
                txf_MaleAct.setEnabled(true);
                txf_MaleSpr.setEnabled(true);
                btn_FemaleACT.setEnabled(true);
                btn_MaleSPR.setEnabled(true);
                btn_MaleACT.setEnabled(true);
                btn_MaleSPR.setEnabled(true);
                break;
            case 1:
                txf_FemaleAct.setEnabled(false);
                txf_FemaleSpr.setEnabled(false);
                txf_MaleAct.setEnabled(true);
                txf_MaleSpr.setEnabled(true);
                btn_FemaleACT.setEnabled(false);
                btn_FemaleSPR.setEnabled(false);
                btn_MaleACT.setEnabled(true);
                btn_MaleSPR.setEnabled(true);
                txf_FemaleAct.setText("");
                txf_FemaleSpr.setText("");
                break;
            case 2:
                txf_FemaleAct.setEnabled(true);
                txf_FemaleSpr.setEnabled(true);
                txf_MaleAct.setEnabled(false);
                txf_MaleSpr.setEnabled(false);
                btn_FemaleACT.setEnabled(true);
                btn_FemaleSPR.setEnabled(true);
                btn_MaleACT.setEnabled(false);
                btn_MaleSPR.setEnabled(false);
                txf_MaleAct.setText("");
                txf_MaleSpr.setText("");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_tab_PanelMouseClicked
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }
    
    public void setLangPT(){ // void to set the language to portuguese
        lang = "PT";
        // translate tabbed panel
        tab_Panel.setTitleAt(1, "Equipado por");
        tab_Panel.setTitleAt(3, "Cliente");
        //Comboboxes translate
        i = cbx_ItemType.getSelectedIndex();
        cbx_ItemType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cura", "Usavel", "Etc", "Arma", "Armadura", "Carta", "Ovo de bichinho", "Equipamento de bichinho", "Flechas/Munição", "Outros" }));
        cbx_ItemType.setSelectedIndex(i);        
        i = cbx_Refinable.getSelectedIndex();
        cbx_Refinable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        cbx_Refinable.setSelectedIndex(i);
        i = cbx_Gender.getSelectedIndex();
        cbx_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ambos", "Masculino", "Feminino" }));
        cbx_Gender.setSelectedIndex(i);
        i = cbx_WeaponType.getSelectedIndex();
        cbx_WeaponType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adagas", "Espadas de 1 mão", "Espadas de 2 maõs", "Lança de 1 mão", "Lança de 2 maõs", "Machado de 1 mão", "Machado de 2 maõs", "Maças", "Varinha/Cajado", "Arco/Besta", "Punho", "Instrumento musicai", "Chicote", "Livro", "Katar", "Revólver", "Rifles", "Espingardas", "Gatling guns", "Lança granadas", "Shuriken fuuma" }));
        cbx_WeaponType.setSelectedIndex(i);
        i = cbx_ShieldType.getSelectedIndex();
        cbx_ShieldType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escudo do aprendiz", "Broquel", "Escudo", "Escudo sagrado", "Escudo espelhado" }));
        cbx_ShieldType.setSelectedIndex(i);
        i = cbx_AmmoType.getSelectedIndex();
        cbx_AmmoType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flechas", "Adagas", "Balas", "Cartuchos", "Granadas", "Shuriken", "Kunai", "Balas de canhão", "Item Arremessaveis" }));
        cbx_AmmoType.setSelectedIndex(i);
        //focus on frist item
        txf_AegisName.requestFocus();
        //checkboxes translate
        ckb_Acolyte.setText("Noviço");
        ckb_Alchemist.setText("Alquimista");
        ckb_Archer.setText("Arqueiro");
        ckb_Armor.setText("Armadura");
        ckb_Assassin.setText("Assassino");
        ckb_BardDancer.setText("Bardo/Odalisca");
        ckb_BlackSmith.setText("Ferreiro");
        ckb_Crusader.setText("Templario");
        ckb_EveryJob.setText("Todas exceto aprendiz");
        ckb_Gunslinger.setText("Justiceiro");
        ckb_Hunter.setText("Caçador");
        ckb_Knight.setText("Cavaleiro");
        ckb_Mage.setText("Mago");
        ckb_Merchant.setText("Mercador");
        ckb_Monk.setText("Monje");
        ckb_Ninja.setText("Ninja");
        ckb_Novice.setText("Aprendiz");
        ckb_Priest.setText("Sarcerdote");
        ckb_Rebelion.setText("Rebelion");
        ckb_Rogue.setText("Desordeiro");
        ckb_Sage.setText("Sabio");
        ckb_SoulLinker.setText("Espiritualista");
        ckb_StarGladiator.setText("Mestre tarkwon");
        ckb_Swordman.setText("Espadachin");
        ckb_Taekwon.setText("Tarkwon");
        ckb_Thief.setText("Gatuno");
        ckb_Wizard.setText("Bruxo");
        ckb_KagerouOboro.setText("Kagerou/Oboro");
        // JOBS
        ckb_NormalJobs.setText("Classes normais");
        ckb_3rdJobs.setText("Terceiras classes");
        ckb_Baby3rdJobs.setText("Terceiras classes bebês");
        ckb_BabyJobs.setText("Classes bebês");
        ckb_Upper3rdJobs.setText("Terceiras classes extendidas");
        ckb_UpperJobs.setText("Classes extendidas");
        // Equips
        ckb_RightHand.setText("Mão direita");
        ckb_Mantle.setText("Manto");
        ckb_UpperHeadGear.setText("Topo");
        ckb_LeftHand.setText("Mão esqueda");
        ckb_LowerHeadGear.setText("Baixo");
        ckb_MiddleHeadGear.setText("Meio");
        ckb_Accessory1.setText("Acessorio 1");
        ckb_Accessory2.setText("Acessorio 2");
        ckb_ShadowAccessory1.setText("[Fantasma] Acessorio 1");
        ckb_ShadowAccessory2.setText("[Fantasma] Acessorio 2");
        ckb_ShadowArmor.setText("[Fantasma] Armadura");
        ckb_ShadowMantle.setText("[Visual] Manto");
        ckb_ShadowShield.setText("[Fantasma] Escudo");
        ckb_ShadowShoes.setText("[Fantasma] Sapato");
        ckb_ShadowWeapon.setText("[Fantasma] Arma");
        ckb_Shoes.setText("Sapato");
        ckb_CostumeLower.setText("[Visual] Baixo");
        ckb_CostumeMiddle.setText("[Visual] Meio");
        ckb_CostumeUpper.setText("[Visual] Topo");
        // Left Side
        lbl_AegisName.setText("Nome aegis");
        lbl_AmmoType.setText("Munição");
        lbl_Attack.setText("Ataque");
        lbl_Buy.setText("Preço Compra");
        lbl_Defense.setText("Defesa");
        lbl_EquipLevel.setText("Level p/ equipar");
        lbl_Gender.setText("Genero");
        lbl_Name.setText("Nome");
        lbl_ItemType.setText("Tipo do item");
        lbl_ID.setText("ID");
        lbl_Range.setText("Alcance");
        lbl_Refinable.setText("Refinavel?");
        lbl_Sell.setText("Preço venda");
        lbl_ShieldType.setText("Tipo do escudo");
        lbl_Slot.setText("Slot");
        lbl_ViwerID.setText("Viwer ID");
        lbl_WeaponLVL.setText("Level da arma");
        lbl_Weight.setText("Peso");
        //Script
        lbl_Normal.setText("Normal");
        lbl_OnEquip.setText("Ao equipar");
        lbl_OnUnequip.setText("Ao desequipar");
        //Data
        lbl_IdentifiedName.setText("Nome identificado");
        lbl_UnidentifiedName.setText("Nome não identificado");
        lbl_IdentifiedDesc.setText("Descrição identificado");
        lbl_UnidentifiedDesc.setText("Descrição não identificado");
        lbl_FemaleSpr.setText("SPR feminino");
        lbl_FemaleAct.setText("ACT feminino");
        lbl_Male_Spr.setText("SPR masculino");
        lbl_Male_Act.setText("SPR masculino");
        lbl_DropSpr.setText("SPR ao dropar");
        lbl_ImageItem.setText("Imagem do item");
        lbl_Collection.setText("Pasta collection");
        //Menu
        men_File.setText("Arquivo");
        men_Language.setText("Idioma");
        mei_English.setText("Inglês");
        mei_portugues.setText("Português");
        mei_Exit.setText("Sair");
        mei_New.setText("Novo");
        mei_Save.setText("Salvar");
    }
    public void setLangEn(){ // void to set the language to english
        lang = "EN";
        // tranlate tabbed panel
        tab_Panel.setTitleAt(1, "Equiped by");
        tab_Panel.setTitleAt(3, "Client");
        //Comboboxes translate
        i = cbx_ItemType.getSelectedIndex();
        cbx_ItemType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Healing", "Usable", "Misc", "Weapon", "Armor", "Card", "Pet Egg", "Pet Equipment", "Arrow/Ammunition", "Other" }));
        cbx_ItemType.setSelectedIndex(i);        
        i = cbx_Refinable.getSelectedIndex();
        cbx_Refinable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        cbx_Refinable.setSelectedIndex(i);
        i = cbx_Gender.getSelectedIndex();
        cbx_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Both", "Male", "Female" }));
        cbx_Gender.setSelectedIndex(i);
        i = cbx_WeaponType.getSelectedIndex();
        cbx_WeaponType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daggers", "1-Handed Swords", "2-Handed Swords", "1-Handed Spears", "2-Handed Spears", "1-Handed Axes", "2-Handed Axes", "Maces", "Wand/Staff", "Bows/Crossbows", "Knuckle Weapons", "Instrument", "Whips", "Books", "Katars", "Revolvers", "Rifles", "Shotguns", "Gatling guns", "Grenade launcher", "Fuuma shuriken" }));
        cbx_WeaponType.setSelectedIndex(i);
        i = cbx_ShieldType.getSelectedIndex();
        cbx_ShieldType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novice Guard", "Buckler", "Shield", "Holy Guard", "Mirror Shield" }));
        cbx_ShieldType.setSelectedIndex(i);
        i = cbx_AmmoType.getSelectedIndex();
        cbx_AmmoType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arrows", "Daggers", "Bullets", "Shells", "Grenades", "Shuriken", "Kunai", "Cannonballs", "Sling Item" }));
        cbx_AmmoType.setSelectedIndex(i);
       //focus on frist item
        txf_AegisName.requestFocus();
        //checkboxes translate
        ckb_Acolyte.setText("Acolyte");
        ckb_Alchemist.setText("Alchemist");
        ckb_Archer.setText("Archer");
        ckb_Armor.setText("Armor");
        ckb_Assassin.setText("Assassin");
        ckb_BardDancer.setText("Bard/Dancer");
        ckb_BlackSmith.setText("Blacksmith");
        ckb_Crusader.setText("Crusader");
        ckb_EveryJob.setText("Every job except Novice");
        ckb_Gunslinger.setText("Gunslinger");
        ckb_Hunter.setText("Hunter");
        ckb_Knight.setText("Knight");
        ckb_Mage.setText("Mage");
        ckb_Merchant.setText("Merchant");
        ckb_Monk.setText("Monk");
        ckb_Ninja.setText("Ninja");
        ckb_Novice.setText("Novice");
        ckb_Priest.setText("Priest");
        ckb_Rebelion.setText("Rebelion");
        ckb_Rogue.setText("Rogue");
        ckb_Sage.setText("Sage");
        ckb_SoulLinker.setText("Soul linker");
        ckb_StarGladiator.setText("StarGladiator");
        ckb_Swordman.setText("Swordman");
        ckb_Taekwon.setText("Taekwon");
        ckb_Thief.setText("Thief");
        ckb_Wizard.setText("Wizard");
        ckb_KagerouOboro.setText("Kagerou/Oboro");
        // JOBS
        ckb_NormalJobs.setText("Normal jobs");
        ckb_3rdJobs.setText("Third jobs");
        ckb_Baby3rdJobs.setText("Baby third jobs");
        ckb_BabyJobs.setText("Baby jobs");
        ckb_Upper3rdJobs.setText("Upper third jobs");
        ckb_UpperJobs.setText("Upper jobs");
        // Equips
        ckb_RightHand.setText("Right hand");
        ckb_Mantle.setText("Mantle");
        ckb_UpperHeadGear.setText("Upper headgear");
        ckb_LeftHand.setText("Left hand");
        ckb_LowerHeadGear.setText("Lower headgear");
        ckb_MiddleHeadGear.setText("Middle headgear");
        ckb_Accessory1.setText("Accessory 1");
        ckb_Accessory2.setText("Accessory 2");
        ckb_ShadowAccessory1.setText("[Shadow] Accessory 1");
        ckb_ShadowAccessory2.setText("[Shadow] Accessory 2");
        ckb_ShadowArmor.setText("[Shadow] Armor");
        ckb_ShadowMantle.setText("[Costume] Mantle");
        ckb_ShadowShield.setText("[Shadow] Shield");
        ckb_ShadowShoes.setText("[Shadow] Shoes");
        ckb_ShadowWeapon.setText("[Shadow] Weapon");
        ckb_Shoes.setText("Shoes");
        ckb_CostumeLower.setText("[Costume] Lower headgear");
        ckb_CostumeMiddle.setText("[Costume] Middle headgear");
        ckb_CostumeUpper.setText("[Costume] Upper headgear");
        // Left Side
        lbl_AegisName.setText("Aegis name");
        lbl_AmmoType.setText("Ammo type");
        lbl_Attack.setText("Attack");
        lbl_Buy.setText("Buy");
        lbl_Defense.setText("Defense");
        lbl_EquipLevel.setText("Equip lvl");
        lbl_Gender.setText("Gender");
        lbl_Name.setText("Name");
        lbl_ItemType.setText("Item type");
        lbl_ID.setText("ID");
        lbl_Range.setText("Range");
        lbl_Refinable.setText("Refinable");
        lbl_Sell.setText("Sell");
        lbl_ShieldType.setText("Shield type");
        lbl_Slot.setText("Slot");
        lbl_ViwerID.setText("Viwer ID");
        lbl_WeaponLVL.setText("Weapon lvl");
        lbl_Weight.setText("Weight");
        //Script
        lbl_Normal.setText("Normal");
        lbl_OnEquip.setText("OnEquip");
        lbl_OnUnequip.setText("OnUnequip");
        //DATA
        lbl_IdentifiedName.setText("Identified name");
        lbl_UnidentifiedName.setText("Unidentified name");
        lbl_IdentifiedDesc.setText("Identified description");
        lbl_UnidentifiedDesc.setText("Unidentified description");
        lbl_FemaleSpr.setText("Female equip SPR");
        lbl_FemaleAct.setText("Female equip ACT");
        lbl_Male_Spr.setText("Male equip SPR");
        lbl_Male_Act.setText("Male equip ACT");
        lbl_DropSpr.setText("Drop SPR");
        lbl_ImageItem.setText("Image item");
        lbl_Collection.setText("Collection folder");
        //Menu
        men_File.setText("File");
        men_Language.setText("Language");
        mei_English.setText("English");
        mei_portugues.setText("Portuguese");
        mei_Exit.setText("Exit");
        mei_New.setText("New");
        mei_Save.setText("Save");
    }   
    public void newItem(){
        // reset focus on frist item
        tab_Panel.setSelectedIndex(0);
        txf_AegisName.requestFocus();
        // set text as null
        txf_AegisName.setText("");
        txf_Attack.setText("");
        txf_Buy.setText("");
        txf_Collection.setText("");
        txf_Defense.setText("");
        txf_DropSpr.setText("");
        txf_FemaleAct.setText("");
        txf_FemaleSpr.setText("");
        txf_ID.setText("");
        txf_IdentifiedName.setText("");
        txf_ImageItem.setText("");
        txf_MaleAct.setText("");
        txf_MaleSpr.setText("");
        txf_Name.setText("");
        txf_OnEquip.setText("");
        txf_OnUnequip.setText("");
        txf_Range.setText("");
        txf_Script.setText("");
        txf_Sell.setText("");
        txf_UnidentifiedName.setText("");
        txf_ViwerID.setText("");
        txf_WeaponLVL.setText("");
        txf_Weight.setText("");
        // set combo box default index
        cbx_AmmoType.setSelectedIndex(-1);
        cbx_Gender.setSelectedIndex(-1);
        cbx_ItemType.setSelectedIndex(-1);
        cbx_Refinable.setSelectedIndex(-1);
        cbx_ShieldType.setSelectedIndex(-1);
        cbx_Slot.setSelectedIndex(-1);
        cbx_WeaponLVL.setSelectedIndex(-1);
        cbx_WeaponType.setSelectedIndex(-1);
        // check boxes set deafult
        
        ///
        
        ///
        
        ckb_Acolyte.setSelected(false);
        ckb_Alchemist.setSelected(false);
        ckb_Archer.setSelected(false);
        ckb_Armor.setSelected(false);
        ckb_Assassin.setSelected(false);
        ckb_BardDancer.setSelected(false);
        ckb_BlackSmith.setSelected(false);
        ckb_Crusader.setSelected(false);
        ckb_EveryJob.setSelected(false);
        ckb_Gunslinger.setSelected(false);
        ckb_Hunter.setSelected(false);
        ckb_Knight.setSelected(false);
        ckb_Mage.setSelected(false);
        ckb_Merchant.setSelected(false);
        ckb_Monk.setSelected(false);
        ckb_Ninja.setSelected(false);
        ckb_Novice.setSelected(false);
        ckb_Priest.setSelected(false);
        ckb_Rebelion.setSelected(false);
        ckb_Rogue.setSelected(false);
        ckb_Sage.setSelected(false);
        ckb_SoulLinker.setSelected(false);
        ckb_StarGladiator.setSelected(false);
        ckb_Swordman.setSelected(false);
        ckb_Taekwon.setSelected(false);
        ckb_Thief.setSelected(false);
        ckb_Wizard.setSelected(false);
        ckb_KagerouOboro.setSelected(false);
        // JOBS
        ckb_NormalJobs.setSelected(false);
        ckb_3rdJobs.setSelected(false);
        ckb_Baby3rdJobs.setSelected(false);
        ckb_BabyJobs.setSelected(false);
        ckb_Upper3rdJobs.setSelected(false);
        ckb_UpperJobs.setSelected(false);
        // Equips
        ckb_RightHand.setSelected(false);
        ckb_Mantle.setSelected(false);
        ckb_UpperHeadGear.setSelected(false);
        ckb_LeftHand.setSelected(false);
        ckb_LowerHeadGear.setSelected(false);
        ckb_MiddleHeadGear.setSelected(false);
        ckb_Accessory1.setSelected(false);
        ckb_Accessory2.setSelected(false);
        ckb_ShadowAccessory1.setSelected(false);
        ckb_ShadowAccessory2.setSelected(false);
        ckb_ShadowArmor.setSelected(false);
        ckb_ShadowMantle.setSelected(false);
        ckb_ShadowShield.setSelected(false);
        ckb_ShadowShoes.setSelected(false);
        ckb_ShadowWeapon.setSelected(false);
        ckb_Shoes.setSelected(false);
        ckb_CostumeLower.setSelected(false);
        ckb_CostumeMiddle.setSelected(false);
        ckb_CostumeUpper.setSelected(false);
    }
    public void makeFile(){
        // folder
        File db             = new File("Output/Emulator/db");
        File system         = new File("Output/Client/system");
        File drop           = new File("Output/Client/data/sprite/¾ÆÀÌÅÛ/");
        File femaleSprite   = new File("Output/Client/data/sprite/¾Ç¼¼»ç¸®/¿©/");
        File maleSprite     = new File("Output/Client/data/sprite/¾Ç¼¼»ç¸®/³²/");
        File item           = new File("Output/Client/data/texture/À¯ÀúÀÎÅÍÆäÀÌ½º/item/");
        File collection     = new File("Output/Client/data/texture/À¯ÀúÀÎÅÍÆäÀÌ½º/collection/");
        
        // make folders
        db.mkdirs();
        system.mkdirs();
        drop.mkdirs();
        femaleSprite.mkdirs();
        maleSprite.mkdirs();
        item.mkdirs();
        collection.mkdirs();
        // files
        File itemdb = new File("Output/Emulator/db/item_db2.txt");
        File iteminfo = new File("Output/Client/system/iteminfo.lub");
        
        try {
            itemdb.createNewFile();
            iteminfo.createNewFile();
        } catch (IOException ex) {
            
        }
    }
    
    //My Variables
    String lang = "EN";
    int i;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Collection;
    private javax.swing.JButton btn_DropSPR;
    private javax.swing.JButton btn_FemaleACT;
    private javax.swing.JButton btn_FemaleSPR;
    private javax.swing.JButton btn_ImageItem;
    private javax.swing.JButton btn_MaleACT;
    private javax.swing.JButton btn_MaleSPR;
    private javax.swing.JComboBox<String> cbx_AmmoType;
    private javax.swing.JComboBox<String> cbx_Gender;
    private javax.swing.JComboBox<String> cbx_ItemType;
    private javax.swing.JComboBox<String> cbx_Refinable;
    private javax.swing.JComboBox<String> cbx_ShieldType;
    private javax.swing.JComboBox<String> cbx_Slot;
    private javax.swing.JComboBox<String> cbx_WeaponLVL;
    private javax.swing.JComboBox<String> cbx_WeaponType;
    private javax.swing.JCheckBox ckb_3rdJobs;
    private javax.swing.JCheckBox ckb_Accessory1;
    private javax.swing.JCheckBox ckb_Accessory2;
    private javax.swing.JCheckBox ckb_Acolyte;
    private javax.swing.JCheckBox ckb_Alchemist;
    private javax.swing.JCheckBox ckb_Archer;
    private javax.swing.JCheckBox ckb_Armor;
    private javax.swing.JCheckBox ckb_Assassin;
    private javax.swing.JCheckBox ckb_Baby3rdJobs;
    private javax.swing.JCheckBox ckb_BabyJobs;
    private javax.swing.JCheckBox ckb_BardDancer;
    private javax.swing.JCheckBox ckb_BlackSmith;
    private javax.swing.JCheckBox ckb_CostumeLower;
    private javax.swing.JCheckBox ckb_CostumeMiddle;
    private javax.swing.JCheckBox ckb_CostumeUpper;
    private javax.swing.JCheckBox ckb_Crusader;
    private javax.swing.JCheckBox ckb_EveryJob;
    private javax.swing.JCheckBox ckb_Gunslinger;
    private javax.swing.JCheckBox ckb_Hunter;
    private javax.swing.JCheckBox ckb_KagerouOboro;
    private javax.swing.JCheckBox ckb_Knight;
    private javax.swing.JCheckBox ckb_LeftHand;
    private javax.swing.JCheckBox ckb_LowerHeadGear;
    private javax.swing.JCheckBox ckb_Mage;
    private javax.swing.JCheckBox ckb_Mantle;
    private javax.swing.JCheckBox ckb_Merchant;
    private javax.swing.JCheckBox ckb_MiddleHeadGear;
    private javax.swing.JCheckBox ckb_Monk;
    private javax.swing.JCheckBox ckb_Ninja;
    private javax.swing.JCheckBox ckb_NormalJobs;
    private javax.swing.JCheckBox ckb_Novice;
    private javax.swing.JCheckBox ckb_Priest;
    private javax.swing.JCheckBox ckb_Rebelion;
    private javax.swing.JCheckBox ckb_RightHand;
    private javax.swing.JCheckBox ckb_Rogue;
    private javax.swing.JCheckBox ckb_Sage;
    private javax.swing.JCheckBox ckb_ShadowAccessory1;
    private javax.swing.JCheckBox ckb_ShadowAccessory2;
    private javax.swing.JCheckBox ckb_ShadowArmor;
    private javax.swing.JCheckBox ckb_ShadowMantle;
    private javax.swing.JCheckBox ckb_ShadowShield;
    private javax.swing.JCheckBox ckb_ShadowShoes;
    private javax.swing.JCheckBox ckb_ShadowWeapon;
    private javax.swing.JCheckBox ckb_Shoes;
    private javax.swing.JCheckBox ckb_SoulLinker;
    private javax.swing.JCheckBox ckb_StarGladiator;
    private javax.swing.JCheckBox ckb_Swordman;
    private javax.swing.JCheckBox ckb_Taekwon;
    private javax.swing.JCheckBox ckb_Thief;
    private javax.swing.JCheckBox ckb_Upper3rdJobs;
    private javax.swing.JCheckBox ckb_UpperHeadGear;
    private javax.swing.JCheckBox ckb_UpperJobs;
    private javax.swing.JCheckBox ckb_Wizard;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JLabel lbl_AegisName;
    private javax.swing.JLabel lbl_AmmoType;
    private javax.swing.JLabel lbl_Attack;
    private javax.swing.JLabel lbl_Buy;
    private javax.swing.JLabel lbl_Collection;
    private javax.swing.JLabel lbl_Defense;
    private javax.swing.JLabel lbl_DropSpr;
    private javax.swing.JLabel lbl_EquipLevel;
    private javax.swing.JLabel lbl_FemaleAct;
    private javax.swing.JLabel lbl_FemaleSpr;
    private javax.swing.JLabel lbl_Gender;
    private javax.swing.JLabel lbl_ID;
    private javax.swing.JLabel lbl_IdentifiedDesc;
    private javax.swing.JLabel lbl_IdentifiedName;
    private javax.swing.JLabel lbl_ImageItem;
    private javax.swing.JLabel lbl_ItemType;
    private javax.swing.JLabel lbl_Male_Act;
    private javax.swing.JLabel lbl_Male_Spr;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_Normal;
    private javax.swing.JLabel lbl_OnEquip;
    private javax.swing.JLabel lbl_OnUnequip;
    private javax.swing.JLabel lbl_Range;
    private javax.swing.JLabel lbl_Refinable;
    private javax.swing.JLabel lbl_Sell;
    private javax.swing.JLabel lbl_ShieldType;
    private javax.swing.JLabel lbl_Slot;
    private javax.swing.JLabel lbl_UnidentifiedDesc;
    private javax.swing.JLabel lbl_UnidentifiedName;
    private javax.swing.JLabel lbl_ViwerID;
    private javax.swing.JLabel lbl_WeaponLVL;
    private javax.swing.JLabel lbl_WeaponType;
    private javax.swing.JLabel lbl_Weight;
    private javax.swing.JMenuItem mei_English;
    private javax.swing.JMenuItem mei_Exit;
    private javax.swing.JMenuItem mei_New;
    private javax.swing.JMenuItem mei_Save;
    private javax.swing.JMenuItem mei_portugues;
    private javax.swing.JMenu men_File;
    private javax.swing.JMenu men_Language;
    private javax.swing.JPanel pan_Data;
    private javax.swing.JPanel pan_EquipedBy;
    private javax.swing.JPanel pan_Item;
    private javax.swing.JPanel pan_Script;
    private javax.swing.JScrollPane slp_IdenfifiedDesc;
    private javax.swing.JScrollPane slp_UnidenfifiedDesc;
    private javax.swing.JTabbedPane tab_Panel;
    private javax.swing.JTextArea txa_IdenfifiedDesc;
    private javax.swing.JTextArea txa_UnidenfifiedDesc;
    private javax.swing.JTextField txf_AegisName;
    private javax.swing.JTextField txf_Attack;
    private javax.swing.JTextField txf_Buy;
    private javax.swing.JTextField txf_Collection;
    private javax.swing.JTextField txf_Defense;
    private javax.swing.JTextField txf_DropSpr;
    private javax.swing.JTextField txf_FemaleAct;
    private javax.swing.JTextField txf_FemaleSpr;
    private javax.swing.JTextField txf_ID;
    private javax.swing.JTextField txf_IdentifiedName;
    private javax.swing.JTextField txf_ImageItem;
    private javax.swing.JTextField txf_MaleAct;
    private javax.swing.JTextField txf_MaleSpr;
    private javax.swing.JTextField txf_Name;
    private javax.swing.JTextField txf_OnEquip;
    private javax.swing.JTextField txf_OnUnequip;
    private javax.swing.JTextField txf_Range;
    private javax.swing.JTextField txf_Script;
    private javax.swing.JTextField txf_Sell;
    private javax.swing.JTextField txf_UnidentifiedName;
    private javax.swing.JTextField txf_ViwerID;
    private javax.swing.JTextField txf_WeaponLVL;
    private javax.swing.JTextField txf_Weight;
    // End of variables declaration//GEN-END:variables
}
