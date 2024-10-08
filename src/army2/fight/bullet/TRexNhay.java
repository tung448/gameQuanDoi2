/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package army2.fight.bullet;

import army2.fight.Bullet;
import army2.fight.BulletManager;
import army2.fight.Player;
import army2.fight.boss.TRex;

/**
 *
 * @author ASD
 */
public class TRexNhay extends Bullet {

    public TRexNhay(BulletManager bullMNG, byte bullId, int satThuong, Player pl) {
        super(bullMNG, bullId, satThuong, pl, pl.X, pl.Y-12, 0, 0, 0, 0);
    }
    
    @Override
    public void nextXY() {
        this.collect = true;
        this.XArray.add((short)X);
        this.YArray.add((short)Y);
        this.X += 2;
        this.XArray.add((short)X);
        this.YArray.add((short)Y);
        ((TRex)pl).rexAction();
        if(this.isCanCollision)
            fm.mapMNG.collision(X, Y, this);
    }

}
